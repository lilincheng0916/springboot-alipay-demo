package com.example.springbootalipaydemo.alipay;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.example.springbootalipaydemo.alipay.dto.AlipayDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * 支付宝主页点击付款
 *
 * @ClassName: ALiPayController
 * @Description:
 * @author lilincheng
 * @time: 2021/4/19 上午11:41
 */

@Controller
@RequestMapping("/alipay")
public class ALiPayController {
    @RequestMapping("/alipayTradePagePay")
    public String payTradePagePay(HttpServletRequest request){
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        AlipayDTO dto=new AlipayDTO();
        dto.setOutTradeNo( UUID.randomUUID().toString());
        //付款金额，必填
        dto.setTotalAmount(new BigDecimal(0.01));
        //订单名称，必填
        dto.setSubject("");
        //商品描述，可空
        dto.setBody("11");
        try {
            alipayRequest.setBizContent("{\"out_trade_no\":\""+ dto.getOutTradeNo() +"\","
                    + "\"total_amount\":\""+ dto.getTotalAmount() +"\","
                    + "\"subject\":\""+ dto.getSubject() +"\","
                    + "\"body\":\""+ dto.getBody() +"\","
                    + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
            //请求
            String result = alipayClient.pageExecute(alipayRequest).getBody();
            //输出 pay页面取出
            request.setAttribute("result",result);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "pay";
    }
}


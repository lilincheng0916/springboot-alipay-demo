package com.example.springbootalipaydemo.alipay.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 支付实体对象
 * @author lilincheng
 * @ClassName: AlipayBean
 * @Description:
 * @date 2021/4/19 下午6:41
 */
@Data
@Accessors(chain = true)
public class AlipayDTO {

    /**
     * 短信模板id
     */
    @NotNull(message = "短信模板id不能为空！")
    private Long pkSmsTemplate;

    /**
     * 店铺id
     */
    private String shopId;
    /**
     * 商户订单号，必填
     */
    private String outTradeNo;
    /**
     * 订单名称，必填
     */
    @NotNull(message = "订单名称不能为空！")
    private String subject;
    /**
     * 付款金额，必填
     */
    @NotNull(message = "付款金额不能为空！")
    private BigDecimal totalAmount;
    /**
     * 商品描述，可空
     */
    private String body;
    /**
     * 超时时间参数
     */
    private String timeout_express="10m";
    private String product_code="FAST_INSTANT_TRADE_PAY";

    /**
     * 单据类型
     */
    private int billtype;

    @NotNull(message = "数量不能为空")
    private int buyNumber;
}



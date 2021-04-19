package com.example.springbootalipaydemo.alipay;

/**
 * @ClassName: AlipayConfig
 * 功能：基础配置类
 * 详细：设置帐户有关信息及返回路径
 * 说明：宝接口使用，只是提供一个参考。
 * @Description:
 * @author lilincheng
 * @time: 2021/4/19 上午11:40
 */
public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000117641174";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCOV2/g1LSoFtmtkGfPX2TDMMZe+aeBTzC9PCXEHLrrE6V2M022+Yl5i4apNfVYIiZirHJvgCLj+Wxyv+2+EYQEXJ5zrUx+mtoo1QQ+UeEZpt6fU2K0wpqD7SfWnP4VA5esGGhr7ZJmnFY+pf9dGOaVRufqFljrJmBoq6TlvB6qsc98XoMxoltJ3odU4LBijad7entp0ch/R94xwW3U+WrIdVdYSEgJZJOKUw65+uImkuLJwLinVJoUI4qNVDvgSl1t6Prdwqdi96/wI60atcqAeRtQnh3JIEmdFRdnM9PAAB782/5SGNpLFOcM0g40TRR59XYEr3FQfswi0PGK5Q7RAgMBAAECggEAWdQmX738sKOTBiy+xqkN/vy2A9QL+NgQCyx9LPFwqNACOMERx2pdbt41wm2yAseyb80ifulfm32aCiTDlZKaPOJygNAaGUACc4hTID0uELE1h1jpTugM+TreTFtRIdPdkRbqN0p7fNQmvWym5orDYeuYiitGPEhAyW2hJ/Z7Z/7MJpXrlzc1n8H7a02iNPlzIyfAl/k0VshqT1sFerXHjX7ExU2RkzF5JaEDvCA+ke2Nr7YsnP1YXe7diSpf/vb21YjWAx9KqJkIOfmSjh8PoC4ICgNDMLwGQ0ErbMLdMiO0WGuM06QYSms2of6MegkWYr2sMtrlTS6oA0DbjBMfDQKBgQD1wC9OQQLbws69TgXxTW9zHcY49l0j2rNabFElqdy8BPr1OioKqvhY9kWVSuCPD/z1Mdlu/ZjWh/QBniGYHV/9a1ysoyESofUNwDhvIKYmqrLFExkieLohLy39khm/Zxkcn//hSKb0yE6tHkSA8o6r+dgwi6In6nUnfCvUGvlZ4wKBgQCURy4Sr22ZBe868AbKCNVjX4Mgk5Gu7I/NxUT5O5ZiDYkv+XK+CSQGGF5ztr4bJQTvyGtTE5iilFrKtlCiTgEvctmUpkltvBdlGEHFWPhf27Tkl0MaeRnpxOo49fxpmRpE9P20E67j6rov3057Yi43Z58OtyioGCpOFqeZKeLiuwKBgQCQmoR7dG+dJnUGGToP8fOpdhSkgfruVQsCIwhgtCHJlNiioZYJbu7xUgBBx6x5IfxDvxBlad2cJqViqky0OFy6PolqoBae4yPR8pCCe2CpEfpdUk6Q5R8I1b0nHuf9o0m4eUFUq65qDM+WuF+wzIk9EqeucQt6l1BWao9ToIem5wKBgBNhcl4y28pigjBb6ydBHFMOyt7ZKvOILAujOy6wYSmTx1ij7CF2pGS/jqjlO9fkcM6+jXigWRT2+x7/0W5Fb9Y51sKdMX/MU+p8zyvyQxSUbQJr2vN83Kw3dr3XORS8VDirJPYClJtptMhJEcMCxDOtsZaEziWacv0d7O4SEXu9AoGAWQZG7iE1q1cCQCB8SWfg+FGsrwdNshsZkE4kbOXhbOO7jHFP2/m2tJiHcfPL/lzGP+79W7qIQSFaqZMc0vlL61X1nsKyOtIIHebqDBBwLPJNIHHY8SSRmR1XTbpm+52bOsRPZABYPy78ytN1lxDU/AACkT0q1iXyezPwIEO2Esg=";


    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAs9LyDkg2AB8f9CnAvW1mLVEMUHYN14GFdsEQzhq5IJGiHqA0IhUJrWN/3gAk9vr/DhOI+isV//nOLnsZ4/aMoGt5NfFacikJXoiTpWqr1Zo7c0GI/jy+Xg8zFp0X+RJaMe2lEyxI//NHyfMYdgJ+v06MYktkfODO6d0MNCIn98v83buDiTJ/+Crz9E5QaeN6r0CKWYE8QgscGuPx7WyLJxBJyKRRiaHuaRZN5uj7Ro9PxaU+5OUm+VakVEODxCkZ4dI8KH4/NCvnHYqEXcjbIr/5VcWG8WHckyPl2qaOlZNGhmCGsh0Ya49iPWCCn4Rk+Es60lfDSmqLXQlnRAvv4wIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:9888/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:9888/payResult/return_url";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    // 正式
    //public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
    // 测试
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

}



package com.example.springbootalipaydemo.alipay;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lilincheng
 * @ClassName: IndexController
 * @Description:
 * @date 2021/4/19 上午10:17
 */
@Controller
@RequestMapping("/alipay")
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
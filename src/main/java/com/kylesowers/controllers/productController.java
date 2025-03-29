package com.kylesowers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class productController {

    @RequestMapping("/product")
    public String getProduct() {
        return "product";
    }
}

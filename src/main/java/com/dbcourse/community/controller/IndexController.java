package com.dbcourse.community.controller;

import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 1175482512 on 2021/11/3.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index()
    {
        return "index";
    }
}

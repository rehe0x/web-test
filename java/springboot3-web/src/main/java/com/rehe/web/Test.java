package com.rehe.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiech
 * @description
 * @date 2024/7/3
 */
@RestController
@RequestMapping("")
public class Test {

    @GetMapping("")
    public String test(){
        return "Hello World";
    }
}

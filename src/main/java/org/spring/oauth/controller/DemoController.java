package org.spring.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author llg
 * @description demo
 * @date 2019/11/11
 */
@RestController
public class DemoController {

    @GetMapping("/demo")
    public String get(String name){
        return name;
    }
}

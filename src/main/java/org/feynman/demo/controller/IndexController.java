package org.feynman.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("indexController")
@Slf4j
public class IndexController {
    @RequestMapping("index")
    public void index(){
      log.info("进入index方法");
    }
}

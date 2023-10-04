package com.Task9.capybaralist.controller;


import com.Task9.capybaralist.Service.CapybaraService;
import com.Task9.capybaralist.entity.Zoo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CapybaraController {


    private CapybaraService capybaraService;

    public CapybaraController(CapybaraService capybaraService){
        this.capybaraService = capybaraService;
    }



//    動物園（zoosテーブル）の情報を取得

    @GetMapping("/zoos")
    public List<Zoo> zoos(){
        List<Zoo> zoos = capybaraService.findAll();
        return zoos;
    }





}

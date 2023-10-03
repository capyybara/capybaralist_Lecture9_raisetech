package com.Task9.capybaralist.controller;

import com.Task9.capybaralist.mapper.CapybaraMapper;
import com.Task9.capybaralist.Service.CapybaraService;
import com.Task9.capybaralist.entity.Zoo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CapybaraController {

////    講義資料をみて作成したもの
//    private final CapybaraService capybaraService;
//
//    public CapybaraController(CapybaraService capybaraService){
//        this.capybaraService = capybaraService;
//    }



//    動画をみながら模写したもの
    private final CapybaraMapper capybaraMapper;
    public CapybaraController(CapybaraMapper capybaraMapper){
        this.capybaraMapper = capybaraMapper;
    }

    @GetMapping("/zoos")
    public List<Zoo> zoos(){
        List<Zoo> zoos = capybaraMapper.findAll();
        return zoos;
    }


}

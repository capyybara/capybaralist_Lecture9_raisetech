package com.Task9.capybaralist.controller;


import com.Task9.capybaralist.Service.ZooService;

import com.Task9.capybaralist.entity.Zoo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.Task9.capybaralist.mapper.CapybaraMapper;
//import com.Task9.capybaralist.Service.capy_practice.CapybaraService;
//import com.Task9.capybaralist.entity.Capybara;
//import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
public class ZooCapyController {

//    Controller --> Service --> Mapper の流れで処理を行う


//    講義をみて作成したもの
    private ZooService zooService;

    public ZooCapyController(ZooService zooService) {
        this.zooService = zooService;
    }

    @GetMapping("/zoos")
    public List<Zoo> zoos(){
        List<Zoo> zoos = zooService.findAll();
        return zoos;
    }

//
//    private CapybaraService capybaraService;
//    public CapybaraController(CapybaraService capybaraService) {this.capybaraService =capybaraService;}
//
//    @GetMapping("/capybaras/{zoo_id}")
//    public Capybara capybara(@PathVariable("zoo_id") int zoo_id) throws Exception{
//          return capybaraService.findById(zoo_id);
//    }








//    動画をみながら模写したもの
//    private final CapybaraMapper capybaraMapper;
//    public CapybaraController(CapybaraMapper capybaraMapper){
//        this.capybaraMapper = capybaraMapper;
//    }
//
//    @GetMapping("/zoos")
//    public List<Zoo> zoos(){
//        List<Zoo> zoos = capybaraMapper.findAll();
//        return zoos;
//    }


}

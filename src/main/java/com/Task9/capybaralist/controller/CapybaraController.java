package com.Task9.capybaralist.controller;


import com.Task9.capybaralist.Service.CapybaraNotFoundException;
import com.Task9.capybaralist.Service.CapybaraService;
import com.Task9.capybaralist.entity.Capybara;
import com.Task9.capybaralist.entity.Zoo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

//特定のzoo_idのカピバラのデータ取得
    @GetMapping("/capybara/{zoo_id}")
    public Optional<Capybara> capybara (@PathVariable("zoo_id") int zoo_id) throws Exception {
        return  capybaraService.findById(zoo_id);
    }


//例外処理に関するメソッド
    @ExceptionHandler(value = CapybaraNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleCapybaraNotFoundException(
            CapybaraNotFoundException e, HttpServletRequest request) {
        Map<String, String> body = new HashMap<>();
        body.put("timestamp", ZonedDateTime.now().toString());
        body.put("status", String.valueOf(HttpStatus.NOT_FOUND.value()));
        body.put("error", HttpStatus.NOT_FOUND.getReasonPhrase());
        body.put("message", e.getMessage());
        body.put("path", request.getRequestURI());
        return new ResponseEntity(body, HttpStatus.NOT_FOUND);
    }


}

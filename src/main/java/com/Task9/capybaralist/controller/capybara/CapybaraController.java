package com.Task9.capybaralist.controller.capybara;

import com.Task9.capybaralist.Service.capy_practice.CapybaraService;
import com.Task9.capybaralist.entity.Capybara;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapybaraController {

    private CapybaraService capybaraService;

    public CapybaraController(CapybaraService capybaraService){this.capybaraService = capybaraService;}

    @GetMapping("/capybaras/{zoo_id}")
    public Capybara getCapybara(@PathVariable("zoo_id") int zoo_id){
          return capybaraService.findById(zoo_id);
    }


}

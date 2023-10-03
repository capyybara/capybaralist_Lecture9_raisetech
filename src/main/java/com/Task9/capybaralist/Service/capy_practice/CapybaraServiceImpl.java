package com.Task9.capybaralist.Service.capy_practice;

import com.Task9.capybaralist.entity.Capybara;
import com.Task9.capybaralist.mapper.CapybaraMapper;




public class CapybaraServiceImpl implements CapybaraService {

    private CapybaraMapper capybaraMapper;

    public CapybaraServiceImpl(CapybaraMapper capybaraMapper) {
        this.capybaraMapper = capybaraMapper;
    }

    @Override
    public Capybara findById(int zoo_id) {
        return this.capybaraMapper.findById(zoo_id);
    }





}

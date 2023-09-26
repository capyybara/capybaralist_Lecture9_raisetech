package com.Task9.capybaralist;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapybaraServiceImpl implements CapybaraService{

    private  CapybaraMapper capybaraMapper;
    public CapybaraServiceImpl (CapybaraMapper capybaraMapper){
        this.capybaraMapper = capybaraMapper;
    }

    @Override
    public List<Zoo> findAll() {
        return capybaraMapper.findAll();
    }

}

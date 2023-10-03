package com.Task9.capybaralist.Service;

import com.Task9.capybaralist.entity.Capybara;
import com.Task9.capybaralist.mapper.CapybaraMapper;
import com.Task9.capybaralist.entity.Zoo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZooServiceImpl implements ZooService {

    private CapybaraMapper capybaraMapper;

    public ZooServiceImpl(CapybaraMapper capybaraMapper) {
        this.capybaraMapper = capybaraMapper;
    }

    @Override
    public List<Zoo> findAll() {
        return capybaraMapper.findAll();
    }



}

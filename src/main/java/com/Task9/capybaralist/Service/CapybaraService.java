package com.Task9.capybaralist.Service;

import com.Task9.capybaralist.entity.Zoo;

import java.util.List;

public interface CapybaraService {
    List<Zoo> findAll();

    Zoo findById(int id)throws Exception;


}

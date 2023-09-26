package com.Task9.capybaralist;

import java.util.List;

public interface CapybaraService {
    List<Zoo> findAll();

    Zoo findById(int id)throws Exception;


}

package com.Task9.capybaralist.Service.capy_practice;

import com.Task9.capybaralist.entity.Capybara;


public interface CapybaraService {

    Capybara findById(int zoo_id);

//    idに指定した名前が存在しない場合に、例外をthrow
//    void create(String capybara_name);
// id に指定した名前が存在しない場合に、例外をthrow
//    void update(int zoo_id, String capybara_name) throws Exception;

}

package com.Task9.capybaralist.Service;


import com.Task9.capybaralist.entity.Capybara;
import com.Task9.capybaralist.entity.Zoo;
import java.util.List;
import java.util.Optional;


public interface CapybaraService {
    List<Zoo> findAll();

    Optional<Capybara> findById(int zooId);



// create / update を追加する際には必要？
//    void create (String capybara);
//    void update (int zoo_id, String capybara) throws  Exception;


}

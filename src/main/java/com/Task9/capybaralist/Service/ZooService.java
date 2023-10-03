package com.Task9.capybaralist.Service;

import com.Task9.capybaralist.entity.Zoo;

import java.util.List;

public interface ZooService {

    List<Zoo> findAll();



//    idに指定した名前が存在しない場合に、例外をthrow
//    Zoo findById(int zoo_id)throws Exception;
//    void create(String zooname, String prefecture);

// id に指定した名前が存在しない場合に、例外をthrow
//    void update(int zoo_id, String zooname) throws Exception;


}

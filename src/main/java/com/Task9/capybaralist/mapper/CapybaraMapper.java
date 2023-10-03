package com.Task9.capybaralist.mapper;

import com.Task9.capybaralist.entity.Capybara;
import com.Task9.capybaralist.entity.Zoo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CapybaraMapper {

    @Select("SELECT * FROM zoos")
    List<Zoo> findAll();


    @Select("SELECT * FROM capybara WHERE zoo_id = #{zoo_id}")
    Capybara findById(int zoo_id);




}


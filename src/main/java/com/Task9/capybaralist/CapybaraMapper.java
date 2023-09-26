package com.Task9.capybaralist;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CapybaraMapper {

    @Select("SELECT * FROM zoos")
    List<Zoo> findAll();


    @Select("SELECT * FROM capybara WHERE zoo_id = #{zoo_id}")
    Optional<Capybara> findById(int zoo_id);




}


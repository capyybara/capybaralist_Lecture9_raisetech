package com.Task9.capybaralist.Service;


import com.Task9.capybaralist.mapper.CapybaraMapper;
import com.Task9.capybaralist.entity.Zoo;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CapybaraServiceImpl implements CapybaraService{

    private CapybaraMapper capybaraMapper;
    public CapybaraServiceImpl (CapybaraMapper capybaraMapper){
        this.capybaraMapper = capybaraMapper;
    }

    @Override
    public List<Zoo> findAll() {
        return capybaraMapper.findAll();
    }


//  カピバラテーブルから、例外をハンドリングしてデータ取得したい
//    @Override
//    public Optional<Capybara> findById(int zoo_id) throws Exception {
//        Optional<Capybara> capybara = capybaraMapper.findById(zoo_id);
//        if capybara isEmpty(){
//            throw new NotFoundException("見つかりません");
//        }
//    }



}

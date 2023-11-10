package com.Task9.capybaralist.Service;


import com.Task9.capybaralist.entity.Capybara;
import com.Task9.capybaralist.mapper.CapybaraMapper;
import com.Task9.capybaralist.entity.Zoo;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CapybaraServiceImpl implements CapybaraService {

    private CapybaraMapper capybaraMapper;

    public CapybaraServiceImpl(CapybaraMapper capybaraMapper) {
        this.capybaraMapper = capybaraMapper;
    }

    @Override
    public List<Zoo> findAll() {
        return capybaraMapper.findAll();
    }

//    特定のzoo_idのカピバラのデータを抽出
    @Override
    public Optional<Capybara> findById(int zoo_id) {
       Capybara capybara = capybaraMapper.findById(zoo_id).orElseThrow(()->new CapybaraNotFoundException("Capybara is not found"));
        return  Optional.of(capybara);
    }

//    @Override
//    public Optional<Capybara> findById(int zoo_id) throws Exception {
//        Optional<Capybara> capybara = capybaraMapper.findById(zoo_id);
//        if (capybara .isEmpty()){
//            throw new CapybaraNotFoundException("Capybara is not found");
//        }else {
//            return capybara;
//        }
//    }

}

package com.flamingo.service;

import com.flamingo.repository.GirlRepository;
import com.flamingo.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setName("chenxd");
        girlA.setAge(23);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setName("liwb");
        girlB.setAge(23);
        girlRepository.save(girlB);
    }
}

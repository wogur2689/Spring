package com.example.abcmysql.service;

import com.example.abcmysql.Entity.AbcEntity;
import com.example.abcmysql.dto.Abc;
import com.example.abcmysql.repository.AbcRepository;
import com.example.abcmysql.util.AbcOkhttp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@AllArgsConstructor
@Service
public class AbcService {

    private AbcRepository abcRepository;

    @Transactional
    public void saveData(Abc abc) {
        abcRepository.save(abc.toEntity());

        System.out.println("문제 없이 실행!");
    }

    @Transactional
    public void send() throws IOException {
        Abc abc = new Abc();
        List<AbcEntity> abcEntities = abcRepository.findAll();
        for(AbcEntity abcEntity : abcEntities) {
            System.out.println(abcEntity.getId() + " " + abcEntity.getName() + " " + abcEntity.getPassword());
            abc = Abc.builder()
                    .id(abcEntity.getId())
                    .name(abcEntity.getName())
                    .password(abcEntity.getPassword())
                    .build();
        }
        AbcOkhttp abcOkhttp = new AbcOkhttp();
        abcOkhttp.RestApi(abc);
    }
}

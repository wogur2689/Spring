package com.example.abcpostgrasql.service;

import com.example.abcpostgrasql.dto.Abc;
import com.example.abcpostgrasql.entity.AbcEntity;
import com.example.abcpostgrasql.repository.AbcRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
    public List<Abc> findData() {
        System.out.println(abcRepository.findAll());
        List<AbcEntity> abcEntities = abcRepository.findAll();
        List<Abc> abcList = new ArrayList<>();
        for(AbcEntity abcEntity : abcEntities) {
            Abc abc = Abc.builder()
                    .id(abcEntity.getId())
                    .name(abcEntity.getName())
                    .password(abcEntity.getPassword())
                    .build();
            System.out.println(abcEntity.getName());
            abcList.add(abc);
        }
        return abcList;
    }

}

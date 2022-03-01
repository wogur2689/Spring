package com.example.abcmysql.dto;

import com.example.abcmysql.Entity.AbcEntity;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Abc implements Serializable {
    private Long id;
    private String name;
    private String password;

    public AbcEntity toEntity() {
        AbcEntity abcEntity = AbcEntity.builder()
                .id(id)
                .name(name)
                .password(password)
                .build();
        return abcEntity;
    }

    @Builder
    public Abc(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\" : " + id +
                ", \"name\" : \"" + name + "\"" +
                ", \"password\" : \""+ password + "\"" +
                '}';
    }
}

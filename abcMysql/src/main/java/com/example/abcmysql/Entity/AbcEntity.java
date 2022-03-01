package com.example.abcmysql.Entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "member")
public class AbcEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                                   //아이디(기본키)

    @Column
    private String name;                                 //이름
    @Column
    private String password;                             //비밀번호

    @Builder
    public AbcEntity(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

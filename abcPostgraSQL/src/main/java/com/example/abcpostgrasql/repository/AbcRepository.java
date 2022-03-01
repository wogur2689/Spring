package com.example.abcpostgrasql.repository;

import com.example.abcpostgrasql.entity.AbcEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbcRepository extends JpaRepository<AbcEntity, Long> {

}

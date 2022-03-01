package com.example.abcmysql.repository;

import com.example.abcmysql.Entity.AbcEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbcRepository extends JpaRepository<AbcEntity, Long> {

}

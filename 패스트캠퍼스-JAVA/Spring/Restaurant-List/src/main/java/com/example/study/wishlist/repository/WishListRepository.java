package com.example.study.wishlist.repository;

import com.example.study.db.MemoryDbRepositoryAbstract;
import com.example.study.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}

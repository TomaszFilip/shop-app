package com.example.shopapp.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item> findAllByCustomer_Id(Integer id);
}

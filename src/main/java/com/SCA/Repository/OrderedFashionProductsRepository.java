package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.OrderedFashionProducts;

@Repository
public interface OrderedFashionProductsRepository extends JpaRepository<OrderedFashionProducts, Integer>{

}

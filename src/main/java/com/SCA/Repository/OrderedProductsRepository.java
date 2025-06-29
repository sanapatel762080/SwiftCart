package com.SCA.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.OrderedProducts;

@Repository
public interface OrderedProductsRepository extends CrudRepository<OrderedProducts, Integer>{

}

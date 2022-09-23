package com.devsuperior.projectproduct.repositories;

import com.devsuperior.projectproduct.entities.Category;
import com.devsuperior.projectproduct.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductRepository {

    private Map<Long, Product> map = new HashMap<>();

    public void save(Product obj){
        map.put(obj.getId(), obj);
    }

    public Product findById(Long id){
        return map.get(id);
    }

    public List<Product> findAll(){
        return new ArrayList<Product>(map.values());
    }
}

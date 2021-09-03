package com.noppadon.flowershop.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.noppadon.flowershop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query("SELECT p FROM Product p WHERE CONCAT(p.flowername,' ',p.flowerdescription,' ',p.flowerprice) LIKE %?1%")
	public List<Product> search(String keyword);
}

/**
 * 
 */
package com.xyztechnology.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyztechnology.product.Product;

/**
 * @author Saurabh Sinha
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

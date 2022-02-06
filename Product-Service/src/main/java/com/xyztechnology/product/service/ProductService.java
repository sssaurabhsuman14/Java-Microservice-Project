/**
 * 
 */
package com.xyztechnology.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xyztechnology.product.Product;

/**
 * @author Saurabh Sinha
 *
 */
@Service
public interface ProductService {

	public List<Product> getProducts();

	public Product getProduct(Long id);

}

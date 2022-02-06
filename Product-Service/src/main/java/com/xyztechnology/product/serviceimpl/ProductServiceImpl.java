/**
 * 
 */
package com.xyztechnology.product.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyztechnology.product.Product;
import com.xyztechnology.product.repository.ProductRepository;
import com.xyztechnology.product.service.ProductService;

/**
 * @author Saurabh Sinha
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProduct(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

}

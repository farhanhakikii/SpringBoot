package com.cimb.tokolapak.dao;
//repository / cetakan untuk method yg berhub dg database scr langsung

import org.springframework.data.repository.CrudRepository;

import com.cimb.tokolapak.entity.Product;

// Interface itu cetakan class
// CrudRepository dari jpa
// <Entity, tipe data PK nya>
public interface ProductRepo extends CrudRepository<Product, Integer> {
	public Product findByProductName(String productName);
}

package com.babooin.testapp.dao;

import java.util.List;
import java.util.Optional;


public interface CrudRepository<T, U> {
	
	Optional<T> findById(U id);
	List<T> findAll();
	void save(T entity);
	void deleteById(U id);
	void saveOrUpdate(T entity);
	void delete(T entity);

}

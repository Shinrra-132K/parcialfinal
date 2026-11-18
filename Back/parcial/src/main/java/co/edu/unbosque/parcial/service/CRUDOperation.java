package co.edu.unbosque.parcial.service;

import java.util.List;

public interface CRUDOperation<T> {
	
	public int create(T data);
	
	public List<T> getAll();
	
	public Long count();
	
	public boolean exist(Long id);


}

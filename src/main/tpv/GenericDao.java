package main.tpv;

import java.util.List;

public interface GenericDao<T, ID> {

	void create();

	T read(ID id);

	void update(T entity);

	void deleteById(ID id);

	List<T> findAll();

}

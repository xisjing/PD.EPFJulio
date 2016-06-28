package main.tpv;

import java.util.List;

public interface ComandoDao extends GenericDao<Producto, Integer> {
	
   Producto findByName(String productoName);
   
   List<String> findAllNames();
}

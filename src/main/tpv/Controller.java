package main.tpv;

import java.util.List;

public class Controller {
	
	public void CreateProducto(String name,float precio){
		
		DaoFactory.getFactory().getProductoDao().create();
		
		
	}
	
	 private double precioTotal(List<Comando> comando) {
		   
		   double total = 0;
	        
			for (int i = 0; i < comando.size(); i++) {
	        	total += comando.get(i).getProducto().getPrecio()* ((Comando) comando).getAmount();
	        }
	            
	        return total;
	    }
	
	

}

package main.tpv;

public class Patatas extends Producto {
	
	private int precio;
	
	public Patatas(int precio){
		this.precio = precio;
	}

	@Override
	public int PrecioTotal() {
		
		return precio;
	}

}
package main.tpv;

public class Cafe extends Producto {
	
	private int precio;
	
	public Cafe(int precio){
		this.precio = precio;
	}

	@Override
	public int PrecioTotal() {
		
		return precio;
	}

}

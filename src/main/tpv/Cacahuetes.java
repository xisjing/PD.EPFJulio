package main.tpv;

public class Cacahuetes extends Producto {
	
	private int precio;
	
	public Cacahuetes(int precio){
		this.precio = precio;
	}

	@Override
	public int PrecioTotal() {
		
		return precio;
	}

}

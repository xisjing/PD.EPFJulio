package main.tpv;

public class FantaNaranja extends Producto {
	
	private int precio;
	
	public FantaNaranja(int precio){
		this.precio = precio;
	}

	@Override
	public int PrecioTotal() {
		
		return precio;
	}

}


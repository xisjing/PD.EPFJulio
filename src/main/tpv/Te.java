package main.tpv;

public class Te extends Producto {
	
	private int precio;
	
	public Te(int precio){
		this.precio = precio;
	}

	@Override
	public int PrecioTotal() {
		
		return precio;
	}

}

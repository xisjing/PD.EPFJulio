package main.tpv;

public class CocaCola extends Producto {
	
	private int precio;
	
	public CocaCola(int precio){
		this.precio = precio;
	}

	@Override
	public int PrecioTotal() {
		
		return precio;
	}

}

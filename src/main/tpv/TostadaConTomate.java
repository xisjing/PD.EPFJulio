package main.tpv;

public class TostadaConTomate extends Producto {
	
	private int precio;
	
	public TostadaConTomate(int precio){
		this.precio = precio;
	}

	@Override
	public int PrecioTotal() {
		
		return precio;
	}

}

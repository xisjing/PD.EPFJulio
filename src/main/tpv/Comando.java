package main.tpv;

public class Comando {
	
	private int id;
	
	private Producto producto;
	
	private int amount;
	
	 public void Producto(Producto producto,int amount) {
	        this.producto = producto;
	        this.amount = amount;
	    }

	public Producto getProducto() {
		return producto;
	}


	public float getAmount() {
		return amount;
	}


	public int getId() {
		return id;
	}


}

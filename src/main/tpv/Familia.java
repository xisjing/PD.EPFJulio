package main.tpv;

public abstract class Familia  extends Producto{
	
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	
	public Familia(Producto producto1,Producto producto2,Producto producto3){
		this.producto1 = producto1;
		this.producto2 = producto2;
		this.producto3 = producto3;
	}
	
	@Override
	public  abstract int  PrecioTotal();
	
	public Producto getProducto1() {
		return producto1;
	}
	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}
	
	public Producto getProducto2() {
		return producto2;
	}
	public void setProducto2(Producto producto2) {
		this.producto2 = producto2;
	}
	
	public Producto getProducto3() {
		return producto3;
	}
	public void setProducto3(Producto producto3) {
		this.producto3 = producto3;
	}

	

}

package main.tpv;

public class Familia extends Producto{
	
	private String familia;

	public Familia(String name, float precio,String familia) {
		super(name, precio);
		this.setFamilia(familia);
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}
	
}
package main.tpv;

public class Producto {
	
	private int id;
	
	private String name;
	
	private float precio;
	

	public Producto(String name, float precio) {
		this.name=name;
	}


	public String getName() {
		return name;
	}


	public float getPrecio() {
		return precio;
	}


	public int getId() {
		return id;
	}

}

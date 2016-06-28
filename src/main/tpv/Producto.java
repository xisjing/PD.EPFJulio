package main.tpv;

public class Producto {
	
	private int id;
	
	private String name;
	
	private float precio;
	
	 public Producto(int id,String name,float precio) {
		    this.id = id;
	        this.name = name;
	        this.precio = precio;
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

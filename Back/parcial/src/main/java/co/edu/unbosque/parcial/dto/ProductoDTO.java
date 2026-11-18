package co.edu.unbosque.parcial.dto;

import java.util.Objects;

public class ProductoDTO {
	
	private Long id;
	private String nombre;
	private int cantidad;
	private float precio;
	private String urlImg;
	
	public ProductoDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductoDTO(String nombre, int cantidad, float precio, String urlImg) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.urlImg = urlImg;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(cantidad), id, nombre, Float.valueOf(precio), urlImg);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoDTO other = (ProductoDTO) obj;
		return cantidad == other.cantidad && Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Float.floatToIntBits(precio) == Float.floatToIntBits(other.precio)
				&& Objects.equals(urlImg, other.urlImg);
	}

	@Override
	public String toString() {
		return "ProductoDTO [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
				+ ", urlImg=" + urlImg + "]";
	}
	
	
	

}

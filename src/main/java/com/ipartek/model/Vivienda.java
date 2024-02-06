package com.ipartek.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="viviendas")
public class Vivienda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="calle")
	private String calle;

    @Column(name = "precio")
    private int precio;
    
    @ManyToOne
    private Categoria categoria;

	public Vivienda(int id, String calle, int precio, Categoria categoria_id) {
		super();
		this.id = id;
		this.calle = calle;
		this.precio = precio;
		this.categoria = categoria_id;
	}
	
	public Vivienda() {
		super();
		this.id = 0;
		this.calle = "";
		this.precio = 0;
		this.categoria = new Categoria();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Vivienda [id=" + id + ", calle=" + calle + ", precio=" + precio + ", categoria=" + categoria + "]";
	}
}

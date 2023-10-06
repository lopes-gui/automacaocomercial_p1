package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Compra implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Integer id_compra;
	 private double valor;
	 private Date data;
	 
	 @ManyToOne
	 @JoinColumn(name = "id_pessoa")
	 private Pessoa cliente;

	public Compra() {
		
	}

	public Integer getId_compra() {
		return id_compra;
	}

	public void setId_compra(Integer id_compra) {
		this.id_compra = id_compra;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Compra(Integer id_compra, double valor, Date data, Pessoa cliente) {
		super();
		this.id_compra = id_compra;
		this.valor = valor;
		this.data = data;
		this.cliente = cliente;
	}


}
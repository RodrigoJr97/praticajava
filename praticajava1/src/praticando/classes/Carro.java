package praticando.classes;

import java.util.Objects;

public class Carro {

	private String marca;
	private String modelo;
	private String cor;
	private String codigoIdentificador;
	private int ano;

	public Carro() {
		super();
	}

	public Carro(String marca, String modelo, String cor, String codigoIdentificador, int ano) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.codigoIdentificador = codigoIdentificador;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setCodigoIdentificador(String codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoIdentificador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(codigoIdentificador, other.codigoIdentificador);
	}

	@Override
	public String toString() {
		return "-------------------------------\n"
				+ "Marca: " + getMarca() + "\n"
				+ "Modelo: " + getModelo() + "\n"
				+ "Cor: " + getCor() + "\n"
				+ "Código do Carro: " + getCodigoIdentificador();
	}

}

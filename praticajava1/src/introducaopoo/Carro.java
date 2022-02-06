package introducaopoo;

import java.util.Objects;

public class Carro {

	private String marca;
	private String modelo;
	private String cor;
	private int ano;

	public Carro() {
		super();
	}

	public Carro(String marca, String modelo, String cor, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void apresentacaoCarro() {
		System.out.println("----------------");
		System.out.println("Marca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nCor: " + this.getCor()
				+ "\nAno: " + this.getAno());
		System.out.println("----------------");
	}

	@Override
	public String toString() {
		System.out.println("--------------------------------");
		return "Marca:" + getMarca() +
				", Modelo:" + getModelo() + ", Cor:" + getCor() + ", Ano:" + getAno() +"\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo);
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
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo);
	}

	
	

}

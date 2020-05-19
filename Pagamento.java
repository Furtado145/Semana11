package Semana11;

import javax.swing.SwingUtilities;

import Aula10.Exec01;

public class Pagamento {
	protected String nomeDoPagador;
	protected String cpf;
	protected Double valorASerPago;
	
	public Pagamento(String nomeDoPagador, String cpf, Double valorASerPago) {
		this.nomeDoPagador = nomeDoPagador;
		this.cpf = cpf;
		this.valorASerPago = valorASerPago;
	}

	public String getNomeDoPagador() {
		return nomeDoPagador;
	}

	public void setNomeDoPagador(String nomeDoPagador) {
		this.nomeDoPagador = nomeDoPagador;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getValorASerPago() {
		return valorASerPago;
	}

	public void setValorASerPago(Double valorASerPago) {
		this.valorASerPago = valorASerPago;
	}

	public String toString() {
		return "Nome do pagador: " + nomeDoPagador + ", cpf: " + cpf + ", valor a ser pago: " + valorASerPago + " reais";
	}
		
}

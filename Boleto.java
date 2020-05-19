package Semana11;

public class Boleto extends Pagamento{
	private String numeroDoBoleto;
	
	public Boleto(String nomeDoPagador, String cpf, Double valorASerPago, String numeroDoBoleto) {
		super(nomeDoPagador, cpf, valorASerPago);
		this.numeroDoBoleto = numeroDoBoleto;
	}
	
	public String getNumeroDoBoleto() {
		return numeroDoBoleto;
	}
	
	public void setNumeroDoBoleto(String numeroDoBoleto) {
		this.numeroDoBoleto = numeroDoBoleto;
	}
	
	public String toString() {
		return super.toString() + ", numero do boleto: " + numeroDoBoleto;
	}
}

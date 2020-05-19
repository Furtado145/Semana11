package Semana11;

public class CartaoDeCredito extends Pagamento {
	private String numeroDoCartao;
	
	public CartaoDeCredito(String nomeDoPagador, String cpf, Double valorASerPago, String numeroDoCartao) {
		super(nomeDoPagador, cpf, valorASerPago);
		this.numeroDoCartao = numeroDoCartao;
	}

	public String getNumeroDoCartao() {
		return numeroDoCartao;
	}

	public void setNumeroDoCartao(String numeroDoCartao) {
		this.numeroDoCartao = numeroDoCartao;
	}

	@Override
	public String toString() {
		return super.toString()+ ", numero do cartão: " + numeroDoCartao;
	}

	
}

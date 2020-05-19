package Semana11;

public class Cheque extends Pagamento{
	private String numeroDoCheque;
	
	public Cheque(String nomeDoPagador, String cpf, Double valorASerPago, String numeroDoCheque) {
		super(nomeDoPagador, cpf, valorASerPago);
		this.numeroDoCheque = numeroDoCheque;
	}
	
	public String getNumeroDoCheque() {
		return numeroDoCheque;
	}
	
	public void setNumeroDoCheque(String numeroDoCheque) {
		this.numeroDoCheque = numeroDoCheque;
	}
	
	public String toString() {
		return super.toString() + ", numero do chque:" + numeroDoCheque;
	}
}

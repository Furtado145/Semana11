package Semana11;

public class TestePagamento {

	public static void main(String[] args) {
	
		Pagamento pag = new Pagamento("Felipe", "35503071875", 251.26);
		System.out.println(pag);
		
		CartaoDeCredito cred = new CartaoDeCredito("Helio", "19052399680", 330.00, "3363598546781256");
		System.out.println(cred);
		
		Cheque cheq = new Cheque("Matheus", "40659963897", (double)50, "2020365891");
		System.out.println(cheq);
		
		Boleto bol = new Boleto("Simone", "27740647837", (double)560, "1");
		System.out.println(bol);
	}

}

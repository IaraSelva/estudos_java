package poo;

public class contaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public contaBanco () {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abrirConta(String t) {
		this.setTipo (t);
		this.setStatus(true);
		if(t == "cp") {
			this.setSaldo(150.00);
			System.out.println("Conta aberta. Parab�ns! Voc� acaba de ganhar " + saldo);
		}else
		if(t == "cc") {
			this.setSaldo(50.00);
			System.out.println("Conta aberta. Parab�ns! Voc� acaba de ganhar " + saldo);
		}
	}
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Retire o saldo de sua conta.");
		}
		if(this.getSaldo() < 0) {
			System.out.println("Deposite para regularizar o saldo de sua conta.");
		}
		if(this.getSaldo() == 0) {
			this.setStatus(false);
			System.out.println("Conta fechada.");
		}
		
	}
	public void depositar(double v) {
		if(status == true) {
			System.out.println("Conta aberta. Realizar dep�sito.");
			this.setSaldo(saldo + v);
			System.out.println("Novo Saldo = " + saldo);
		}else {
			System.out.println("Conta fechada. N�o � poss�vel realizar transa��es");
		}
	}
	public void sacar(double v) {
		if(status == true && saldo >= v) {
			System.out.println("Valor dispon�vel para saque: " + saldo);
			saldo = saldo - v;
			System.out.println("Novo Saldo = " + saldo);
		}else if(status == false) {
			System.out.println("Conta fechada. N�o � poss�vel realizar transa��es");
		}else if(saldo < v) {
			System.out.println("Saldo insuficiente para realizar essa transa��o. Saldo dispon�vel = " + saldo);
		}
		
	}
	public void pagarMensal() {
		double tx = 0;
		if (tipo == "cp") {
			tx = 20.00;
		}
		if (tipo == "cc") {
			tx = 12.00;
		}if (status == true && saldo > tx) {
			saldo = saldo -tx;
			System.out.println("Pagamento de taxa realizado.\nNovo saldo = " + saldo);
		}else if (status == false) {
			System.out.println("Conta fechada. N�o � poss�vel realizar transa��es");
		}else if (saldo < 0) {
			System.out.println("Saldo insuficiente para realizar essa transa��o. Saldo dispon�vel = " + saldo);
		}
	}
	
		public void exibirSaldo() {
			System.out.println("Saldo = " + saldo);
	}

}

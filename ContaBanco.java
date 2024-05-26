package metodosSetGet;

public class ContaBanco {
 public int numConta;
 protected String tipo;
 private  String dono;
 private double saldo;
 private boolean status;
 
 public ContaBanco() {
	 
 }
  
  public void status() {
	 
	 System.out.println("________________________________");
	 System.out.println("Conta: " + this.getNumConta());
	 System.out.println("Tipo: " + this.tipo);
	 System.out.println("Dono: " + this.dono);
	 System.out.println("Saldo: " + this.saldo);
	 System.out.println("Status: " + this.status);
	 System.out.println("__________________________________");
	 
  }
  public void abrirConta(String t) {
	  this.setTipo(t);
		 this.setStatus(true);
		 if(this.tipo.equalsIgnoreCase("cc")) {
			 this.saldo = 50;
		 }else  if(this.tipo.equalsIgnoreCase("cp")) {
			this.setSaldo(150);
		 }
		 System.out.println("Conta aberta com sucesso!!!" + this.getDono());
  }
  
  public void fecharConta() {
	if(this.getSaldo() > 0) {
		System.out.println("Conta não pode ser fechada consta valor de " + this.getSaldo());
	}else if(this.getSaldo() < 0) {
		System.out.println("Conta não pode ser fechada consta um debito " + this.getSaldo());
	}else {
		this.setStatus(false);
		System.out.println("Conta fechada com sucesso!!!");
		this.setDono("");
		this.setNumConta(0);
		this.setSaldo(0);
		this.setTipo("");
	
	}
  }
  
  public void depositar(double v) {
	if(this.getStatus()) {
		//this.saldo = this.saldo + v;
		this.setSaldo(this.getSaldo() + v);
		System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
	} else {
		System.out.println("Impossivel sacar de um conta fechada!");
	}
  }
  
  
  public void sacar(double v) {
	 if(this.getStatus()) {
		 if(this.getSaldo() >= v) {
			 this.setSaldo(this.getSaldo() - v);
	      System.out.println("Saque realizado na conta de " + this.getDono());
		 }else{
		  System.out.println("Saldo insuficiente para saque");	 
	  }
    }else {
    	System.out.println("Impossivel sacar conta fechada!");
    }
 } 
  public void pagarMensal() {
   int v = 0;
   if(this.getTipo().equalsIgnoreCase("cc")) {
	   v = 12;
   }else if(this.getTipo().equalsIgnoreCase("cp")) {
	   v = 20;
   }
    if(this.getStatus()) {
    	this.setSaldo(this.getSaldo() - v);
    	System.out.println("Mensalidade paga com sucesso por " + this.getDono());
    }else {
    	System.out.println("Impossivel pagar mensalidade conta fechada!");
    }
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
  
  
}

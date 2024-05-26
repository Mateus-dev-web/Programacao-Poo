package metodosSetGet;

class Carro implements CarroControle {
private	boolean ligado;
private boolean funcionando;
private int velocidade;
	
	


	public Carro() {
		this.setLigado(true);
		this.setFuncionando(true);
		this.setVelocidade(0);
	}

	@Override
	public void acelerador() {
		if(this.getLigado() == true && this.getFuncionando() == true) {
			this.setVelocidade(this.getVelocidade() + 10);
			System.out.println("Velocidade " + this.getVelocidade() + "KM");
		}else {
			System.out.println("Verifique seu carro está desligado ou não está funcionando!");
		}
		
	}

	@Override
	public void freio() {
		if(this.getVelocidade() > 0 && this.getLigado() == true && this.getFuncionando() == true) {
			this.setVelocidade(this.getVelocidade() - 10);
			System.out.println("Velocidade " + this.getVelocidade() + "KM");
		}else {
			System.out.println("Carro não pode ser freiado verifique se está ligado e está funcionando");
		}
		
	}

	@Override
	public void cetaEsquerda() {
	  if(this.getLigado() == true && this.getFuncionando() == true) {
		  System.out.println("Seta a esqueda!");
	  }else {
		  System.out.println("Verifique as condicões do seu carro seta não pode ser virada a esqueda");
	  }
	}

	@Override
	public void cetaDireita() {
		if(this.getLigado() == true && this.getFuncionando() == true) {
			  System.out.println("Seta a direita!");
		  }else {
			  System.out.println("Verifique as condicões do seu carro seta não pode ser virada a direita");
		  }
		
	}


	
private boolean getLigado() {
	return ligado;
}

private void setLigado(boolean ligado) {
	this.ligado = ligado;
}

private boolean getFuncionando() {
	return funcionando;
}

private void setFuncionando(boolean funcionando) {
	this.funcionando = funcionando;
}

private int getVelocidade() {
	return velocidade;
}

private void setVelocidade(int velocidade) {
	this.velocidade = velocidade;
}

}

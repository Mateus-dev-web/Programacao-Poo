package metodosSetGet;

public class Visualizar {
  public static void main(String[] args) {
	ContaBanco p1 = new ContaBanco();
	p1.setNumConta(1111);
	p1.setDono("Jubileu");
	p1.abrirConta("cc");
	p1.status();
	
	ContaBanco p2 = new ContaBanco();
	p2.setNumConta(2222);
	p2.setDono("Creuza");
	p2.abrirConta("cp");
	p2.depositar(150);
	p2.status();
	
	ContaBanco p3 = new ContaBanco();
	p3.setNumConta(2222);
	p3.setDono("Paulo");
	p3.abrirConta("CP");
	p3.fecharConta();
	p3.sacar(150);
	p3.fecharConta();
	p3.status();
  }
}

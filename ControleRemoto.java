package metodosSetGet;
class ControleRemoto implements Controlador{
private  int voulume;
private  boolean ligado;
private  boolean tocando;



public ControleRemoto() {
	this.setVoulume(50);
	this.setLigado(false);
	this.setTocando(false);
}

public void ligar() {
	this.setLigado(true);
}

public void desligar() {
	this.setLigado(false);
}
 
public void abrirMenu() {
	System.out.println("_____Menu_____");
	System.out.println("Está ligado? " +this.getLigado());
	System.out.println("Está tocando? " + this.getTocando());
	System.out.print("Volume? " + this.getVoulume());
    for(int i = 0; i < this.getVoulume(); i += 10) {
    	System.out.print("|");
    }
    
}
 
public void fecharMenu() {
	System.out.println("Fechando menu");
}
 
public void maisVolume() {
	if(this.getLigado() == true){
		this.setVoulume(this.getVoulume() + 10);
	}else {
		System.out.println("Volume não pode ser almentado tv desligada");
	}
}
 
public void menosVolume() {
	if(this.getLigado() == true) {
		this.setVoulume(this.getVoulume() - 10);
	}else {
		System.out.println("Volume não pode ser diminuido tv desligada");
	}
}
 
public void ligarMudo() {
	if(this.getLigado() == true && this.getVoulume() > 0) {
		System.out.println("Teve modo mudo");
	}else {
		System.out.println("Tv já está no mudo");
	}
}
 
public void desligarMudo() {
	if(this.getLigado() == true && this.getVoulume() == 0) {
		this.setVoulume(50);
	}
}
 
public void play() {
	if(this.getLigado() == true && this.getTocando() == false) {
		System.out.println("Play com sucesso!");
	}
}
 
public void pause() {
	if(this.getLigado() == true && this.getTocando() == true) {
		System.out.println("Pause com sucesso!");
	}
}


private int getVoulume() {
	return voulume;
}
private void setVoulume(int voulume) {
	this.voulume = voulume;
}
private boolean getLigado() {
	return ligado;
}
private void setLigado(boolean ligado) {
	this.ligado = ligado;
}
private boolean getTocando() {
	return tocando;
}
private void setTocando(boolean tocando) {
	this.tocando = tocando;
}

}

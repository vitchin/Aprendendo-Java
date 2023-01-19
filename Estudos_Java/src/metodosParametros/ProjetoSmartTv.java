// <Estado> <tipo> <nomeDoMetodo>(parametros){}
// O metodo void não retorna nada 
// Estados: public, private, protected, etc...
// O publico permite visibilidade do metodo por todo o sistema

/*
 * Criando um projeto que representa uma SmartTv onde: 
 * 1º tenha as características: ligada(boolean), canal(int) e volume(int)
 * 2º poderá ligar e desligar e mudar o estado ligada
 * 3º poderá aumentar e diminuir o volume sempre em +1 ou -1
 * 4º poderá mudar de canal de 1 em 1 ou definindo o numero correspondente
 * 
 */

package metodosParametros;

public class ProjetoSmartTv {
	
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
	public void subirCanal() {
		canal++;
	}
	public void descerCanal() {
		canal--;
	}
	public void aumentarVolume() {
		// volume = volume + 1;
		volume++;
		System.out.println("Aumentando o volume para: " + volume);
	}
	public void diminuirVolume() {
		// volume = volume - 1;
		volume--;
		System.out.println("Diminuindo o volume para: " + volume);
	}
	public void ligar() {
		ligada = true;
	}
	public void desligar() {
		ligada = false;
	}
}

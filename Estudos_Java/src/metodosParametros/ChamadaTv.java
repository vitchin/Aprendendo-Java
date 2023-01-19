package metodosParametros;

public class ChamadaTv {
	public static void main(String[] args) {
		
		ProjetoSmartTv smartTv = new ProjetoSmartTv();
		
		smartTv.mudarCanal(13);
		System.out.println("Canal Atual: "+smartTv.canal);
		
		System.out.println("Tv ligada? "+smartTv.ligada);
		System.out.println("Canal Atual: "+smartTv.canal);
		System.out.println("Volume Atual; "+smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo Status: Tv ligada? "+smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo Status: Tv ligada? "+smartTv.ligada);
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
	}
	
}

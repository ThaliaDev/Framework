package abstractFactory.framework;
//CLASSE MAIN/PRINCIPAL

public class jogoAtariLike {

	fabricaPecasJogo fabrica;
	controle controle;
	objetoDeslocavel deslocavel;
	obstaculo obstaculo;
	
	public jogoAtariLike(fabricaPecasJogo fabrica) {
		this.fabrica = fabrica;
		controle = fabrica.criaControle();
		deslocavel = fabrica.criaObjetoDeslocavel();
		obstaculo = fabrica.criaObstaculo();
	}
	
	@Override
	public String toString() {
		String result = "O controle � "+controle.getClass().getName();
		result += "\nO objeto deslocavel � "+this.deslocavel.getClass().getName();
		result += "\nO obstaculo � " +this.obstaculo.getClass().getName();
		return result;
	}
	
}

package abstractFactory.framework;

public interface fabricaPecasJogo {
	public controle criaControle();
	public objetoDeslocavel criaObjetoDeslocavel();
	public obstaculo criaObstaculo();
}

package abstractFactory.SpaceInvaders;

import abstractFactory.framework.controle;
import abstractFactory.framework.fabricaPecasJogo;
import abstractFactory.framework.objetoDeslocavel;
import abstractFactory.framework.obstaculo;

public class fabricaPecasSpace implements fabricaPecasJogo{

	@Override
	public controle criaControle() {
		return new nave();
	}

	@Override
	public objetoDeslocavel criaObjetoDeslocavel() {
		return new tiro();
	}

	@Override
	public obstaculo criaObstaculo() {
		return new tiroInimigo();
	}

}

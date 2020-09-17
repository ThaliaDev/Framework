package abstractFactory.FreezeMonster;

import abstractFactory.framework.controle;
import abstractFactory.framework.fabricaPecasJogo;
import abstractFactory.framework.objetoDeslocavel;
import abstractFactory.framework.obstaculo;

public class fabricaPecasFreeze implements fabricaPecasJogo{
	
@Override
public controle criaControle() {
	return new personagem();
}

@Override
public objetoDeslocavel criaObjetoDeslocavel() {
	// TODO Auto-generated method stub
	return new raio();
}

@Override
public obstaculo criaObstaculo() {
	// TODO Auto-generated method stub
	return new gosma();
}
}

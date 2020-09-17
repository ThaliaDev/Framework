package abstractFactory.SpaceInvaders;

import abstractFactory.framework.fabricaPecasJogo;
import abstractFactory.framework.jogoAtariLike;

public class jogoSpace extends jogoAtariLike{
	public jogoSpace(fabricaPecasJogo fabrica) {
		super(fabrica);
	}

	public static void main(String[] args) {
		jogoSpace s = new jogoSpace(new fabricaPecasSpace());
		System.out.println(s.toString());
	}
}

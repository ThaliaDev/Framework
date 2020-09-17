package abstractFactory.FreezeMonster;
import abstractFactory.framework.fabricaPecasJogo;
import abstractFactory.framework.jogoAtariLike;

public class jogoFreeze extends jogoAtariLike{

	public jogoFreeze(fabricaPecasJogo fabrica) {
		super(fabrica);
	}

	public static void main(String[] args) {
		jogoFreeze f = new jogoFreeze(new fabricaPecasFreeze());
		System.out.println(f.toString());
	}
	
}

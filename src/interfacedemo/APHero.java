package interfacedemo;

import interfacedemo.Interface.APInterface;
import interfacedemo.POJO.Hero;

public class APHero extends Hero implements APInterface {

	@Override
	public void magicAttack() {
		System.out.println("魔法攻击");
	}

}

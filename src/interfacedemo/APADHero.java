package interfacedemo;

import interfacedemo.Interface.ADInterface;
import interfacedemo.Interface.APInterface;
import interfacedemo.POJO.Hero;

public class APADHero extends Hero implements APInterface, ADInterface {

	@Override
	public void physicAttack() {
		// TODO Auto-generated method stub
		System.out.println("进行物理攻击");
	}

	@Override
	public void magicAttack() {
		// TODO Auto-generated method stub
		System.out.println("进行魔法攻击");
	}

}

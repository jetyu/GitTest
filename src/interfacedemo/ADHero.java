package interfacedemo;

import interfacedemo.Interface.ADInterface;
import interfacedemo.POJO.Hero;

public class ADHero extends Hero implements ADInterface{

	@Override
	public void physicAttack() {
		 
		System.out.println(getName() + "在进行物理攻击");
		
	}
	

}

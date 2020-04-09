package interfacedemo;

import interfacedemo.Interface.HealerInterface;
import interfacedemo.POJO.Hero;

public class SupportHero extends Hero implements HealerInterface {

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		System.out.println(getName() +"治疗技能");
	}

}

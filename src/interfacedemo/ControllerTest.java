package interfacedemo;

import interfacedemo.POJO.Hero;

public class ControllerTest {
	public static void main(String[] args) {
		ADHero adHero = new ADHero();
		adHero.setName("物理攻击英雄");
		adHero.physicAttack();

		Hero hero = new Hero();
		hero.setName("英雄Hero");
		String heroname = hero.getName();
		System.out.println(heroname);
		
		APHero apHero = new APHero();
		apHero.setName("魔法攻击英雄");
		apHero.magicAttack();
		
		hero = adHero;

	}
}

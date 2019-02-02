package jp.co.systena.tigerscave.dragonquestproject.entity;
public class LastBoss extends HumanFactory{

	//コンストラクタ
	public LastBoss() {
		super.setName("らすぼす");
		super.setGender(1);
		super.setLength(210);
		super.setWeight(120);
		super.setVitality(500);
		super.setMagic(40);
	}

	public void specialAttack(HumanFactory target) {
		// TODO 自動生成されたメソッド・スタブ
		String name = super.getName();
		System.out.println( name  + " の こうげき");
		System.out.println( name + " の じゃあくな ひっさつわざが さくれつした！");

		target.setVitality(target.getVitality() - 30);
		System.out.println( target.getName() + " は 30 のダメージをうけた");

		super.setVitality(super.getVitality() - 10);
		System.out.println( name + " の たいりょくは" + super.getVitality() + "になった");
		System.out.println("");

	}

}
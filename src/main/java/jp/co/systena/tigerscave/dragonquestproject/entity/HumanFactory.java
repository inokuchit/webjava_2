package jp.co.systena.tigerscave.dragonquestproject.entity;

public abstract class HumanFactory extends Factory {
	private String name = null; //なまえ
	private int gender = 0; 	//性別(1:男　2:女)
	private int length = 0;		//身長
	private int weight = 0;		//体重
	private int vitality = 0;	//たいりょく
	private int magic = 0;		//まりょく

	//コンストラクタ
	public HumanFactory(){

	}
	@Override
	public abstract void specialAttack(HumanFactory target);

	//getter･setter(なまえ)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//getter･setter(性別)
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}

	//getter･setter(身長)
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	//getter･setter(体重)
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	//getter･setter(たいりょく)
	public int getVitality() {
		return vitality;
	}
	public void setVitality(int vitality) {
		this.vitality = vitality;
	}

	//getter･setter(まりょく)
	public int getMagic() {
		return magic;
	}
	public void setMagic(int magic) {
		this.magic = magic;
	}
}

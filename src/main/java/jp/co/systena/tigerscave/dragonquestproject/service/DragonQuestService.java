package jp.co.systena.tigerscave.dragonquestproject.service;

import jp.co.systena.tigerscave.dragonquestproject.entity.HumanFactory;
import jp.co.systena.tigerscave.dragonquestproject.entity.LastBoss;
import jp.co.systena.tigerscave.dragonquestproject.entity.Yuusya;

public class DragonQuestService {
	Yuusya yuusya = new Yuusya();		//勇者オブジェクトを生成
	LastBoss lastBoss = new LastBoss();	//ラスボスオブジェクトを生成

	public void generate() {
		//敵があらわれた！
		System.out.println( lastBoss.getName() + " が あらわれた！");
	}

	public void attack() {
		//バトル開始
		yuusya.specialAttack(lastBoss);//勇者の攻撃
		lastBoss.specialAttack(yuusya);//ラスボスの攻撃

		//ステータス表示
		showStatus(yuusya);
		showStatus(lastBoss);

	}

	//ステータス表示メソッド
	private static void showStatus(HumanFactory target){
		System.out.println("- " + target.getName() + " の ステータス---");
		if(target.getGender() == 1){
			System.out.println("せいべつ ： 男");
		}else{
			System.out.println( "せいべつ ： 女");
		}
		System.out.println("たいりょく ： " + target.getVitality());
		System.out.println("まりょく ： " + target.getMagic());
		System.out.println("");

	}

}

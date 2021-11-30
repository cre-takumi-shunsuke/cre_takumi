package dragon.util.buttle;

import dragon.bean.Action;
import dragon.bean.ButtleMonster;

public class ButtleContents {
	/**
	 * 基本的な技の流れ
	 * @param offenceAction:攻撃側の技
	 * @param offenceMonster:攻撃側のモンスター
	 * @param defenceMonster:防御側のモンスター
	 */
	public static void useAction(Action offenceAction, ButtleMonster offenceMonster, ButtleMonster defenceMonster) {

		int nokoriMP = offenceAction.getActionPoint(); //現在のMP

		//攻撃技の表示
		String actionName = offenceAction.getActionName().replaceAll("\t", "");//技名に含まれているタブ区切りを解除する
		System.out.println(offenceMonster.getDragonName() + "の" + actionName + "!!");

		//攻撃技
		Attack(offenceAction, offenceMonster, defenceMonster);

		//MPの減少
		nokoriMP--;
		offenceAction.setButtleActionPoint(nokoriMP);
	}

	/**
	 * 攻撃技の流れ
	 * @param offenceAction
	 * @param offenceMonster
	 * @param defenceMonster
	 */
	public static void Attack(Action offenceAction, ButtleMonster offenceMonster, ButtleMonster defenceMonster) {

		int damage = offenceAction.getPower(); //技の威力

		int defenceDragonNokoriHp = 0; //buttleで更新する防御側モンスターのHP量

		//相手の残りHPの計算
		defenceDragonNokoriHp = defenceMonster.getButtleHp() - damage;
		if (defenceDragonNokoriHp <= 0) {
			defenceMonster.setButtleHp(0);
		} else {
			defenceMonster.setButtleHp(defenceDragonNokoriHp);
		}

		System.out.println(
				defenceMonster.getDragonName() + "は" + damage + "のダメージで残り体力が" + defenceMonster.getButtleHp() + "になった!");

	}

	/**
	 * 技リストを表示する
	 * @param myDragon
	 */
	public static void outputActionList(ButtleMonster myMonster) {
		System.out.println("\nコマンド\t\t技名\t\t\t\t残りポイント");
		System.out.println("\t1:\t\t" + myMonster.getActions().get(1).getActionName() + "\t\t"
				+ myMonster.getActions().get(1).getButtleActionPoint());
		System.out.println("\t2:\t\t" + myMonster.getActions().get(2).getActionName() + "\t\t"
				+ myMonster.getActions().get(2).getButtleActionPoint());
		System.out.println("\t3:\t\t" + myMonster.getActions().get(3).getActionName() + "\t\t"
				+ myMonster.getActions().get(3).getButtleActionPoint());
		System.out.print("技を選んでください>");
	}

	/**
	 * 勝敗結果を表示する
	 * @param enemyDownFlg
	 */
	public static void outputResult(boolean enemyDownFlg) {
		if (enemyDownFlg) {
			System.out.println("\nWIN！");
		} else {
			System.out.println("\nLOSE‥");
		}
	}

}
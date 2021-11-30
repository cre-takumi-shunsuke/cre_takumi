package dragon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import dragon.bean.ButtleMonster;
import dragon.util.buttle.ButtleMain;
import dragon.util.choice.ChoiceMonster;

public class DragonMain {
	public static void main(String[] args) throws Exception {

		System.out.println("モンスターのバトルを始めます");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			//モンスター一覧を取得する
			ChoiceMonster.searchDrageon();

			//どのモンスターを作成するかを選択する
			String choiceMyMonster = null;
			String choiceOpponentMonster = null;
			System.out.print("自分が使用するモンスターをidで選んでください>");
			choiceMyMonster = br.readLine();
			System.out.print("相手に使用させるモンスターをidで選んでください>");
			choiceOpponentMonster = br.readLine();

			//モンスター生成
			ButtleMonster myMonster = ChoiceMonster.makeDragon(Integer.parseInt(choiceMyMonster));
			ButtleMonster oppoMonster = ChoiceMonster.makeDragon(Integer.parseInt(choiceOpponentMonster));

			//Buttle
			ButtleMain.doButtle(myMonster, oppoMonster);

		} catch (Exception e) {
			System.out.println("深刻なエラーが出ました");
		}

	}
}
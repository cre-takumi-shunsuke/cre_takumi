package dragon.util.buttle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dragon.bean.ButtleMonster;



public class ButtleMain {
/**
 * Buttleの基本的な流れ
 * @throws IOException
 */
public static void doButtle(ButtleMonster myMonster, ButtleMonster oppoMonster) throws IOException{

    boolean enemyDownFlg = false; //敵が倒れたかどうかの判定
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Buttle Start!!!");
        do{
            ButtleContents.outputActionList(myMonster);

            String str = null;
            str = br.readLine();

        System.out.println("プレイヤーの攻撃！");
        ButtleContents.useAction(myMonster.getActions().get(Integer.parseInt(str)), myMonster, oppoMonster);

        if(oppoMonster.getButtleHp() == 0){
            enemyDownFlg = true;
            break;
        }

        System.out.println("相手の攻撃！");
        RandomEnemyChoice.randomChoice(oppoMonster,myMonster);

    }while(myMonster.getButtleHp() != 0);

        ButtleContents.outputResult(enemyDownFlg);
        System.out.println("バトルが終了しました");
}

}
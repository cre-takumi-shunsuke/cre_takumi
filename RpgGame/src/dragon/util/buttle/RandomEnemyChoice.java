package dragon.util.buttle;

import dragon.bean.ButtleMonster;

/**
 * 敵側のランダムな動きを指定するクラス
 *
 */
public class RandomEnemyChoice {

    /**
     * ランダムに技を生成し、実行する
     * @param oppoDragon
     * @param myDragon
     */
    public static void randomChoice(ButtleMonster oppoMonster, ButtleMonster myMonster){

    //ランダムに繰り出す技を選択する
    int randomChoice = 0;
    randomChoice = (int)(Math.random()*3 + 1);

    //技を繰り出す
    ButtleContents.useAction(oppoMonster.getActions().get(randomChoice),oppoMonster, myMonster);

    }

}
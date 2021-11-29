package dragon.util.choice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dragon.bean.Action;
import dragon.bean.ButtleMonster;
import dragon.bean.DefalutMonster;


public class ChoiceDragon {

    /**
     * モンスターを選択する
     * ※この部分をDBから取得すると良いかもしれません
     * @throws Exception
     */
    public static void searchDrageon(){

        //ここで選択できるドラゴンを作成する
    	DefalutMonster monster1 = new DefalutMonster(1,"ホワイトドラゴン", 20);
    	DefalutMonster monster2 = new DefalutMonster(2,"ブルードラゴン", 25);
    	DefalutMonster monster3 = new DefalutMonster(3,"レッドドラゴン", 15);

        //作成したドラゴンをリストにつめる
        List<DefalutMonster> choiceMonsterList = new ArrayList<DefalutMonster>();
        choiceMonsterList.add(monster1);
        choiceMonsterList.add(monster2);
        choiceMonsterList.add(monster3);

        //リストを表示する
        System.out.println("ID:\tドラゴン名");
        for(DefalutMonster list : choiceMonsterList){
            System.out.println(list.getDragonId()+":\t"+list.getDragonName());
        }
    }

    /**
     * 選択された値を元にして、リストからドラゴンを生み出す
     * その後、技を持たせる
     */
    public static ButtleMonster makeDragon(int MonsterId){

    //モンスターを生み出す
    	ButtleMonster buttleMonster = makeButtleMonster(MonsterId);

    //技リストを取得する
    Map<Integer, Action> buttleActionMap = makeButtleAction() ;

    //技をモンスターに持たせる
    Map<Integer, Action> buttleMonsterActionMap = new HashMap<>();

        //モンスターが持つ技のidを取得する
        int actionId_1 = buttleMonster.getAction1();
        int actionId_2 = buttleMonster.getAction2();
        int actionId_3 = buttleMonster.getAction3();

        //モンスターが持つ技を技リストから取得する
        Action action1 = buttleActionMap.get(actionId_1);
        Action action2 = buttleActionMap.get(actionId_2);
        Action action3 = buttleActionMap.get(actionId_3);

        //モンスターと技を結びつける
        buttleMonsterActionMap.put(1, action1);
        buttleMonsterActionMap.put(2, action2);
        buttleMonsterActionMap.put(3, action3);
        buttleMonster.setActions(buttleMonsterActionMap);

    return buttleMonster;
    }


    /**
     * ドラゴンを生成し、技リストのidをそれぞれに付与する。
     * ※ここでDBを使用すると良いと思います。
     * @param dragonId
     * @return
     */
    private static ButtleMonster makeButtleMonster(int monsterId) {
    	ButtleMonster makeDragon = null;

//引数によって異なるモンスターを生み出す

        switch(monsterId) {
        case 1:

//モンスターのコンストラクタへの引数はID・ドラゴンの名前・HP
        	ButtleMonster monster1 = new ButtleMonster(1,"ホワイトドラゴン", 20);

//モンスターに技をセットする
        	monster1.setAction1(1);
        	monster1.setAction2(2);
        	monster1.setAction3(5);
            makeDragon = monster1;
            break;
        case 2:
        	ButtleMonster monster2 = new ButtleMonster(2,"ブルードラゴン", 25);
        	monster2.setAction1(1);
        	monster2.setAction2(3);
        	monster2.setAction3(5);
            makeDragon = monster2;
            break;
        case 3:
        	ButtleMonster monster3 = new ButtleMonster(3,"レッドドラゴン", 15);
        	monster3.setAction1(1);
        	monster3.setAction2(4);
        	monster3.setAction3(5);
            makeDragon = monster3;
            break;
        }

        return makeDragon;
    }

    /**
     * 技リストを取得する。
     * ※ここでDBを使用すると良いと思います。
     * @return
     */
    private static Map<Integer, Action> makeButtleAction() {

        //技リスト一覧を宣言する
        Action action1 = new Action(1,"アタック\t", 2, 20);
        Action action2 = new Action(2,"ホワイトブレス", 4, 2);
        Action action3 = new Action(3,"ブルーブレス", 3, 2);
        Action action4 = new Action(4,"レッドブレス", 5, 2);
        Action action5 = new Action(5,"つよいアタック", 6, 1);

        //技リストをマップにつめる
        Map<Integer, Action> actionList = new HashMap<>();
        actionList.put(1, action1);
        actionList.put(2, action2);
        actionList.put(3, action3);
        actionList.put(4, action4);
        actionList.put(5, action5);

        return actionList;
    }
}
package dragon;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import dragon.bean.ButtleMonster;
import dragon.util.buttle.ButtleMain;
import dragon.util.choice.ChoiceDragon;

public class DragonMain{
    public static void main(String[] args)throws Exception {

        System.out.println("モンスターのバトルを始めます");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       try{

                //モンスター一覧を取得する
                ChoiceDragon.searchDrageon();

                //どのモンスターを作成するかを選択する
                String choiceMyDragon = null;
                String choiceOpponentDragon = null;
                System.out.print("自分が使用するモンスターをidで選んでください>");
                choiceMyDragon = br.readLine();
                System.out.print("相手に使用させるモンスターをidで選んでください>");
                choiceOpponentDragon = br.readLine();


                //モンスター生成
                ButtleMonster myDragon = ChoiceDragon.makeDragon(Integer.parseInt(choiceMyDragon));
                ButtleMonster oppoDragon = ChoiceDragon.makeDragon(Integer.parseInt(choiceOpponentDragon));

                //Buttle
                ButtleMain.doButtle(myDragon,oppoDragon);

       }catch(Exception e){
           System.out.println("深刻なエラーが出ました");
       }

    }
}
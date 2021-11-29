package dragon.bean;


import java.util.Map;

/**
 *
 * バトル中に使用するモンスタークラス
 * ＨＰの増減に使用する
 */

public class ButtleMonster extends DefalutMonster {

    int buttleHp;

    int action1;
    int action2;
    int action3;
    Map<Integer, Action> actions;

    /**
     * バトル用モンスターのコンストラクタ。バトル用HPの初期値はHPとする
     * @param Id
     * @param Name
     * @param hitPoint
     */
    public ButtleMonster(int Id, String Name, int hitPoint) {
        super(Id,Name,hitPoint);
        this.buttleHp = hitPoint;
    }

    public int getButtleHp() {
        return buttleHp;
    }
    public void setButtleHp(int buttleHp) {
        this.buttleHp = buttleHp;
    }

    public int getAction1() {
        return action1;
    }
    public void setAction1(int action1) {
        this.action1 = action1;
    }

    public int getAction2() {
        return action2;
    }
    public void setAction2(int action2) {
        this.action2 = action2;
    }

    public int getAction3() {
        return action3;
    }
    public void setAction3(int action3) {
        this.action3 = action3;
    }


    public Map<Integer, Action> getActions() {
        return actions;
    }
    public void setActions(Map<Integer, Action> actions) {
        this.actions = actions;
    }
}

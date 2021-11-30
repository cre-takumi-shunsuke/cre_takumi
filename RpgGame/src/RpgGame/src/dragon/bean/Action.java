package dragon.bean;

/*
 * バトル中に使用する技クラス
 */
public class Action {
	int actionId;
	String actionName;
	int power;
	int actionPoint;
	int buttleActionPoint;

	/**
	 * 技のコンストラクタ。
	 * 戦闘中のMPは[buttleActionPoint]を使用して増減させる
	 *
	 * @param actionName
	 * @param power
	 * @param actionPoint
	 */

	public Action(int actionId, String actionName, int power, int actionPoint) {
		this.actionId = actionId;
		this.actionName = actionName;
		this.power = power;
		this.actionPoint = actionPoint;
		this.buttleActionPoint = actionPoint;
	}

	public int getActionId() {
		return actionId;
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getActionPoint() {
		return actionPoint;
	}

	public void setActionPoint(int actionPoint) {
		this.actionPoint = actionPoint;
	}

	public int getButtleActionPoint() {
		return buttleActionPoint;
	}

	public void setButtleActionPoint(int buttleActionPoint) {
		this.buttleActionPoint = buttleActionPoint;
	}

}
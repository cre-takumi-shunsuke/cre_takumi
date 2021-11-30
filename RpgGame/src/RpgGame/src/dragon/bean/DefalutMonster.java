package dragon.bean;

public class DefalutMonster {
	int dragonId;
	String dragonName;
	int hitPoint;

	//モンスターの原型のコンストラクタ
	public DefalutMonster(int dragonId, String dragonName, int hitPoint) {
		this.dragonId = dragonId;
		this.dragonName = dragonName;
		this.hitPoint = hitPoint;
	}

	public int getDragonId() {
		return dragonId;
	}

	public void setDragonId(int dragonId) {
		this.dragonId = dragonId;
	}

	public String getDragonName() {
		return dragonName;
	}

	public void setDragonName(String dragonName) {
		this.dragonName = dragonName;
	}

	public int getHitPoint() {
		return hitPoint;
	}

	public void setHitPoint(int hitPoint) {
		this.hitPoint = hitPoint;
	}
}
package 八章_インスタンスとクラス;

public class Cleric {
	String name;
	int hp;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.mp = this.mp - 5;
		this.hp = MAX_MP;
		System.out.println(this.name + "はHPが最大まで回復した。");
	}
}

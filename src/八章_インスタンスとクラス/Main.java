package 八章_インスタンスとクラス;

public class Main {
	public static void main(String[] args) {
		//（以下の内容をJavaで記述していく）
		// 1.勇者を生成
		Hero h = new Hero();

		//2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");

		// 3.勇者のメソッドを呼び出していく
		h.sit(5);


		//お化けキノコよ、この仮想世界に生まれよ！
		//勇者よ、戦え！
		//お化けキノコよ、逃げろ！

		Cleric c1 = new Cleric();
		c1.name = "しゅんすけ";
		c1.hp = 40;
		System.out.println("僧侶" + c1.name + "を生み出しました！");

	}

}

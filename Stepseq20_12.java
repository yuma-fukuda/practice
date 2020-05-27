
public class Stepseq20_12 {
	public static void main(String[] args) {
		// int[]型の参照型変数の宣言
		// 配列インスタンスの生成と初期化
		int[] scores = {70, 50, 80, 40, 90};  //指定の通り半角英数の値を5つ用意

		// 繰り返し
		for(int i = 0; i < scores.length; i ++) {      //int iを初期化、条件式i＜配列の長さ、最後にiに1追加
			if(i%2 == 0){                               //奇数の場合出力する
				System.out.println((i + 1) + "人目のスコアは " + scores[i]);
			}

		}

	}

}

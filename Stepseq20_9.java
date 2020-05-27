
public class Stepseq20_9 {
	public static void main(String[] args) {
		//定数の宣言
		final int i = 5;
		final int j = 7;

		//int型 iとjの比較結果を出力
		System.out.println("i  = j  :" + (i == j));  //iとｊが等しいとtrueが返る
		System.out.println("i != j  :" + (i != j));  //iとｊが等しくないとtrueが返る
		System.out.println("i  > j  :" + (i  > j));  //iがｊより大きいとtrueが返る
		System.out.println("i  < j  :" + (i  < j));  //iがｊより小さいとtrueが返る
		System.out.println("i >= j  :" + (i >= j));  //iがｊの値以上だとtrueが返る
		System.out.println("i <= j  :" + (i <= j));  //iがｊの値以下だとtrueが返る

	}

}

/*仕様
・下記の演算結果のすべてを判定した結果を出力すること
　等しい、異なる、より大きい、より小さい、以上、以下
*/

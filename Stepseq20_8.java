
public class Stepseq20_8 {
	public static void main(String[] args) {
		//定数の宣言
		final int num1 = 99;       //int型の1つ目の定数を定義
		final int num2 = 20;       //int型の2つ目の定数を定義

		System.out.println("足し算      :" + (num1 + num2));   //足し算
		System.out.println("引き算      :" + (num1 - num2));   //引き算
		System.out.println("掛け算      :" + num1 * num2);     //掛け算
		System.out.println("割り算(商)  :" + num1 / num2);     //割り算（商）
		System.out.println("割り算(余り):" + num1 % num2);     //割り算（余り）

		//四則演算優先順位計算結果
		System.out.println("四則演算の優先順位計算結果 :" + ( (1 + 2 * 3) - (4/2*5)/2));
	}

}
/*仕様
・定数を定義し四則演算の結果を出力すること
*/

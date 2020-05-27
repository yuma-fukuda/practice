
public class Stepseq20_15 {
	public static void main(String[] args) {

		int i = Integer.parseInt(args[0]);     //コマンドライン引数を数値変換

		int j = Integer.parseInt(args[1]);     //コマンドライン引数を数値変換

		//条件分岐
		if (i > j) {
			System.out.println("第一引数のほうが大きい");

		}else if(i < j) {
			System.out.println("第二引数のほうが大きい");
		}else {
			System.out.println("同じ値");
		}
	}
}

/*仕様
・指定する値は、半角数字とすること
・if文を使用すること
・大小を比較し、結果を出力
*/

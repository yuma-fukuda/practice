
public class Stepseq20_17 {
	public static void main(String[] args) {

		int i = Integer.parseInt(args[0]);       //コマンドライン引数を数値変換

		int j = i;  //変数の宣言、初期化

		int count = 0;  //出力された回数

		while(count < 50) {                      //50回出力する

			if (i <= j) {                          //実行時引数よりも大きい値
				if(j % 2 == 0) {                  //偶数の場合のみ
					System.out.println(j + " ");  //出力する
					count++;                      //count 1追加
					j++;                          //1追加
				} else {
					j++;	                     //奇数の場合も1追加
				}

			}

		}

	}

}

/*仕様
・実行時の引数で指定した値以上の数字から、2の倍数を50個表示するプログラム
・while文を使用すること
*/

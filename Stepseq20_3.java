import java.util.Scanner;                                //コンソール上で文字を受け取るためにインポート

public class Stepseq20_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);       //インスタンス化

		String scan = scanner.next();                    //入力された文字を受け取る
		scanner.close();                                  //スキャナーを閉じる


		System.out.println(scan + "と入力されました");   //入力された文字を出力
	}

}

/*仕様
・コンソール上で指定する値は任意の文字列
・コンソール上から取得する値は一回でよい
*/

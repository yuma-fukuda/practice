import java.util.Scanner;

public class Stepseq20_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    // 入力を促すメッセージ
	    System.out.print("入力してください : ");

	    //入力された内容をインスタンスから取得
	    String input_text = scanner.nextLine();

	    //入力内容によって出力するパターンを変更
		switch (input_text) {
		case "A":
			System.out.println("パターンA");
			break;

		case "B":
			System.out.println("パターンB");
			break;

		case "C":
			System.out.println("パターンC");
			break;

		default:

		}
		scanner.close();

	}

}


/*仕様
・コンソール上で入力された値の内容によって、出力内容が変化するプログラム
・入力値は文字列として扱ってもよい
*/

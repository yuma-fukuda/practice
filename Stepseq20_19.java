import java.util.Scanner;

public class Stepseq20_19 {
	public static void main(String[] args) {
		//配列を宣言、初期値の代入
		final String[][] arr = {{"休診","○","休診","○","○","休診","○"},//病院の予定表
                         {"休診","○","○","○","○","○","休診"},   //横 日曜日～土曜日
                         {"休診","○","○","休診","○","○","休診"}  //縦 上から午前・午後・夜間
                         };

		Scanner scanner = new Scanner(System.in);

		String check = "はい";          //変数を宣言、初期値として”はい”を代入
		while(check.equals("はい")) {   //はいの場合のみループ
				int a = 0;    //配列の横の値


				System.out.print("何曜日ですか？ ：");     //質問1

				String whatDay = scanner.next();          // 質問1(曜日)の入力を受け取る

				switch (whatDay) {             //受け取った答えに基づきaの値を決める
				case "日曜日":         //日曜日の場合
					a = 0;
					break;
				case "月曜日":         //月曜日の場合
					a = 1;
					break;
				case "火曜日":         //火曜日の場合
					a = 2;
					break;
				case "水曜日":         //水曜日の場合
					a = 3;
					break;
				case "木曜日":         //木曜日の場合
					a = 4;
					break;
				case "金曜日":         //金曜日の場合
					a = 5;
					break;
				case "土曜日":         //土曜日の場合
					a = 6;
					break;
				default :                      //指定以外の入力を受け取った場合
					System.out.println("入力が間違っています");

				}
				System.out.println("時間帯ですか？");             //質問2
				System.out.print("午前 or 午後 or 夜間  ：");     //選択肢を出力

				int b = 0;   //配列の縦の値
				String whenTime = scanner.next();    // 質問2(時間帯)の入力を受け取る

				switch (whenTime) {                  //受け取った答えに基づきbの値を決める
				case "午前":  //午前の場合
					b = 0;
					break;
				case "午後":  //午後の場合
					b = 1;
					break;
				case "夜間":  //夜間の場合
					b = 2;
					break;
				default :    //指定以外の入力を受け取った場合
					System.out.println("入力が間違っています");
				}
				System.out.println(arr[b][a]);      //配列の中から入力に従って検索

				System.out.println("もう一度確認しますか？");    //確認メッセージ
				System.out.print("はい or いいえ ：");
				check = scanner.next();	                         //入力された文字を受け取る

		}
		scanner.close();             //スキャナー閉じる

	}
}


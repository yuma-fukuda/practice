import java.util.Scanner;

public class Stepseq20_18 {
	public static void main(String[] args) {

		//配列numberの初期化
		int[] number = new int[10];

		//scannerのインスタンス作成
		Scanner scan = new Scanner(System.in);

		//入力を10回受け付ける
		for(int i = 0; i < number.length; i++) {

			System.out.print(i + 1 + "回目入力してください : ");     // 入力を促すメッセージ
			number[i]  = scan.nextInt();

	    }
		scan.close();

		//バブルソートを使い昇順に並び替え

		 for(int i=0; i < number.length-1; i++) {
			 for(int j=0; j < number.length-i-1; j++) {
				 if(number[j] > number[j+1]) {
	            	int asc = number[j];
	            	number[j] = number[j+1];
	            	number[j+1] = asc;
	            }
	          }
	     }
	     //ソート後の結果を出力
	     for(int i = 0; i < number.length; i++) {
	       	System.out.print(number[i]+" ");
	     }
	}

}



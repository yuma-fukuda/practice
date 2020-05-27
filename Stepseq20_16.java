
public class Stepseq20_16 {
	public static void main(String[] args) {

		int sum = 0;    //sumを初期化

		int[][]  result  = new int[9][9];     //配列の宣言

		//九九の結果を配列に保存
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {

				result[i][j] = (i + 1) * (j + 1);

				sum += result[i][j];             //合計値取得
	        }
		}
	    // 九九の結果を表示
	    for( int i=0; i<9; i++ ) {
	    	for( int j=0; j<9; j++ ) {
	    		System.out.print(result[i][j] + " ");
		    }
		      	System.out.println();      //段落分け
		}
		System.out.println(sum);           //九九の合計値を出力
	}
}

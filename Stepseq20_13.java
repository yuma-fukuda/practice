
public class Stepseq20_13 {
	public static void main(String[] args) {
		//2次元配列の宣言及び初期化
		// int[]型の参照型定数の宣言
		// 配列インスタンスの生成と初期化
		final int[][] score ={ {70, 50, 80},
						  		{82, 93, 47}};

        //科目ごとの合計点を求める
        for( int j = 0; j < score[0].length; j++ ) {
            int sum = 0;
            for( int i = 0; i < score.length; i++ )
                sum += score[i][j];
            System.out.println( j+1 + "番目の科目の合計点は " + sum);
        }

        //科目ごとの平均点を求める
        for( int j = 0; j < score[0].length; j++ ) {
            int sum = 0;
            for( int i = 0; i < score.length; i++ )
                sum += score[i][j];
            System.out.println( j+1 + "番目の科目の平均点は " + (double)sum/score.length );
        }

	}

}

/*仕様
・三科目二名分の得点の値を初期値として配列へ代入すること
・科目ごとの合計得点と平均点を計算し出力
*/

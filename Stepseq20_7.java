
public class Stepseq20_7 {
	public static void main(String[] args) {

        int value;            //int型の任意の変数として定義
        int result;           //valueの結果を格納する変数として定義

        value = 3;             //初期値を設定
        result = ++value;      //前置のインクリメントの場合
        System.out.println("++value: value = " + value + ", result = " + result);
        //前置の場合右辺を計算してから左辺に代入するためどちらも4が出力される

        value = 3;             //初期化
        result = value++;      //後置のインクリメントの場合
        System.out.println("value++: value = " + value + ", result = " + result);
        //後置の場合は左辺に代入してから、右辺の計算をするためvalue=4,result=3が出力される

        value = 3;             //初期化
        result = --value;      //前置のディクリメントの場合
        System.out.println("--value: value = " + value + ", result = " + result);
        /*インクリメント同様ディクリメントでも、前置の場合は右辺を計算してから
           左辺に代入されるため、value=2, result=2と出力される */

        value = 3;             //初期化
        result = value--;      //後置のディクリメントの場合
        System.out.println("value--: value = " + value + ", result = " + result);
        /*後置にインクリメントを置いた時と同様に計算の順序は変わらないので、
          先に左辺に代入してから右辺の計算となるので、value=2,result=3が出力される*/
	}

}

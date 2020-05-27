
public class Stepseq20_4 {


	public static void main(String[] args) {
		//定数の宣言
		final boolean BOOL = true;                 //真偽値 trueまたはfalse
		final char CHAR = 'C';                      //Unicode(UTF-16)の文字に対応
		final String STR = "あいう";                 //文字列型
		final byte BYTE = 123;                      //1バイト	  -128～128
		final short SHORT =12345 ;                 //2バイト ほとんど使用しない
		final int INT = 123456789;                  //整数を扱うときに使用
		final long LONG = 1234567890;              //intより大きい数値を扱うとき
		final double DOUBLE = 1.7E308;             //少数を使用するとき主に使用
		final float FLOAT = 3.4F;                  //doubleより容量を使いたくない場合使用

		//値の出力
		System.out.println("BOOLの定数  ：" + BOOL);
		System.out.println("CHARの定数  ：" + CHAR);
		System.out.println("STRの定数   ：" + STR);
		System.out.println("BYTEの定数  ：" + BYTE);
		System.out.println("SHORTの定数 ：" + SHORT);
		System.out.println("INTの定数   ：" + INT);
		System.out.println("LONGの定数  ：" + LONG);
		System.out.println("DOUBLEの定数：" + DOUBLE);
		System.out.println("FLOATの定数 ：" + FLOAT);
	}


}
/*仕様
・以下の定数を定義すること
　　boolean,char,String,byte,short,int,long,double,float
・設定する値は、対応する型に対応した任意のものとする
*/


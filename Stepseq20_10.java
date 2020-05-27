
public class Stepseq20_10 {
	public static void main(String[] args) {
		//定数byte b1,b2,b3,b4を宣言
		 final byte b1 = (byte) 0x55; //2進数では01010101
		 final byte b2 = (byte) 0xaa; //2進数では10101010
		 final byte b3 = (byte) 0x5a; //2進数では01011010
		 final byte b4 = (byte) 0xff; //2進数では11111110

		//①ANDを利用し、全てのビットを0の状態（オフ）に一回で変更
		// 論理積(and) &
		 byte and = (byte) (b1 & b2);

		//②ORを利用し、右側4ビットの値を確実に1の状態（オン）に一回で変更
		// 論理和(or) |
		 byte or = (byte) (b1 | b3);

		//③XORを利用し、全てのビットを反転した状態に一回で変更
		// 排他的論理和(xor) ^
		 byte xor = (byte) (b1 ^ b4);


		//①②③の結果を出力、2進数に変換
		 System.out.println("AND :" + String.format("%8s", Integer.toBinaryString(and & 0xff)).replace(" ", "0")); // → 00000000
		 System.out.println("OR  :" + String.format("%8s", Integer.toBinaryString(or & 0xff)).replace(" ", "0"));  // → 01011111
		 System.out.println("XOR :" + String.format("%8s", Integer.toBinaryString(xor & 0xff)).replace(" ", "0")); // → 10101010
	}

}

/*仕様
・ビット演算結果を出力するものをコーディングしなさい
*/


public class Stepseq20_11 {
	public static void main(String[] args) {
		//変数を定義;
        int value1 = 2;//値1
        int value2 = 7;//値2
        boolean result;//結果
        result = (value1 == 2) && (value2 == 7);//両方真の場合
        System.out.println("value1は2 かつ value2は7 = " + result);

        result = (value1 == 2 && value2 == 7);//両方真の場合
        System.out.println("value1は2 かつ value2は7 = " + result);

        result = (value1 == 2) || (value2 == 3);//少なくとも片方は真の場合
        System.out.println("value1は2 または value2は3 = " + result);
	}

}

package j16;

import java.util.Arrays;

public class j16 {
	public static void main(String args[]) {
		String[] array = new String[6];
		array[0] = "4";
		array[1] = "5";
		array[2] = "3";
		array[3] = "1";
		array[4] = "2";

		array[5] = "6";
		Arrays.sort(array);
		for (int i = 0; i <= 4; i++) {
			System.out.println(array[i]);
		}
	}

}

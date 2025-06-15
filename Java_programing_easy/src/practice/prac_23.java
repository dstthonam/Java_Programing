package practice;
import java.util.Arrays;

public class prac_23 {							// 최대값, 최소값, 합계, 평균 구하기
	public static void main(String[] args) {
		int R[] = { 30, 24, 71, 41, 43, 86, 70, 68, 78, 86, 98 };
		int Sum = 0,  M = 0, Max = 0, Min = 100;
		Arrays.sort(R);
		
		Max = R[R.length - 1];
		Min = R[0];
		for (int i = 0; i < R.length; i++) {
			Sum += R[i];
		}
		M = Sum / R.length;

		/**
		for (int i = 0; i < R.length; i++) {
			if (Max < R[i]) Max = R[i];
			if (Min > R[i]) Min = R[i];
			Sum += R[i];
		}
		M = Sum / R.length;
		*/
		
		System.out.println("최대값 : " + Max);
		System.out.println("최소값 : " + Min);
		System.out.println("합계 : " + Sum);
		System.out.println("평균 : " + M);
		
	}
}

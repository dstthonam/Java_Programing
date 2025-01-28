package chap04;
import java.util.*;

public class Ch04_Exam06 {

	public static void main(String[] args) {
		
		int MidTerm, FinalExam, Report, Check;
		double tot;
		char point;
		String score = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력 하세요(중간고사, 기말고사, 레포트, 출석점수) : ");
		MidTerm = sc.nextInt();
		FinalExam = sc.nextInt();
		Report = sc.nextInt();
		Check = sc.nextInt();
		
		tot = ((MidTerm + FinalExam)/2 * 0.6) + (Report * 0.2) + (Check * 0.2);
		
		if (tot >= 90 ) {
			point = 'A';
		} else if (tot >= 80 ) {
			point = 'B';
		}	else if (tot >= 70 ) {
			point = 'C';
		}	else if (tot >= 60 ) {
			point = 'D';
		}	else {
			point = 'F';
		}
		
		switch(point) {
			case 'A' :
			case 'B' : score = "excellent";	break;
			case 'C' :
			case 'D' : score = "good";	break;
			case 'F' : score = "poor";		break;
			default : System.out.println("error"); break;
		}

		System.out.println("    ----- 결과입니다 -----");
		System.out.printf("중간고사 : %d\n 기말고사 : %d\n 과제점수 : %d\n 출석점수 : %d\n", MidTerm, FinalExam, Report, Check);
		System.out.printf("성적 : %.2f\n 학점 : %c\n 평가 : %s\n", tot, point, score);
		
		sc.close();
	}

}

import java.util.Scanner;

public class Exam_12 {
	static void w1(int a) {
		int s=0;
		for(int i=1; i<=a; i++) {
			s+=i;
		}
		System.out.printf("%d ~ %d 합 : %d\n",1,a,s);
	}
	static void w2(int a) {
		int s=0;
		for(int i=1; i<=a; i++) {
			if(i%2==1) {
				s+=i;
			}
		}
		System.out.printf("1 ~ %d 홀수 합 : %d\n",a,s);
	}
	static void w3(int a) {
		int s=0;
		for(int i=1; i<=a; i++) {
			if(i%2==0) {
				s+=i;
			}
		}
		System.out.printf("1 ~ %d 짝수 합 : %d\n",a,s);
	}
	static void w4(int a) {
		int s=0;
		for(int i=2; i<=a; i++) {
			int j;
			for(j=2; j<=i; j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				s+=i;
			}
		}
		System.out.printf("1 ~ %d 소수 합 : %d\n",a,s);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("작업번호, 정수 입력 : ");
			int a = s.nextInt();
			if(a>4) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}
			int b = s.nextInt();
			if(a==1) {
				w1(b);
			}else if(a==2) {
				w2(b);
			}else if(a==3) {
				w3(b);
			}else if(a==4) {
				w4(b);
			}
		}

	}

}

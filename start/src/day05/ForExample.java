package day05;

/*
	"SM Enertainment 만세!"를 10번 출력하시오.
 */
public class ForExample {
	public static void main(String[] args) {
		String str="SM Entertainmnet 만세!^^7";
		
		for(int i=0; i<10; i++) {
			System.out.println((i+1)+"번째로 외칩니다. "+str);
		}
	}
}

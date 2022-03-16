package day09.ex;
/*
	문자열으로 계산식을 입력하면
	식에 맞는 계산을 해서 출력해주는 프로그램을 작성하세요.
	
	단, 계산은 + - * / %만 처리하기로 하고
	각 연산은 함수로 분리해 처리하시오.
	
	입력, 출력, 계산을 모두 분리해 함수로 만들어서 처리하시오.
 */
import java.util.Scanner;
public class Ex01 {
	public Ex01() {
		Scanner sc=new Scanner(System.in);
		
		String[] sik=input(sc);
		
		// 계산 결과 받기
		double result=calc(sik);
		
		// 출력
		System.out.println(sik[0]+sik[1]+sik[2]+" 연산 결과 : "+result);
	}
	public static void main(String[] args) {
		new Ex01();
	}
	// 입력 함수
	public String[] input(Scanner s) {
		String[] str=new String[3];
		// 입력 메세지 출력
		System.out.println("계산 식을 입력하시오.");
		String sik=s.nextLine();
		
		// 문자열에서 숫자와 연산기호를 분리
		for (int i=0; i<sik.length(); i++) {
			char ch=sik.charAt(i);
			
			if (ch<'0'|ch>'9') {// 연산기호일 경우
				str[0]=sik.substring(0, i);
				str[1]=""+ch;
				str[2]=sik.substring(i+1);
				break;
			}
		}
		return str;
	}
	
	// 계산하는 함수
	public double calc(String[] arr) {
		// 결과값 초기화
		double result=0;
		
		// 숫자 따오기
		int no1=Integer.parseInt(arr[0]);
		int no2=Integer.parseInt(arr[2]);
		
		String giho=arr[1];
		
		switch(giho) {
		case "+":
			result=no1+no2;
			break;
		case "-":
			result=no1-no2;
			break;
		case "*":
			result=no1*no2;
			break;
		case "/":
			result=no1/(double)no2;
			break;
		case "%":
			result=no1%no2;
			break;
		}
		return result;
	}
	
}

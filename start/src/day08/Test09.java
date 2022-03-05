package day08;
/*
	사칙연산을 하는 연산식을 입력하면
	결과를 보여주는 계산기 프로그램을 작성하시오.
	(단, 연산 식은 문자열 배열에 담아 처리하시오.)
	
	ex.
		String[] sik=new String[3];
		sik[0]=2;
		sik[1]=*;
		sik[2]=3;
 
 		연산기호가 오는 위치 이전까지 문자열을 잘라 첫번째에 기억
 		연산기호를 두번째 위치에 기억
 		나머지를 마지막 위치에 기억시켜 처리
 */
import javax.swing.JOptionPane;
public class Test09 {
	public static void main(String[] args) {
		// 입력받아 변수로 기억
		String str=JOptionPane.showInputDialog("계산식을 입력하세요!");
		
		// 배열 준비
		String[] sik=new String[3];
		
		// 문자열 잘라 집어넣기
		int idx=0;	// 연산기호 기억할 변수
		
		// 반복 추출해 연산 기호를 알아낸다.
		for (int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			// 숫자가 아닐경우 추출!
			if((ch>'9')|(ch<'0')) {
				idx=i;
				break;
			}
		}
		// 배열에 입력
		sik[0]=str.substring(0,idx);
		sik[1]=str.substring(idx,(idx+1));	// 아니면 str.charAt(idx)+""
		sik[2]=str.substring(idx+1);
		
		// int 화 시키기
		int no1=Integer.parseInt(sik[0]);
		int no2=Integer.parseInt(sik[2]);
		
		// 계산
		double result=0.;
		
		switch(sik[1]) {
		case"+":
			result=no1+no2;
			break;
		case"-":
			result=no1-no2;
			break;
		case"*":
			result=no1*no2;
			break;
		case"/":
			result=no1/(double)no2;
			break;
		}
		// 결과 출력
		System.out.print("입력한 계산식 "+str+"\n"
				+ "의 결과 :  "+result);
	}
}

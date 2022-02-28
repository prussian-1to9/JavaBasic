package day04.Ex;

/*
3자리 숫자(100~999)를 입력받아
이 숫자에 가장 가까운 100의 배수를 만들기 위해선
얼마가 필요한지를 계산해 출력하는 프로그램을 작성하시오.
*/

import javax.swing.JOptionPane;
public class Ex05Resolve {
	public static void main(String[] args) {
		// 센세 풀이 갑니다
		// 세 자리 정수 입력받기
		String sno=JOptionPane.showInputDialog("세 자리 정수 입력 : ");
		// 입력받은 데이터는 정수 형태의 문자열이므로 정수로 변환해줘야 함.
		// 정수 형태의 문자열->정수로 변환해 주는 함수는 Integer.parseInt(문자열)
		int no=Integer.parseInt(sno);
				
		// 10단위 이하만 추출.
		int num=no%100;
				
		// num이 50보다 큰지 판별.
		int hap=0;
		int result=0;
		
		hap=num>50?100-num	//76==>100-76을 더해줘야 한다.
				:num;
		
		// result=num>50?no+hap:no-hap;
		result=num>50?(no/100+1)*100:(no/100)*100;
		
		String str=num>50?"더해줘야 한다.":"빼줘야 한다.";
		
		// 출력
		System.out.println("입력한 정수 "+no+" 는 "+
		result+"와 가까우므로 "+hap+"을 "+str);
	}
}

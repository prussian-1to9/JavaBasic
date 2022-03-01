package day05.ex;
/*
	문제5. 컴퓨터와 사용자가 가위바위보 게임을 한다.
	
	컴퓨터는 랜덤하게 1~3 사이의 숫자를 발생하여
	가위, 바위, 보로 가정하고
	사용자는 키보드를 이용해 1~3 사이의 숫자를 입력한다.
	
	누가 이겼는지 확인하는 프로그램을 작성하시오.
 */
import javax.swing.JOptionPane;
public class Ex05 {

	public static void main(String[] args) {		
		// 게임 안내 문구 출력
		System.out.println("컴퓨터와 가위 바위 보를 해보아요!");
		
		// 사용자의 패 입력&변수 생성
		String pae=JOptionPane.showInputDialog("가위, 바위, 보 중 하나를 입력하세요!");
		// 저는 사용자가 좀 편했으면해서 한글 입력으로 했습니다.
		
		// 정수형으로 전환
		int user=0;
		if (pae.equals("가위")) {
			user=1;
		}else if(pae.equals("바위")) {
			user=2;
		}else if(pae.equals("보")) {
			user=3;
		}
		
		// 출력
		if ((pae.equals("뵤"))||(pae.equals("'뵤'"))) {
			System.out.println("축하합니다! 이스터에그를 찾으셨습니다!");
			System.out.println(" ٩ʕ◕౪◕ʔو ");
		}else if (user>0){
			System.out.println("사용자의 패 : "+pae);
			// 컴퓨터 패 입력
			int com=(int)(Math.random()*(3-1+1)+1);
			
			// 컴퓨터 패 출력
			String Pae=(com==1)?"가위":(com==2)?"바위":"보";
			System.out.println("컴퓨터의 패 : "+Pae);
			
			// 승자에게 점수 부여
			String winner="비겼습";
			
			// 승패를 가루기
			if (user==1) {
				// 사용자의 패가 가위일 경우
				if (com==user){
				}else if(com==2) {
					winner="컴퓨터 입";
				}else {
					winner="당신 입";
				}
				
				// 사용자의 패가 바위일 경우
			}else if(user==2){
				if (com==user) {
				}else if(com==3) {
					winner="컴퓨터 입";
				}else {
					winner="당신 입";
				}
			}else {
				
				// 사용자의 패가 보자기일 경우
				if (com==user) {
				}else if(com==1) {
					winner="컴퓨터 입";
				}else {
					winner="당신 입";
				}
			}
			
			// 결과 출력
			if (winner.equals("비겼습")) {
				System.out.println(winner+"니다. 다시 한번 도전하세요!");
			}else if (winner.equals("당신 입")){
				System.out.println("축하합니다! 승자는 "+winner+"니다!");
			}else {
				System.out.println("안타깝네요. 승자는 "+winner+"니다.");
			}
		}else {			
			System.out.println("정확한 값을 입력해 주세요.");
		}
	}
}

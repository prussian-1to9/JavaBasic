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
		JOptionPane.showMessageDialog(null, "컴퓨터와 가위 바위 보를 해보아요!");
		System.out.println("[대전 기록]\n");
		
		// 반복문 생성
		while (true) {
			
			// 사용자의 패 입력&변수 생성
			String pae=JOptionPane.showInputDialog("가위, 바위, 보 중 하나를 입력하세요!\n"
					+"프로그램을 종료 : 입력하지 않고 확인 버튼");
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
			
			// 컴퓨터 패 입력
			int com=(int)(Math.random()*(3-1+1)+1);
			String Pae=(com==1)?"가위":(com==2)?"바위":"보";
			
			// 게임 진행
			// 이스터에그 만들기
			if ((pae.equals("뵤"))||(pae.equals("'뵤'"))) {
				JOptionPane.showMessageDialog(null, "축하합니다! 이스터에그를 찾으셨습니다!");
				JOptionPane.showMessageDialog(null, "٩ʕ◕౪◕ʔو 햄스터가 프로그램을 갖고 달아났습니다!");
				System.out.print("프로그램이 햄스터에 의해 도둑맞았습니다.\n"
						+"프로그램이 종료됩니다.");
				break;
				
			// 자이제 진짜 게임을 해봅시다...
			}else if (user>0){
				System.out.println("사용자의 패 : "+pae);
				
				// 컴퓨터 패 출력
				System.out.println("컴퓨터의 패 : "+Pae);
				
				// 승자에게 점수 부여
				String winner="비겼습";
				
				// 승패를 가루기
				if (user==com) {// 비긴경우				
				}else if((com-user==1)||(com-user==-2)) {// 컴퓨터가 이긴 경우
					winner="컴퓨터 입";
				}else {// 사용자가 이긴 경우
					winner="당신 입";
				}
				
				// 결과 출력
				if (winner.equals("비겼습")) {// 무승부
					System.out.println("무승부");
					JOptionPane.showMessageDialog(null, winner+"니다. 다시 한번 도전하세요!");
					
				}else if (winner.equals("당신 입")){// 사용자 승
					System.out.println("사용자 승");
					JOptionPane.showMessageDialog(null, "축하합니다! 승자는 "+winner+"니다!");
					
				}else {// 컴퓨터 승
					System.out.println("컴퓨터 승");
					JOptionPane.showMessageDialog(null, "안타깝네요. 승자는 "+winner+"니다.");
				}
				System.out.println("----------------------------------------------");
			
			}else if(pae.equals("")){
				System.out.print("시스템을 종료합니다.");
				break;
			}else{			
				System.out.println("정확한 값을 입력해 주세요.\n");
			}
		}
	}
} 
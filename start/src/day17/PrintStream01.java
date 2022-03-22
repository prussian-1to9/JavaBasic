package day17;
/*
	nct dream 고래(Dive into you)를 파일에 저장해보자.
 */
import java.io.*;
public class PrintStream01 {// Test11

	public PrintStream01() {
		// PrintStream을 사용해 봅시다.
		PrintStream ps=null;
		
		try {
			ps=new PrintStream("src/day17/result/diveIntoYou.txt");
		ps.println("\t고래 (Dive Into You)");
		ps.println("\t\tNCT DREAM\n");
		ps.println("Look around 둘러봐도 온통 짙은 푸른빛");
		ps.println("까만 밤 마치 깊은 물에 잠수한 듯이");
		ps.println("먹먹함 속에 너의 목소리만 뚜렷해");
		ps.println("어쩌지\n");
		ps.println("나에게 넌 달아나는 저 수평선 같지");
		ps.println("눈앞에 너를 두고서도 나는 또다시");
		ps.println("그리워 너는 파도처럼 나를 삼키지");
		ps.println("어쩌지\n");
		ps.println("Oh you and I 넌 아득한 나의 바다");
		ps.println("난 너의 품에 빠져");
		ps.println("You and I 너에게 가 닿고 싶어\n");
		ps.println("I will dive into you, you, you");
		ps.println("I will dive into you, you, you");
		ps.println("I will dive into you\n");
		ps.println("궁금해 네 맘 한가운데 나는 어딘지");
		ps.println("표류해 모르는 채 한번 가보는 거지");
		ps.println("막막해 가끔 이 마음의 끝은 어딜지");
		ps.println("너인지\n");
		ps.println("심각해 널 스치는 바람마저 질투해");
		ps.println("네 뺨에 내려앉은 달빛도 annoying me");
		ps.println("그보다 더 가까이 내가 곁에 있을래");
		ps.println("가까이\n");
		ps.println("Oh you and I 넌 유일한 나의 바다");
		ps.println("난 너의 눈에 잠겨");
		ps.println("You and I 그 안에 난 살고 싶어\n");
		ps.println("I will dive into you, you, you");
		ps.println("I will dive into you, you, you");
		ps.println("I will dive into you\n");
		ps.println("Swim down 두 눈앞이 파랗게");
		ps.println("Swim down 네 안에서 난 꿈을 꿔 you, you\n");
		ps.println("I will dive into you\n");
		ps.println("Sail 떠도는 바다 위의");
		ps.println("Whale 늘 바랬어 머물기를");
		ps.println("매일 외로운 낮과 긴 밤을");
		ps.println("나 찾아 헤맸던 건 너였음을\n");
		ps.println("이제는 나 알 것 같애");
		ps.println("네가 날 숨 쉬게 한단 걸 yea yea");
		ps.println("너에게 너의 안에");
		ps.println("너를 향해 가는 항해\n");
		ps.println("I will dive, I will dive");
		ps.println("I will dive into you, you, you (yeah)\n");
		ps.println("I will dive into you, you, you");
		ps.println("I will dive into you\n");
		ps.println("Swim down 두 눈앞이 파랗게");
		ps.println("Swim down 네 안에서 난 꿈을 꿔 you, you\n");
		ps.println("I will dive into you\n");
		ps.println("You and I 나의 바다 포근한 품");
		ps.println("I will dive into you");
		
		ps.flush();
		// 내부적으로 bufferd의 기능을 갖고 있으므로
		// 내보내기가 끝나면 buffer memory를 비워준다.
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new PrintStream01();
	}
}

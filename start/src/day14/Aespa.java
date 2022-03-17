package day14;
// StringTokenizer 써봅시돠~
import java.util.StringTokenizer;
public class Aespa {

	public Aespa() {
		// 원문
		String aenergy="카리나 Rocket Puncher,윈터 Armamenter,"
				+ "지젤 got Xenoglossy,닝닝 E.d Hacker";
		
		// 잘라봅쉐이~
		StringTokenizer aespa=new StringTokenizer(aenergy, ",");
		
		// 배열에 기억할 준비를 해보쉐이~
		int len=aespa.countTokens();
		int idx=0;
		String[] ae=new String[len];
		
		// 배열에 기억해봅쉐이~
		while (aespa.hasMoreTokens()) {
			String tmp=aespa.nextToken();
			ae[idx]=tmp;
			idx++;
		}
		
		// 출력해보쉐이~
		System.out.println("Naevis, 그녀가 우릴 여기 보내줬어");
		for (String yyj : ae) {
			System.out.println(yyj);
		}
	}

	public static void main(String[] args) {
		new Aespa();
	}
}

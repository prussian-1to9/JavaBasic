package day14;
// StringBuffer를 사용해보쉐이~
public class Savage {

	public Savage() {
		StringBuffer buff=new StringBuffer();
		
		buff.append("위기에 빠진 날 지켜준건 너였어\n");
		buff.append("My naavis, we love you\n");
		buff.append("My victory, 하나의 SYNK DIVE\n");
		buff.append("오직 네가 만들어준 기회란 걸\n");
		buff.append("I know your sacrifices oh\n");
		buff.append("알아 우린 반드시 네 기억들을 찾아줄게\n");
		buff.append("우린 만나 꼭 부활 그 다음\n");
		
		String savage=new String(buff.toString());
		
		System.out.println(savage);
	}

	public static void main(String[] args) {
		new Savage();
	}
}

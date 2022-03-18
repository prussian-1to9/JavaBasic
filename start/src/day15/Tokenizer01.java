package day15;
/*
	파라미터로 전달된 문자열
		http://www.nctdream.org/member/?id=iji&pw=12345&tel=01093546669
	중에서 남겨진 데이터만 잘라서 출력하시오.
 */
import java.util.StringTokenizer;
public class Tokenizer01 {

	public Tokenizer01() {
		String url="http://www.nctdream.org/member/?id=iji&pw=12345&tel=01093546669";
		// 위 문자열에서 데이터 부분만 추출하려면
		// ? 기호의 위치값을 알아낸 후, 그 바로 다음 위치에서부터 끝가지 잘라내면 됨.
		int idx=url.indexOf("?");
		String param=url.substring(idx+1);
		
		System.out.println(param);
		
		// 만들어진 문자열을 &를 기준으로 잘라 배열에 담아보쉐이
		StringTokenizer token=new StringTokenizer(param, "&");
		
		// 배열에 담을 준비해봅쉬다
		int len=token.countTokens();
		String[] info=new String[len];
//		idx=0;
		
		// 배열에 담아봅쉬다
/*		while(token.hasMoreTokens()) {
			info[idx++]=token.nextToken();
		}*/
		for(int i=0; token.hasMoreTokens(); i++) {
			info[i]=token.nextToken();
		}// 반복문에서 조건문의 의미 : 반복횟수의 컨트롤에 의의.
		
		// 다시 한번 잘라줍시다!
		String[][] data=new String[len][2];
		for (int i=0; i<info.length; i++) {
			String str=info[i];
			StringTokenizer tk=new StringTokenizer(str, "=");
			
			data[i][0]=tk.nextToken();
			data[i][1]=tk.nextToken();
		}
		
		// 출력해보쉐이
		for(String[] arr : data) {
		/*	for (String s : arr) {
				System.out.print(s+"\t");
			}*/
			System.out.println(arr[0]+"\t: "+arr[1]);
		}
	}

	public static void main(String[] args) {
		new Tokenizer01();
	}
}

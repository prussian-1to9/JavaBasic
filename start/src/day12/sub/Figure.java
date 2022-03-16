package day12.sub;

public interface Figure {
/*public static final*/	int area=10;	// 자동으로 final이 붙으니, 초기화 필수
	
	void setArea();
	void toPrint();	// 자동으로 public abstract가 붙는다!
}

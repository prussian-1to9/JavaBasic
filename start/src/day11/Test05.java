package day11;

public class Test05 {
	public Test05() {
		Grand g1=new Grand();
		
		Grand g2=new Mother();
		
		Grand g3=new Daugther();
		
		// .abc()는 어떻게 다를까?
		System.out.print("g1.abc() : ");
		g1.abc();
		System.out.print("g2.abc() : ");
		g2.abc();
		System.out.print("g3.abc() : ");
		g3.abc();
		
		// no의 값은?
		System.out.println("g1.no : "+g1.no);
		System.out.println("g2.no : "+g2.no);
		System.out.println("g3.no : "+g3.no);
		
		((Mother) g2).xyz();
		
		System.out.println(g3 instanceof Daugther);
		// instance type을 물어보는 것이기 때문에 true!
		System.out.println((Mother)g2 instanceof Grand);
	}
	
	public static void main(String[] args) {
		new Test05();
	}
}


class Grand {
	int no=80;
	void abc() {
		System.out.println("나는 Grand~");
	}
}

class Mother extends Grand {
	int no=40;
	
	@Override
	void abc() {
		System.out.println("나는 마덜~");
	}
	
	void xyz() {
		System.out.println("^_^");
	}
}

class Daugther extends Mother {
	int no=10;
	
	@Override
	void abc() {
		System.out.println("나는 다럴~");
	}
	
	@Override
	void xyz() {
		System.out.println("뀨우?");
	}
}
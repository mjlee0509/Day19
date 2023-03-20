package day19;

public class ChildClass extends ParentClass{
	
	public ChildClass() {
		System.out.println("자식 클래스 생성자");
	}
	
	// hello 메소드 재정의
	public void hello () {		// <-- 부모 클래스에서 정의한 그대로
		System.out.println("자식 hello");
	}
	

}

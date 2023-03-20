package day19;

public class InheritanceMain {
	
	public static void main(String[] args) {
		// 부모객체
		ParentClass p1 = new ParentClass();
		p1.name = "name1";
		System.out.println(p1.name);
		p1.hello();
		
		System.out.println("----------------");
		
		// 자식객체
		ChildClass c1 = new  ChildClass();		// <-- 이게 실행되면서 부모클래스의 기본 생성자 자동 호출 + 그 다음으로 자식 클래스의 생성자 호출
		c1.name = "자식 name1";		// ChildClass에서는 아무것도 선언하지 않았는데 name이란 필드를 사용할 수 있다!
		System.out.println(c1.name);
		c1.hello();
		
	}

}

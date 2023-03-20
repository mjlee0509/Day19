package day19_interface;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 인터페이스 객체 생성
//		InterfaceEx int1 = new InterfaceEx();	// <-- 인터페이스 자체를 인스턴스화할 수 없다.
//		ImplClass1 ipc1 = new ImplClass1();     // <-- 그렇다고 이렇게 쓰자니 인터페이스를 활용하는 의미가 없다
		InterfaceEx if1 = new ImplClass1();	 	/** 좌변: 인터페이스 = 우변: 구현 클래스 **/
		if1.hello();
		
		InterfaceEx if2 = new ImplClass2();
		if2.hello();
		
		// 인터페이스의 '다형성'
		InterfaceEx if3 = new ImplClass1();
		if3.hello();
		if3 = new ImplClass2();				// <-- 하나의 메소드나 클래스를 다양한 방법으로 동작하는 것; 같은 좌변 = 다른 우변
		if3.hello();						
		

	}

}

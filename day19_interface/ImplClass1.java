package day19_interface;

public class ImplClass1 implements InterfaceEx{
	// "이 클래스는 interfaceEx의 구현 클래스이다"
	// The type ImplClass1 must implement the inherited abstract method InterfaceEx.hello() : 인터페이스에서 상속받은 추상메소드를 반드시 재정의하라.

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("ImplClass1.hello()");
	}
	
	

}


public class B extends A {

	public int a1() {
		return 10;
	}
	
	public int b1() {
		return 100;
	}
	
	public int b2() {
		return this.a3()+this.b1();
	}
}

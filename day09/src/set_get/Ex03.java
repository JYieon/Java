package set_get;

class Test03{
	private int num = 1234; //다른 클래스에서는 사용 못함
	int age;
	
	public int get() {
		return num;
	}
	public void set(int n) {
		this.num = n;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Test03 t = new Test03();
		int n = t.get();
		System.out.println(n);
		int num = 700;
		t.set(num);
		System.out.println("변경 후 : " + t.get());
	}
	
}

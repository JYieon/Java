package set_get;

class Test04{
	private int age, num, aaa, bbb, ccc;
	public int getAge() { //합성어의 두번째 글자는 대문자로시작. 구분을 위해 get,set뒤에 변수 이름을 적어준다.
		return age;
	}
	public int getNum() {
		return num;
	}
	
	public void setAge(int n) {
		this.age = n;
	}
	public void setNum(int n) {
		this.num = n;
	}
	
	public int getAaa() {
		return aaa;
	}
	public void setAaa(int aaa) {
		this.aaa = aaa;
	}
	public int getBbb() {
		return bbb;
	}
	public void setBbb(int bbb) {
		this.bbb = bbb;
	}
	public int getCcc() {
		return ccc;
	}
	public void setCcc(int ccc) {
		this.ccc = ccc;
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		Test04 t = new Test04();
		System.out.println(t.getAge());
		System.out.println(t.getNum());
		
		t.setAge(2222);
		System.out.println(t.getAge());
		t.setNum(3333);
		System.out.println(t.getNum());
	}
}

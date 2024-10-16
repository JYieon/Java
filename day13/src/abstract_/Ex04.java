package abstract_;

class A04 implements Army04{ //지상군

	@Override
	public void attack() {
		System.out.println("지상군이 공격합니다.");
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	} 
	
}

class B04 implements Army04{ //공군 

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		Army04 a = new A04();
		a.attack();
	}
}

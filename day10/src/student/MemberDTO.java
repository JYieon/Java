package student;

public class MemberDTO {
	String name = null;
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum = 0;
	char grade = 0;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		setSum();
		setGrade();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		setSum();
		setGrade();
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
		setSum();
		setGrade();
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		this.sum = this.eng + this.kor + this.math;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade() {
		if(this.sum >= 270)
			this.grade = 'A';
		else if(this.sum >= 230)
			this.grade = 'b';
		else if(this.sum >= 200)
			this.grade = 'c';
		else 
			this.grade = 'F';
	}
	
	
}

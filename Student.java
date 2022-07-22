package lesson.day10;

//데이터 클래스 --> 은닉성 규칙을 지켜야 한다.
public class Student {
	// File한줄 11개의 정보를 담는 필드를 표현하는 클래스
	// stdNo,email,kor,eng,math,sci,hist,total,
	// mgrCode,accCode,localCode
	private int stdNo;
	private String email;
	private int kor;
	private int eng;
	private int math;
	private int sci;
	private int hist;
	private int total;
	private String mgrCode;
	private String accCode;
	private String localCode;
	
	public int getStdNo() {
		return stdNo;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() { return eng;}
	public int getMath() { return math;}
	public int getSci() {return sci;}
	public int getHist() { return hist;}
	public int getTotal() { return total;}
	public String getMgrCode() { return mgrCode;}
	public String getAccCode() { return accCode;}
	public String getLocalCode() { return localCode;}
	
	public void setStdNo(int sn) {
		this.stdNo = sn;
	}
	public void setEmail(String email) { this.email = email;}
	public void setKor(int kor) { this.kor = kor;}
	public void setEng(int eng) { this.eng = eng;}
	public void setMath(int math) { this.math = math;}
	public void setSci(int sci) { this.sci = sci;}
	public void setHist(int hist) { this.hist = hist;}
	public void setTotal(int total) { this.total = total;}
	public void setMgrCode(String mgrCode) { this.mgrCode = mgrCode;}
	public void setAccCode(String accCode) { this.accCode = accCode;}
	public void setLocalCode(String localCode) { this.localCode = localCode;}
	
}

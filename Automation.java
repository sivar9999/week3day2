package week3.Day2.Assignments;

//Week 3 Day2 Assignments-1 
public class Automation extends MultipleLangauge implements TestTool, Language {
	@Override
	public void rupy() {
		System.out.println("This is Rupy");
	}

	public void java() {
		System.out.println("This is Java");
	}

	public void selenium() {
		System.out.println("This is Selenium");
	}

	public static void main(String[] args) {
		Automation ob = new Automation();
		ob.python();
		ob.rupy();
		ob.java();
		ob.selenium();
	}

}
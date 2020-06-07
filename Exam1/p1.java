package Exam1;

public class p1 {
	
	public void abc()
	{
		System.out.println(60+40-50);
	}
	private void mno()
	{
		int age = 25;
		System.out.println(age);
	}
	protected void pro()
	{
		String gender = "Male";
		String gender1 = "female";
		System.out.println("This is gender information   : " +gender+ " \n This is gender information  :  "+gender1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		p1 xx = new p1();
		xx.abc();
		xx.mno();

	}

}

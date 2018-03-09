package ExceptionPractice;

public class ThrowsCheck {
	void voteCheck(int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("not vote");
		}
		else
			System.out.println("eligible");
	}
	public static void main(String[] args) {
		ThrowsCheck tc=new ThrowsCheck();
		try
		{
		tc.voteCheck(13);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}

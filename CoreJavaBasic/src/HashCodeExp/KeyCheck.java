package HashCodeExp;

public class KeyCheck{
	  String key;
	  public KeyCheck(String key) {
			super();
			this.key = key;
		}
	@Override
	public int hashCode() {
		
		 return (int)key.charAt(0);
	}

	

	@Override
	public boolean equals(Object obj) {
		
		 return key.equals((String)obj);
	}

	public static void main(String[] args) {
		
		KeyCheck k1=new KeyCheck("sarath");
		System.out.println(k1.hashCode());
	
		

	}

}

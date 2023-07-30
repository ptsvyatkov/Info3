
public class absolute {

	// Code for White-box test exercise
	public static int absoluteValueOf (int x) {
	  if (x < -1)
	     return -x;
	  else
	     return x;
	}
	
	public static void main(String[] args) {
		
		System.out.println(absoluteValueOf(55));
		
	}
}

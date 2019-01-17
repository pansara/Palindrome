package assign1;
import java.util.*;
//import assign1.palindrome;
public class palindromeTester {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		while(sc.hasNext())
		{
			String s = sc.nextLine();
			palindrome p = new palindrome(s);
			p.setS(s);
			System.out.println(p);
		}
	}
}

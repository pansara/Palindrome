
package assign1;
/*import java.util.*;
public class palindrome {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String answer1, answer2, answer3, answer4, a, b, c, d;
		System.out.println("Enter a word:");
			a = s.next();
			b = s.next();
			c = s.next();
			d = s.next();
			answer1 = process(a);
			answer2 = process(b);
			answer3 = process(c);
			answer4 = process(d);
			a = a.substring(0)+a.substring(a.length())+"--";
			System.out.println(""+a+answer1);
			b = b.substring(0)+b.substring(b.length())+"--";
			System.out.println(""+b+answer2);
			c = c.substring(0)+c.substring(c.length())+"--";
			System.out.println(""+c+answer3);
			d = d.substring(0)+d.substring(d.length())+"--";
			System.out.println(""+d+answer4);
			
		
		
	}
	static String process(String word)
	{
		boolean answer1 = isPalindrome(word);
		boolean answer2 = isMirror(word);
		if (answer1 == true && answer2 == true)
		{
			return "is mirrored palindrome";
		}
		else if(answer1 == true)
		{
			return "is a regular palindrome";
		}
		else if(answer2 == true)
		{
			return "is a mirrored string";
		}
		else
		{
			return "is not a palindrome";
		}
		
	}
	public static boolean isPalindrome(String word)
	{
		String reverse = "";
		String original = word;
		int length = original.length();
		for(int i=length-1; i>=0; i--)
		{
			reverse = reverse+original.charAt(i);
		}
		if(original.equals(reverse))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isMirror(String word)
	{
		String C = "AEHIJLMOSTUVWXYZ123580";
		String R = "A3HILJMO2TUVWXY51SEZ8O";
		int length = word.length();
		int count = 0;
		if (length % 2 == 0)
		{
			for (int i=0; i<length; i++)
			{
				char t = word.charAt(i);
				int k = C.indexOf(t);
				if (k != (-1))
				{
					if (R.charAt(k) == word.charAt(length-i-1))
					{
						count++;
					}	
				}
			}
		}
		else
		{
			int position = length/2;
			String z = word.substring(position, position + 1);
			int y = C.indexOf(z);
			if (y != -1)
			{
				if (R.charAt(y) == z.charAt(0))
				{
					count++;
				}
			}
			if (count == 1)
			{
				count = 0;
				for(int j=0; j<length/2; j++)
				{
					char t = word.charAt(j);
					int k = C.indexOf(t);
					if (k != (-1))
					{
						if (R.charAt(k) == word.charAt(length-j-1))
						{
							count++;
						}	
					}
				}
				if (count == length/2)
				{
					count = (count*2)+1;
				}
			}
		}
		if (count == length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
*/
public class palindrome
{
	private String s;
	public 	palindrome()
	{
		s = "";
	}
	public palindrome(String s)
	{
		this.s = s;
	}
	public String getS()
	{
		return s;
	}
	public void setS(String s)
	{
		this.s = s;
	}
	public String toString()
	{
		if(isPalindrome() && isMirror())
		{
			return s+"--is a pmirrored string";
			//System.out.println(s+"--is a mirrored palindrome");
		}
		else if(isPalindrome())
		{
			return s+"--is a regular palindrome";
			//System.out.println(s+"--is a regular palindrome");
		}
		else if(isMirror())
		{
			return s+"--is a mirrored string";
			//System.out.println(s+"--is a mirrored string");
		}
		else
		{
			return s+"--is not a palindrome";
			//System.out.println(s+"--is not a palindrome");
		}
		//return "";
	}
	private boolean isPalindrome()
	{
		String reverse = "";
		String original = s;
		int length = original.length();
		for(int i=length-1; i>=0; i--)
		{
			reverse = reverse+original.charAt(i);
		}
		if(original.equals(reverse))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	private boolean isMirror()
	{
		String C = "AEHIJLMOSTUVWXYZ123580";
		String R = "A3HILJMO2TUVWXY51SEZ8O";
		int length = s.length();
		int count = 0;
		if (length % 2 == 0)
		{
			for (int i=0; i<length; i++)
			{
				char t = s.charAt(i);
				int k = C.indexOf(t);
				if (k != (-1))
				{
					if (R.charAt(k) == s.charAt(length-i-1))
					{
						count++;
					}	
				}
			}
		}
		else
		{
			int position = length/2;
			String z = s.substring(position, position + 1);
			int y = C.indexOf(z);
			if (y != -1)
			{
				if (R.charAt(y) == z.charAt(0))
				{
					count++;
				}
			}
			if (count == 1)
			{
				count = 0;
				for(int j=0; j<length/2; j++)
				{
					char t = s.charAt(j);
					int k = C.indexOf(t);
					if (k != (-1))
					{
						if (R.charAt(k) == s.charAt(length-j-1))
						{
							count++;
						}	
					}
				}
				if (count == length/2)
				{
					count = (count*2)+1;
				}
			}
		}
		if (count == length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
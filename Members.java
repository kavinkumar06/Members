# Members
import java.io.*;
import java.util.*;

public class Members
{
public static void main(String args[])throws IOException
{
Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String sr[] = s1.split(",");
		Arrays.sort(sr, Collections.reverseOrder());
		int a = s.nextInt();
		s.close();
		System.out.println(sr[a]);
	}

}

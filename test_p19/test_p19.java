import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class test_p19
{

	
	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("請問你是男生嘛\n請輸入Y或N");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
				
		String str = br.readLine();
		char letter = str.charAt(0);
		
		if (letter == 'Y' || letter =='y')
		{
			System.out.println("你是男生阿!");
		}
		else if (letter == 'N' || letter =='n')
		{
			System.out.println("你是女生阿!");
		}
		else 
		{
			System.out.println("請輸入Y或N");
		}

	}
}

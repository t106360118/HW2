import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class test_p15 
{

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("請輸入整數");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
				
		int num = Integer.parseInt(br.readLine());
		switch (num)
		{
			case 1:
			{
				System.out.println("輸入的是1");
			}
			case 2:
			{
				System.out.println("輸入的是2");
			}
			default:
			{
				System.out.println("請輸入1或2");
			}
		}

	}
}

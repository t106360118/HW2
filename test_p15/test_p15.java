import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class test_p15 
{

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("Ոݔ������");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
				
		int num = Integer.parseInt(br.readLine());
		switch (num)
		{
			case 1:
			{
				System.out.println("ݔ�����1");
			}
			case 2:
			{
				System.out.println("ݔ�����2");
			}
			default:
			{
				System.out.println("Ոݔ��1��2");
			}
		}

	}
}

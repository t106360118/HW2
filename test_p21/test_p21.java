import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class test_p21
{

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("Ո��Ҫ�x�ėl·��?\nՈݔ������");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
				
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		char ans = (res==1)?'A':'B';
		System.out.println("�x����"+ans+"·��");
		
	}
}

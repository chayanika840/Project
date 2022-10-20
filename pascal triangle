package javadsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascaltraingle {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number of rows");
		int n=sc.nextInt();
		
		List<List<Integer>> pascaltrangle=new ArrayList();
		List<Integer>  prev=null;
		for(int i=0;i<n;i++)
		{
			List<Integer> save =new ArrayList() ;
			for(int j=0;j<=i;j++)
			{
				if(j==0 ||j==i)
				{
					save.add(1);
				}
				else
				{
					save.add(prev.get(j-1)+prev.get(j));
				}
			}
			
			prev=save;
			pascaltrangle.add(prev);
		}
		System.out.println(pascaltrangle);
		
System.out.println("enter row no.");
int row=sc.nextInt();
System.out.println("enter col no.");
int col=sc.nextInt();
int ans=1;
for(int i=0;i<col;i++)
{
	
	ans*=row-i;
//	ans/=col-i;  ye nahi lga rhe kyuki jab divide hota he to floor value defalut leleta he compiler jo ki ans glt dena he
	ans/=i+1;
	System.out.println("ans  : "+ ans);
}
		System.out.println("ans  : "+ ans);
	}


}

/*	
	1 2 3 4 5
	2 3 4 5
	3 4 5	
	4 5
	5
	4 5
	3 4 5
	2 3 4 5	
	1 2 3 4 5  */
class Demo130
	{
		public static void main(String args[])
		{
			int n=5;
			for(int i=1;i<=(n*2)-1;i++)
			{
					if(i<=n)
					{
						for(int j=i;j<=n;j++)
							System.out.print("j"+" ");
					}
					else
					{
						for(int j=(n*2)-i;j<=n;j++)
								System.out.print(j+" ");
					}
					System.out.println();
			}
		}
	}
							
								
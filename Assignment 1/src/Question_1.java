
public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		This is a code for alphabet I
		int n = 9;
		for(int i=0 ; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i==0 || j==(n-1)/2 || i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println(" ");
		}
		System.out.println(" ");
//		This is a code for alphabet N
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(j==0 || i==j || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
//		This is a code for alphabet E
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i==(n-1)/2 || i-j==n/2  || i+j==n/2 || j-i==n/2 || i==n-2 && j==n-4 || i==n-3 && j==n-3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
//		This is a code for alphabet U
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(j==0 && i!=n-1 || i==n-1 && j!=0 && j!=n-1 || j==n-1 && i!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
//		This is a code for alphabet R
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(j==0 || i==(n-1)/2 && j!=n-1 && j!=n-2 || j==n-1 && i!=0 && i!=1 && i!=n/2 && i!=(n/2)-1 && i!=(n/2)+1 || i==0 && j<n-3 ||i==1 && j==7||i==2 && j==8||i==3 && j==7||i==5 && j==7||i==6 && j==8)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
//		This is a code for alphabet O
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(j==0 || i==0 || j==n-1 || i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
//		This is a code for alphabet N
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(j==0 || i==j || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}

}

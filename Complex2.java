package PatternProgramming;

public class Complex2 
{
    public static void main(String [] args)
    {
        int n=11;
        for(int i=0; i<n ; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==0 || j==(n-1) || i==(n-1) || j==0  )
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            for(int j=0; j<n; j++)
            {
                if(i+j==(n-1)/2|| i-j==(n-1)/2 || i+j==(n-1)+(n-1)/2 || j-i==(n-1)/2 || i==0 || j==0 || i==(n-1) || j==(n-1))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            for(int j=0; j<n; j++)
            {
                if(i==j || i+j==(n-1))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            for(int j=0; j<n; j++)
            {
                if(i==0 || j==0 || i==(n-1) || j==(n-1) || i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2 || i==j && i<=(n-1)/2 || i+j==(n-1) && i>=(n-1)/2 || i+j==(n-1) && i<=(n-1)/2 || i==j && i>=(n-1)/2) 
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for(int j=0; j<n; j++)
            {
                if(i+j<=(n-1)/2 || j-i>=(n-1)/2 || i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2 ) 
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for(int j=0; j<n; j++)
            {
                if(i==0 || j==0 || i==(n-1) || j==(n-1) || i>=2 && i<=8 && j==2 || i==2 && j>=2 && j<=4 || j==(n-1)/2-1 && i>=2 && i<=(n-1)/2-1
                   || i==(n-1)/2-1 && j>=(n-1)/2-1 && j<=(n-1)/2+1 || j==(n-1)/2+1 && i>=(n-1)-(n-1)/2-3 && i<=(n-1)/2-1 || i==2 && j>=6 && j<=8
                   || j==8 && i>=2 && i<=8 || i==(n-1)-2 && j>=6 && j<=8 || j==(n-1)/2+1 && i>=(n-1)/2+1 && i<=(n-1)-2 || i==(n-1)/2+1 && j>=4 && j<=6
                   || j==4 && i>=6 && i<=8 || i==(n-1)-2 && j>=2 && j<=4) 
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();  
        }
        for(int i=0; i<n ; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==0 || j==(n-1) || i==(n-1) || j==0 || i>=2 && i<=8 && j>=2 && j<=4 || i>=2 && i<=8 && j>=6 && j<=8
                   || i>=4 && i<=6 && j>=4 && j<=6)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for(int j=0; j<n; j++)
            {
                if(i==0 || j==(n-1) || i==(n-1) || j==0)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }    
        
    }    
}


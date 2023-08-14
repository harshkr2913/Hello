package PatternProgramming;

public class ComplexPatternProgramming 
{
    public static void main(String[] args)
    {
        int n=5;
 //If we want a diagonal then we use shortcut instead of this code: if(i==0 && j==0 || i==1 && j==1   --- so on...)
        for(int j=0 ; j<n ; j++)
        {
            for(int i=0 ; i<n ; i++)
            {
                if(i==j || i+j==n-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("THIS IS X");

        for(int j=0 ; j<n ; j++)
        {
            for(int i=0 ; i<n ; i++)
            {
                if(i==j && i<=2|| i+j==4 && i>=2 || i==2 && j>=2 )
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("THIS IS Y");

        for(int j=0 ; j<n ; j++)
        {
            for(int i=0 ; i<n ; i++)
            {
                if(i==j || i==0 || i==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("THIS IS Z");

        for(int j=0 ; j<n ; j++)
        {
            for(int i=0 ; i<n ; i++)
            {
                if(i==0 || i==4 || i==j && j<=2 || i+j==4 && j<=2 )
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
        System.out.println("THIS IS M");
            
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(j==0 || i+j==(n-1)/2 && i<=2 || i-j==(n-1)/2 && j<=2)
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
        System.out.println("THIS IS K");
    }    
}

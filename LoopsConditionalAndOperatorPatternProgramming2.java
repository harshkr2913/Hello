package PatternProgramming;

public class LoopsConditionalAndOperatorPatternProgramming2
{
    public static void main(String [] args)
    {
        int n=5;
        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 && j>0 && j<=(n-1)/2 || j==0 && i>0 || j==(n-2) && i>0 || i==(n-1)/2 && j<=(n-2)) 
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
        System.out.println("THIS IS A ");


        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(j==0 && i>0 && i<(n-1) || i==0 && j>0 && j<(n-1) || i==4 && j>0 && j<(n-1)) 
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
        System.out.println("THIS IS C");

        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(j==0 || i==0 && j<=(n-1)/2 || j==(n-2) && i>0 && i<(n-1) || i==(n-1) && j<(n-2))  
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
        System.out.println("THIS IS D");

        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 && j<(n-1) || j==0 || i==4 && j<=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2 || i==(n-1)/2 && j>=(n-1)/2 && j==3 || j==3 && i>=(n-1)/2 ) 
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
        System.out.println("THIS IS G");

        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 || j==(n-1)/2 || j==0 && i>=(n-1)/2 || i==(n-1) && j<=(n-1)/2)  
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
        System.out.println("THIS IS J");

        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(j==0 || i==0 && j==(n-1)/2 || i==1 && j==1 || i==(n-2) && j==1 || i==(n-1) && j==(n-1)/2)  
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

        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(j==0 || j==(n-1) || i==1 && j==1 || i==2 && j==2 || i==1 && j==3)  
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

        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(j==0 || j==(n-1) || i==1 && j==1 || i==2 && j==2 || i==3 && j==3)  
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
        System.out.println("THIS IS N");

        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(j==0 || i==0 && j<=(n-1)/2 || i==2 && j<=2 || j==2 && i<=2)  
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
        System.out.println("THIS IS P");

        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 && j<=3 || j==0 && i<=3 || i==3 && j<=3 || j==3 && i<=3 || i==2 && j==2 || i==3 && j==3 || i==4 && j==4)  
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
        System.out.println("THIS IS Q");

        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 && j<=2 || j==0 || i==2 && j<=2 || j==2 && i<=2 || i==3 && j==1 || i==4 && j==2)  
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
        System.out.println("THIS IS R");

        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(j==0 && i<=3 || i==4 && j>0 && j<=3 || j==4 && i<=3)  
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
        System.out.println("THIS IS U");

        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 && j==0 || i==2 && j==1 || i==4 && j==2 || i==2 && j==3 || j==4 && i==0)  
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
        System.out.println("THIS IS V");

        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(j==0 || i==0 && j==4 || j==4 || i==3 && j==1 || i==2 && j==2 || i==3 && j==3 )
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
        System.out.println("THIS IS W");

        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 && j==0 || i==1 && j==1 || i==2 && j==2 || i==3 && j==3 || i==4 && j==4 || i==4 && j==0 || i==3 && j==1 || i==1 && j==3 || i==0 && j==4)  
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
        System.out.println("THIS IS X");

        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(j==2 && i>=2 || i==0 && j==0 || i==1 && j==1 || i==1 && j==3 || i==0 && j==4)  
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
        System.out.println("THIS IS Y");

        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 || i==4 || i==3 && j==1 || i==2 && j==2 || i==1 && j==3)  
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
        System.out.println("THIS IS Z");
    }
}

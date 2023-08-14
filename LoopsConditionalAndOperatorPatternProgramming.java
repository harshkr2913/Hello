package PatternProgramming;
public class LoopsConditionalAndOperatorPatternProgramming
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 || j==0 || i==n-1 || j==4) 
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
        System.out.println("SIMPLE");
        // This is simple. Let's try A.
        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 || j==0 || i==(n-1)/2 || j==n-1) 
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
        System.out.println("THIS IS A ");
        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 || j==0 || i==(n-1)/2 || j==4 || i==4) 
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
        System.out.println("THIS IS B");
        // Let's Try C.
        
        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 || j==0 || i==n-1) 
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
        // Let's Try D.
        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 || j==0 || i==n-1 || j==4) 
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
        // Let's Try E.
        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 || j==0 || i==n-1 || i==(n-1)/2) 
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
        System.out.println("THIS IS E");
        // Let's Try F.
        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 || j==0 || i==(n-1)/2) 
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
        System.out.println("THIS IS F");
        // Let's Try G.
        //for(int i=0 ; i<5 ; i++)
        //{
        //    for(int j=0 ; j<n ; j++)
        //    {
        //        if(i==0 || j==0 || i==n-1 || j==4) 
        //        {                                
       //             System.out.print("* ");
       //        }
        //        else
        //        {
        //            System.out.print("  ");
        //        }
        //    }
        //    System.out.println();
       // }
       // System.out.println("THIS IS G");
      //   Let's Try H.
        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(j==0 || i==(n-1)/2 || j==4) 
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
        System.out.println("THIS IS H");
      //Let's Try I.
        for(int i=0 ; i<5 ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 || j==(n-1)/2 || i==4) 
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
        System.out.println("THIS IS I");


        

    }
}

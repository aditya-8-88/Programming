public class Loop_class1
{
    public static void main(String args[])
    {
        for(int a=5;a>=1;a--) 
        {
            for(int i=1;i<=a;i++)
            {
            System. out. print(i);
            System. out. print(" ");
            }
            System.out.println();
        }    
    }
    public static void main1(String args[])
    {
        //int a=0;
        for(int i=1;i<=5;i++) 
        {
         //   for(int k=1;k<=a;k++) 
           System.out.println(i);
            for(int j=i;j<=5;j++)
            {
                i++;
                System. out. print(i);
              //  System. out. print(" ");
            }
            System.out.println();
            System.out.println(i);
          //  a++;
        }
        System.out.println();
    }
    public static void main2(String args[])
    {
        int a=0;
        for(int i=1;i<=5;i++) 
        {
            for(int k=1;k<=a;k++) 
            System.out.print("  ");
            for(int j=i;j<=5;j++)
            {
                System. out. print(j);
                System. out. print(" ");
            }
            System.out.println();
            a++;
        }
    }
    public static void main3(String args[])
    {
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        for(int a=1;a<=10;a++) 
        {
            for(int i=a;i<=10;i++)
            {
                System. out. print(i);
                System. out. print(" ");
            }
            System.out.println();
        }    
    }
    public static void demo(String args[])//printing statment 10 times
    {
        for(int a=1;a<10;a++) 
        {
            System. out. println("asfdfdsg");
        }
    }
    public static void main4(String args[])
    {
        int k=1;
        for(int a=1;a<=5;a++) 
        {
            for(int i=1;i<=a;i++)
            {
                System. out. print(k);
                System. out. print(" ");
                k++;
            }
            System.out.println();
        }        
    }
    public static void loop_a_2015(String args[])
    {
        int count=1;
        for(int c=1;c<=5;c++)
        {
            for(int k=1;k<=c;k++)
            {
                System.out.print("*");
                k++;
                if(c>1 && count++ <c)
                {
                    System.out.print("#");
                    count++;
                }
            }
            System.out.println();
            count=1;
        }
    }
    public static void loop_b_2015(String args[])
    {
        for(int c=1;c<=5;c++)
        {
            for(int k=5;k>=c;k--)
            {
                System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main5(String args[])
    {
        int y=5;
        for(int a=5;a>=1;a--)//here the value will decrease 5 4 3 2 1 '0'-condition false
        {
            for(int b=5;b>=a;b--)//b=5, when b>=5 then b will be 5 and after it condition will be false
                                //when b>=4 then b will be 5 4 and after it condition will be false
            {
                System.out.print(b);
            }
            for(int c=1;c<=y-1;c++)//c=1,when y-1=4 then c will be 1 2 3 4 '5'-condition false
            {
                System.out.print(y);
            }
            System.out.println();
            y=y-1;
        }
    }
    public static void main6(String args[])
    {
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        System. out. println(" ");
        for(int a=1;a<=10;a++) 
        {
            System. out. print("                                                                                    ");
            for(int i=a;i<=10;i++)
            {
                System. out. print(i);
            }
            System.out.println();
        }
    }
    public static void main7(String args[])
    {
        int a=1;
        for(int j=1;j<=7;j+=2) 
        {
            for(int k=a;k<=3;k++)
            System.out.print(" ");
            for(int i=1;i<=j;i++)
            System.out.print("*");
            System.out.println();
            a++;
        }    
    }
    public static void main8(String args[])
    {
        for(int a=1;a<=10;a++) 
        {
            for(int i=a;i<=10;i++)
            {
            System. out. print(i);
            System. out. print(" ");
            }
            System.out.println();
        }
    }
    
}


1.Feint Distance
import java.util.Scanner;
public class FEINT
{     	String S1,S2;
     	int fd;
     	FEINT()
     	{	S1="";
         		S2="";
         		fd=0;         
     	}
     	void fnInput()
     	{	Scanner sc= new Scanner(System.in);
         		System.out.println("Enter both the strings one by one:");
         		S1=sc.nextLine();
         		S2=sc.nextLine();
     	}
     	void fnSetFeint()
     	{	int l1=S1.length();
         		int l2=S2.length();
         		int l;
         		if(l1>l2)
         		{	l=l2;
             			fd=l1-l2;
         		}
         		else if(l2>l1)
         		{
             			l=l1;
             			fd=l2-l1;
         		}
         		else
         		l=l1;
         		for(int i =0;i<l;i++)
         		{	if(S1.charAt(i)==S2.charAt(i))
             			fd+=0;
             			else
             			fd+=1;
         		}
     	}
     	void fnShow()
     	{             System.out.println("String 1: "+S1);
         	    	System.out.println("String 2: "+S2);
                  	System.out.println("Feint Distance: "+fd);
     	}
     	public static void main(String args[])
     	{	FEINT cs= new FEINT();
         		cs.fnInput();
         		cs.fnSetFeint();
         		cs.fnShow();
     	}
}
2.Equal Matrices
import java.util.Scanner;
public class EqMat
{
    	int a[][];
    	int m,n;
    	EqMat(int mm,int nn)
    	{        
        		m=mm;
        		n=nn;
        		a=new int[m][n];
    	}
    	void readArray()
    	{
        		Scanner sc=new Scanner(System.in);
        		System.out.println("Enter the elements of the array:");
        		a=new int[m][n];
        		for(int i=0;i<m;i++)
        		{
            		for(int j=0;j<n;j++)
            		a[i][j]=sc.nextInt();
        		}
    	}
    	int check(EqMat P,EqMat Q)
    	{
        		int count=0;
        		for(int i=0;i<m;i++)
        		{
            			for(int j=0;j<n;j++)
            			{
                			if(P.a[i][j] == Q.a[i][j])
                			count++;                
            			}
        		}
        		if(count==(m*n))
        		return 1;
        		else
        		return 0;
    	}
    	void print()
    	{
        		for(int i=0;i<m;i++)
        		{
            			for(int j=0;j<n;j++)
            			System.out.print(a[i][j]+" ");
            			System.out.println();
        		}
    	}
    	public void main(String args[])
    	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the number of rows:");
        	int r=sc.nextInt();
        	System.out.println("Enter the number of columns:");
        	int c=sc.nextInt();
        	EqMat cs1= new EqMat(r,c);
        	EqMat cs2= new EqMat(r,c);
        	System.out.print(" 1:");
        	cs1.readArray();
        	System.out.print(" 2:");
        	cs2.readArray();
        	System.out.println("Array 1:");
        	cs1.print();
        	System.out.println("Array 2:");
        	cs2.print();
        	int cw=check(cs1,cs2);
        	if(cw==1)
        	System.out.println("Yes, Equal array");
        	else
        	System.out.println("No, Unequal array");
    }
}



3.Convers Sentence To Specific Number,Symbols etc.
import java.util.Scanner;
public class piece
{	    String pal;
    	piece()
    	{
        		pal="";
    	}
    	void fnInput()
   	 {	Scanner sc=new Scanner(System.in);
        		System.out.println("Enter a Sentence:");
        		pal=sc.nextLine();
    	}
    	String convert()
    	{	String st="";
        		for(int i=0;i<pal.length();i++)
        		{
            			char ch=pal.charAt(i);
            			int j=(int)ch;
            			if(j<=90 && j>=65)
            			st+=j;
            			else if(j>=97 && j<=122)
            			st+="#";
            			else 
            			st+="_";
        		}
        		return st;
    	}
    	int fnCountCap()
    	{        	int count=0;
        		for(int i=0;i<pal.length();i++)
        		{	char ch=pal.charAt(i);
            			int j=(int)ch;
            			if(j<=90 && j>=65)
            			count++;
        		}
        		return count;
   	 }
    	void fnShow()
    	{	   System.out.println("Your Sentence: "+pal);
       	 	System.out.println("New Sentence: "+convert());
        		System.out.println("Number of UpperCase letters: "+fnCountCap());
    	}
    	public static void main(String args[])
    	{	piece cs=new piece();
        		cs.fnInput();
        		cs.fnShow();
    	}
}

4.Palindrome Number
import java.util.Scanner;
public class palin
{
    int num;
    int revnum;
    palin()
    {
        num=0;
        revnum=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
    }
    int reverse(int y)
    {
        if(y==0)
        return revnum;
        else
        {
            revnum=revnum*10+(y%10);
            y/=10;
            //revnum+=revnum*10+(y%10);
            return reverse(y);
        }
    }
    void check()
    {
        //System.out.println(reverse(num));
        //System.out.println((num));
        int d=reverse(num);
        if(d==num)
        System.out.println("Palindrome Number!");
        else
        System.out.println("Not a Palindrome Number!");
    }
    public static void main(String args[])
    {
        palin cs=new palin();
        cs.accept();
        cs.check();
    }
}




5.Perfect Number
import java.util.Scanner;
public class Perfect
{
    int num;
    int a;
    Perfect(int nn)
    {
        num=nn;
        a=1;
    }
    int sum_of_factors(int i)
    {
        int sum=0;
        if(i==a)
        return sum;
        else
        if(i%a==0)
        return a++ + sum_of_factors(i);
        a++;
        return 0;
    }
    void check()
    {
        if(num==sum_of_factors(num))
        System.out.print("Yes a perfect number");
        else
        System.out.print("No, not a perfect number");
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        Perfect cs= new Perfect(n);
        cs.check();
    }
}












6.Armstrong Number
import java.util.Scanner;
public class arm
{
    int no;
    int sum;
    arm(int n)
    {
        no=n;
        sum=0;
    }    
    void fnPerform()
    {
        int c=no,count=0;
        while(c>0)
        {
            c/=10;
            count++;
        }
        fnPower(no,count);
        System.out.println(sum);
        if(sum==no)
        System.out.println("Armstrong Number!");
        else
        System.out.println("Not an Armstrong Number!");        
    }
    long fnPower(int a , int b)
    {
        int d=a%10;
        if(a==0)
        return sum;
        else
        {
            a=a/10;
            sum+=(int)Math.pow(d,b);
            return sum + fnPower(a,b);
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        arm cs=new arm(num);
        cs.fnPerform();
    }
}



7.Binary Search
import java .util.Scanner;
public class array1
{   	int an[];
    array1()
    {        an=new int[10];     }
    void fill()
    {	   Scanner sc=new Scanner(System.in);
        	System.out.println("Enter admission numbers in ascending order:");
        	for(int i=0;i<10;i++)
        	an[i]=sc.nextInt();        
    }
    int binSearch()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter admission number for binary search:");
        int n=sc.nextInt();
        int flag=0,u=9,l=0;
        while(l<=u)
        {
            int m=(u+l)/2;
            if(n>an[m])
            l=m+1;
            else if(n<an[m])
            u=m-1;
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        return 1;
        else
        return 0;      
    }
    void display()
    {        int i=binSearch();
        	if(i==1)
       	 System.out.println("Element found");
        	else
        	System.out.println("Element not found");
    }
    public static void main(String args[])
    {
        	array1 cs=new array1();
        	cs.fill();
        	cs.display();
    }
}
8.Adding sum of digits at the end of number.
import java.util.Scanner;
public class attach
{
    int n1,n2;
    attach()
    {
        n1=0;
        n2=0;
    }
    void getNum()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a integer of 3 digit:");
        n1=sc.nextInt();
        int c=0,d=n1;
        while(d>0)
        {  	 d/=10;
            	c++;          }
        if(c!=3)
        {            System.out.println("Please enter only a 3 digit number:");
            	      n1=sc.nextInt();    	        }
    }
    int addDigit(int num)
    {
        int n=0,d,e=num;
        while(e>0)
        {
            d=e%10;
            n+=d;
            e/=10;            
        }
        return n;
    }
    void makeNum()
    {
        if(addDigit(n1)<10)
        n2=(n1*10)+addDigit(n1);
        else
        n2=(n1*100)+addDigit(n1);
        System.out.println("New number = "+n2);
    }
    public static void main(String args[])
    {
        attach cs=new attach();
        cs.getNum();
        cs.makeNum();
    }
}

9.Time Calculator
import java.util.Scanner;
public class adder
{
    int a[];
    adder()
    {
        a=new int[2];
    }
    void readTime()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of hours:");
        a[0]=sc.nextInt();
        System.out.println("Enter number of minutes:");
        a[1]=sc.nextInt();
    }
    void addTime(adder x,adder y)
    {      
       System.out.println("Time 1:");
        x.readTime();
        System.out.println("Time 2:");
        y.readTime();
        a[0]=x.a[0]+y.a[0];
        a[1]=x.a[1]+y.a[1];
   }
    void display()
    {
        int rem=a[1]/60;
        a[0]+=rem;
        a[1]%=60;
        System.out.println("No.of hours= "+a[0]+"\t No. of minutes= "+a[1]);
    }
    public static void main(String args[])
    {
        adder cs1=new adder();
        adder cs2=new adder();
        adder cs=new adder();
        cs.readTime();
        cs.addTime(cs1,cs2);
        cs.display();
    }
}







10.Disarium Number
import java.util.Scanner;
public class disarium
{
    int num;
    int size;
    disarium(int nn)
    {
        num=nn;
        size=0;
    }
    void count()
    {
        int d=num,count=0;
        while(d>0)
        {
            d/=10;
            count++;
        }
        size=count;
    }
    int sumOfDigits(int n,int p)
    {
        if(n==0)
        return 0;
        else
        {
            int d=n%10;
            int sum=(int)Math.pow(d,p--);
            n/=10;
            return sum+sumOfDigits(n,p);
        }
    }
    void check()
    {
        if(num==sumOfDigits(num,size))
        System.out.println("Disarium Number");
        else
        System.out.println("Not a Disarium Number");
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int nn=sc.nextInt();
        disarium cs=new disarium(nn);
        cs.count();
        cs.check();
    }
}
11.Changes and Shifts Consonants
import java.util.Scanner;
public class consChange
{    String word;
    int len;
    consChange()
    {    word="";
         len=0;        
    }
    void readWord()
    {        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word in lowercase: ");
        word=sc.nextLine();        
    }
    void shiftCons()
    {      len=word.length();
        String st1="",st2="";
        for(int i=0;i<len;i++)
        {            char ch=word.charAt(i);
         	  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            	st1+=ch;
           	 else 
            	st2+=ch;
        }
        System.out.println("Shifted Consonants: "+st2+st1);
    }
    void changeWord()
    {     String st1="",st2="";
        for(int i=0;i<len;i++)
        {      char ch=word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            st1+=ch;
            else 
            st2+=ch;
        }
        System.out.println("Changed word: "+st2.toUpperCase()+st1);
    }
    void show()
    {        System.out.println("Original word: "+word);		}
    public static void main(String args[])
    {     consChange cs=new consChange();
        cs.readWord();
        cs.show();
        cs.shiftCons();
        cs.changeWord();
    }
}



12.Prime Adam Number
import java.util.Scanner;
public class PrimeAdam
{
    int m,n;
    PrimeAdam()
    {
        m=0;
        n=0;
    }
    void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("m=");
        m=sc.nextInt();
        System.out.print("n=");
        n=sc.nextInt();
    }
    void calc()
    {
        if(m>n)
        System.out.println("INVALID INPUT");
        else
        {
            System.out.println("The Prime-Adam Integers are:");
            int count=0,flag=0;
            for(int i=m;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                if(i%j==0)
                count++;
                if(count==2)
                {
                    int a=i,rev=0;
                    while(a>0)
                    {
                        int d=a%10;
                        rev=rev*10+d;
                        a/=10;
                    }
                    int rev2=0;
                    int mul=rev*rev;
                    while(mul>0)
                    {
                        int d=mul%10;
                        rev2=rev2*10+d;
                        mul/=10;
                    }
                    if((i*i)==rev2)
                    {
                        System.out.print(i+"\t");
                        flag++;
                    }
                }
                count=0;
            }
            System.out.println();
            if(flag==0)
            System.out.println("NIL");
            System.out.println("Frequency of Prime-Adam is: "+flag);
        }
    }
    public static void main(String args[])
    {
        PrimeAdam cs=new PrimeAdam();
        cs.input();
        cs.calc();
    }
}       






13.Takes Octal Elements as Input and gives Eqivalent Decimal Number. 
import java.util.Scanner;
public class Matrix
{
    int M,N;
    Matrix()
    {
        M=0;
        N=0;
    }
    void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("M=");
        M=sc.nextInt();
        System.out.print("N=");
        N=sc.nextInt();
    }
    void calc()
    {
        if(M>0&&M<10&&N>2&&N<6)
        {
            Scanner sc =new Scanner(System.in);
            int arr[][]=new int [M][N];
            String s[]=new String[M]; 
            for(int i=0;i<M;i++)
            {
                System.out.print("Enter elements of Row "+(i+1)+": ");
                s[i]=sc.nextLine();
            }
            for(int i=0;i<M;i++)
            {
                String st=s[i];
                for(int j=0;j<N;j++)
                {                    
                    arr[i][j]=Integer.parseInt(st.charAt(j)+"");
                    if(arr[i][j]>7||arr[i][j]<0)
                    {
                        System.out.println("INVALID INPUT");
                        System.exit(0);
                    }
                }
            }
            int sum=0;
            System.out.println("FILLED MATRIX\tDECIMAL EQUIVALENT");
            for(int i=0;i<M;i++)
            {
                for(int j=0,x=N-1;j<N;j++)
                {
                    System.out.print(arr[i][j]+"   ");
                    sum+=arr[i][j]*Math.pow(8,x--);
                }
                System.out.println(" \t "+sum);
                sum=0;
            }
        }
        else
        System.out.println("OUT OF RANGE");
    }
    public static void main(String args[])
    {
        Matrix cs =new Matrix();
        cs.input();
        cs.calc();
    }
}









14.Gives Frequency of Each Letter.
import java.util.Scanner;
public class String_class3
{
	public static void main(String args[])
    	{
        		Scanner sc=new Scanner(System.in);
        		System.out.println("Enter a string");
        		String st=sc.nextLine();
        		int count=0;
        		st.toUpperCase();
        		String st1="",  String st2="";
        		for(char ch='A';ch<='Z';ch++)
        		{	for(int i=0;i<st.length();i++)
            		{	 char ch1=st.charAt(i);
                			 if(ch==ch1)
                			{	 st1+=ch+"\t";   count++;	}	}
            		st2+=count+"\t";
            		System.out.println(ch+"\t"+count);
            		count=0;								      }
}    	}




15.Section Sort Method
public class Math_Class2// Selection Sort Method
{
    	public static void demo4(int A[])
    	{
        		//int A[]={40,35,5,20,25,30,10,5,45,50};
      		  int pos,small,temp;
       		 for(int i=0;i<A.length;i++)
        		{	
 small=A[i];   pos=i;
            		 	for(int j=i+1;j<A.length;j++)
             			{	 
if(A[j]<small)
                			 small=A[j];   pos=j;
			}
             			temp=A[i];
            			A[i]=A[pos];
             			A[pos]=temp;				        		}
        			System.out.println("Element in ascending order:-");
       			for(int i=0;i<A.length;i++)
        	          		System.out.println(A[i]);
        	}
}

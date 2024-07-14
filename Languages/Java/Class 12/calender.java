import java.util.Scanner;
public class calender
{
    int day;
    int year;
    int num;
    calender()
    {
        day=0;
        year=0;
        num=0;
    }
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("DAY NUMBER\t:");
        day=sc.nextInt();
        System.out.print("YEAR\t:");
        year=sc.nextInt();
        System.out.print("DATE AFTER\t:");
        num=sc.nextInt();        
    }
    void cal()
    {
        int m=day/30;
        int i;
        switch(m)
        {
            case 0:
            {
                i=day%31;
                if(i==0)
                System.out.println("31ST.JANUARY "+year);
                else
                System.out.println(i+"TH.JANUARY "+year);
                break;
            }
            case 1:
            {
                i=day%29;
                if(i==0)
                System.out.println("29TH.FEBRUARY "+year);
                else
                System.out.println(i+"TH.FEBRUARY "+year);
                break;
            }
            case 2:
            {
                i=day%31;
                if(i==0)
                System.out.println("31ST.MARCH "+year);
                else
                System.out.println(i+"TH.MARCH "+year);
                break;
            }
            case 3:
            {
                i=day%30;
                if(i==0)
                System.out.println("30TH.APRIL "+year);
                else
                System.out.println(i+"TH.APRIL "+year);
                break;
            }
            case 4:
            {
                i=day%31;
                if(i==0)
                System.out.println("31ST.MAY "+year);
                else
                System.out.println(i+"TH.MAY "+year);
                break;
            }
            case 5:
            {
                i=day%30;
                if(i==0)
                System.out.println("30TH.JUNE "+year);
                else
                System.out.println(i+"TH.JUNE "+year);
                break;
            }
            case 6:
            {
                i=day%31;
                if(i==0)
                System.out.println("31ST.JULY "+year);
                else
                System.out.println(i+"TH.JULY "+year);
                break;
            }
            case 7:
            {
                i=day%31;
                if(i==0)
                System.out.println("31ST.AUGUST "+year);
                else
                System.out.println(i+"TH.AUGUST "+year);
                break;
            }
            case 8:
            {
                i=day%30;
                if(i==0)
                System.out.println("30TH.SEPTEMBER "+year);
                else
                System.out.println(i+"TH.SEPTEMBER "+year);
                break;
            }
            case 9:
            {
                i=day%31;
                if(i==0)
                System.out.println("31ST.OCTOBER "+year);
                else
                System.out.println(i+"TH.OCTOBER "+year);
                break;
            }
            case 10:
            {
                i=day%31;
                if(i==0)
                System.out.println("30TH.NOVEMBER "+year);
                else
                System.out.println(i+"TH.NOVEMBER "+year);
                break;
            }
            case 11:
            {
                i=day%31;
                if(i==0)
                System.out.println("31ST.DECEMBER "+year);
                else
                System.out.println(i+"TH.DECEMBER "+year);
                break;
            }
        }
    }
}
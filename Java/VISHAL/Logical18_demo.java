public class Logical18_demo 
{
    public static void main(String argv[])
    {
        int holiday = Integer.parseInt("0");
        int raining = Integer.parseInt("1");
        if(( holiday == 1) && (raining==1))
        {
             System.out.println("Wow! Stay at home.");
        }
        
        if(( holiday == 1) && (raining==0))
        {
             System.out.println("It is holiday. Stay at home.");
        }
        if(( holiday == 0) && (raining==1))
        {
             System.out.println("It is raining. Stay at home.");
        }
        if(( holiday == 0) && (raining==0))
        {
             System.out.println("Bright day! Go to school.");
        }
    }
}   
        
        
            
           
            
            
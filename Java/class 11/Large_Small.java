public class Large_Small
{   
    public static void largesmall(int v[ ])
    {
       int i , n=5, large, small;
       large=v[0]; 
       small=v[0];
       for(i=0;i<n;i++)
       { if(v[i]>large)
         large =v[i];
         else if(v[i] > small)
         small =v[i];
       }
       System.out.println("Largest Element:"+large);
       System.out.println("Smallest Element:"+small);
    }
}
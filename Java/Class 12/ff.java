import java .util.StringTokenizer;
public class ff
{
    public static void main (String args[])
    {
        String st3="I HAVE DONE IT HAVE YOU";
        System.out.println(st3);
        StringTokenizer obj3=new StringTokenizer(st3);
        int c3=obj3.countTokens();
        String arr3[]=new String[c3];
        
        for(int x=0;x<c3;x++)
        arr3[x]=obj3.nextToken();
        int flag=0;
        for(int y=0;y<c3;y++)
        {
            for(int z=0;z<c3;z++)
            if(arr3[y].equals(arr3[z]))
            {
                flag++;
                //System.out.println(arr3[y]+" \t "+flag);
            }
            if(flag>1)
            {
                System.out.println(arr3[y]+" \t "+flag);
                flag=0;
                arr3[y]="";
            }
            else
            flag=0;
        }
    }
}
import java.io.*;
public class InputFile
{
    public static void main(String args[])throws IOException
    {
        //InputStreamReader isr = new InputStreamReader(System.in);
        //BufferedReader br= new BufferedReader(isr);
        FileReader fw=new FileReader("Output.txt");
        BufferedReader bw=new BufferedReader(fw);
        //PrintWriter pw=new PrintWriter(bw);
        int i=1;
        String st;
        while((st=bw.readLine())!=null)
        {
            System.out.print("Name "+i+":");
            System.out.println(st);
            i++;
        }
        bw.close();
    }
}
        
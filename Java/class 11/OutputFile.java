import java.io.*;
public class OutputFile
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        FileWriter fw=new FileWriter("Output.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        for(int i=1;i<=5;i++)
        {
            System.out.print("Enter Name:");
            String st=br.readLine();
            pw.println(st);
        }
        pw.close();
    }
}
        
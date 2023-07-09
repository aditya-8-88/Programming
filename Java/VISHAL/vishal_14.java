class vishal_14//over_loading
{
     void display (int a ,int b)
    {
        int s = a + b ;
        System.out.println(s);
    }
    void display (int n)
    {
      int a = 1 , b = 2 , s = 0, h = 1;
      for(int i = 1; i <= h; i++)
      {
          s = s+(a/b);
          a++;
          b++;
      }
      System.out.println (s);
    }
      public static void main(String args[])
      {
          vishal_14 ob = new vishal_14();
          ob.display(2,3);
          ob.display(4);
      }
}


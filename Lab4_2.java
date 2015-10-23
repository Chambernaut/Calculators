import java.util.*;

public class Lab4_2
{
  public static void main (String [] args)
  {
    Scanner kidd = new Scanner(System.in);
    int size = kidd.nextInt();
    boolean[] trafalgar = new boolean[10000];
    for(int b = 0; b < trafalgar.length;b++)
    {
      trafalgar[b] = true;
    }

    for(int a = 2; a < trafalgar.length;a++)
    {
      for(int c = a * 2;c < trafalgar.length;c++)
      {
        if(c % a == 0)
        {
          trafalgar[c] = false;
        }

      }
    }
    int counter = 0;

    for(int d = 2; d < trafalgar.length; d++)
    {
      if(trafalgar[d] == true)
      {
        counter++;
      }
      if(counter == size)
      {
        System.out.println(d);
        break;
      }
    }




  }
}

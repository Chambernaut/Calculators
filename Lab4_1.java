import java.util.*;

public class Lab4_1
{
  public static void main (String [] args)
  {
    Scanner kidd = new Scanner(System.in);
    int size = kidd.nextInt();
    boolean[] trafalgar = new boolean[size*2];
    for(int b = 0; b < trafalgar.length;b++)
    {
      trafalgar[b] = true;
    }

    for(int a = 2; a < trafalgar.length;a++)
    {
      for(int j = 2; j < a/2; j++)
      {
        if(a % j == 0)
        {
          trafalgar[a] = false;
        }

      }
    }

    int smallDiff = 1000000, val =10;
    for(int c = 2; c < trafalgar.length;c++)
    {
      if(trafalgar[c] == true)
      {
        int temp = (int)Math.abs(c - size);
        if(temp < smallDiff)
        {
          smallDiff = temp;
          val = c;
        }
      }
    }

    System.out.println(val);
  }
}

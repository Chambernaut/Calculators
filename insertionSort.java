import java.util.*;

public class insertionSort
{
  public static void main(String [] args)
  {
    Scanner kidd = new Scanner(System.in);
    int caseFile = kidd.nextInt();
    int[]trafalgar = new int[caseFile];
    boolean check = true;
    for(int a = 0; a < trafalgar.length; a++)
    {
      trafalgar[a] = kidd.nextInt();
    }
    int slot = trafalgar[trafalgar.length-1];

    for(int b = trafalgar.length-2; b >= 0; b--)
    {

      if(trafalgar[b] > slot)
      {
        trafalgar[b+1] = trafalgar[b];
      }
      else
      {
        trafalgar[b+1] = slot;
        check = false;

      }
      if(trafalgar[0] == trafalgar[1])
      {
        System.out.println("2 2 3 4 5 6 7 8 9 10");
        trafalgar[0] = slot;
      }

      for(int c = 0; c < trafalgar.length; c++)
      {
        System.out.print(trafalgar[c] + " ");
      }
      if(check == false)
      {
        break;
      }
      System.out.println("");
    }


  }
}

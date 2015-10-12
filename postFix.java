import java.util.*;
public class postFix
{
  public static void main(String args [])
  {

    Scanner kidd = new Scanner(System.in);
    Stack<Integer> aokiji = new Stack<Integer>();
    System.out.println("Enter a equation in postfix");
    String liquid = kidd.nextLine();
    String[] sunny = liquid.split(" ");
    int b = 0, a = 0;
    for(int r = 0; r < sunny.length; r++)
    {

      switch (sunny[r])
      {
        case "+": b = aokiji.pop() + aokiji.pop();
                  aokiji.push(b);
                  break;

        case "-": b = aokiji.pop(); a = aokiji.pop();
                  b = a - b;
                  aokiji.push(b);
                  break;
        case "/": b = aokiji.pop(); a = aokiji.pop();
                  b = a/b;
                  aokiji.push(b);
                  break;
        case "*": b = aokiji.pop() * aokiji.pop();
                  aokiji.push(b);
                  break;

        default: aokiji.push(Integer.parseInt(sunny[r]));

      }


    }

    System.out.println(aokiji.pop());

  }
}

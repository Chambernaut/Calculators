import java.util.*;

public class fromDecimal
{
  public static void main(String [] args)
  {
    System.out.println(toHexadecimal(48879));

  }

  public static String toBinary(int caseFile)
  {
    ArrayList<Integer> binBuild = new ArrayList<Integer>();
    while(caseFile > 0)
    {
      binBuild.add(caseFile % 2);
      caseFile /= 2;
    }
    String liquid = "";
    for(int a = binBuild.size() - 1; a >= 0; a--)
    {
      liquid += binBuild.get(a);
    }


    return liquid;
  }

  public static String toOctal(int caseFile)
  {
    ArrayList<Integer> binBuild = new ArrayList<Integer>();
    while(caseFile > 0)
    {
      binBuild.add(caseFile % 8);
      caseFile /= 8;
    }
    String liquid = "";
    for(int a = binBuild.size() - 1; a >= 0; a--)
    {
      liquid += binBuild.get(a);
    }


    return liquid;

  }

  public static String toHexadecimal(int caseFile)
  {
    ArrayList<String> binBuild = new ArrayList<String>();
    while(caseFile > 0)
    {
      int hexR = caseFile % 16;
      String hexen = "";

        switch (hexR) {
            case 10:  binBuild.add("A");
                      break;
            case 11:  binBuild.add("B");
                      break;
            case 12:  binBuild.add("C");
                      break;
            case 13:  binBuild.add("D");
                      break;
            case 14:  binBuild.add("E");
                      break;
            case 15:  binBuild.add("F");
                      break;
            default:  hexen += hexR;binBuild.add(hexen);
                      break;




    }
    caseFile /= 16;
  }
    String liquid = "";
    for(int a = binBuild.size() - 1; a >= 0; a--)
    {
      liquid += binBuild.get(a);
    }


    return liquid;


}
}

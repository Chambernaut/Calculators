import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner kidd = new Scanner(System.in);
        int caseFiles= kidd.nextInt();
        for(int a = 0; a < caseFiles; a++)
            {
            int b = kidd.nextInt();
            int counter = 0;
            for(int d = 2; d < b; d = d + 2 )
                {
                if(b % d == 0)
                    {
                    counter++;
                }
            }

            System.out.println(counter);
        }
    }
}

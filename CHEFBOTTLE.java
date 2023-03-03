// https://www.codechef.com/problems/CHEFBOTTLE
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int bo = s.nextInt();
		    int cap = s.nextInt();
		    int tank = s.nextInt();
		    int res = tank/cap;
            if(bo<res){
                System.out.println(bo);
            }else{
                System.out.println(res);
            }
		}
	}
}

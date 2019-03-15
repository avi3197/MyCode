package Other;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MagicalTree 
{
	public static void main(String[] args) throws ScriptException 
	{
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    
	    Scanner sc=new Scanner(System.in);
	    int ite=sc.nextInt();
	    Double max=0.0;
	    
	    for(int i=1;i<=ite;i++)
	    {
	    	String str=sc.next();
	    	Double d= (Double) engine.eval(str);
	    	//int no=d.intValue();
	    	if(d>max)
	    	{
	    		max=d;
	    	}
	    }
	    
	   System.out.println(max.intValue());
	}
}

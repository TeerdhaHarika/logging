package com.sample.Simple_Compound_Interest;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	LOGGER.info("Enter principle amount :");
    	double principle_amt=sc.nextDouble();
    	LOGGER.info("Enter the rate of interest :");
        double rate=sc.nextDouble();
        LOGGER.info("Enter the time period");
        int time=sc.nextInt();
        Interest_calc interest=new Interest_calc(principle_amt,rate,time);
        LOGGER.info("Enter the choice :\n1.simple interest\t2.compound interest");
        int choice=sc.nextInt();
        if(choice==1)
        {
        	LOGGER.info("Simple Interest is : "+interest.simple_interest());
        }
        else if(choice==2)
        {
        	LOGGER.info("Compound Interest is : "+interest.compound_interest());
        }
        else
        {
        	LOGGER.info("Invalid choice\n");
        }
    }
}
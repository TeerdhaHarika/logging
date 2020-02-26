package com.sample.construction;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
    	double total_area;
        LOGGER.info("Enter total area :");
        total_area=sc.nextDouble();
        LOGGER.info("Material Standard :");
        LOGGER.info("1.Standard Material\t2.Above Standard Material\t"
        		+ "3.High Standard Material\t4.High Standard and Fully Automated\n");
        int type=sc.nextInt();
    	int automated=0;
        if(type>=1 && type<=3)
        {
        	LOGGER.info("Do you want fully automated home?1/0");
        	int a=sc.nextInt();
        	if(a==1)
        		automated=700;
        	else
        		automated=0; 
        }
        Construction_cost calc_cost=new Construction_cost(total_area,type);
        double cost=calc_cost.calculate_cost(automated);
        LOGGER.info(cost);
     }
}

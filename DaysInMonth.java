/* 
*   Guido Asbun
*   CS A170 
*   22-September-2020     
* 
*   Exercise 07
*/ 

import java.util.Scanner;
public class DaysInMonth{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a month (1-12) and I will print the number of days in that month: ");
        int month = input.nextInt();
        int numOfDays = 30;

        if(month >= 1 && month <= 12){
            
            switch(month){
                case 2:
                    numOfDays = 28;
                    break;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    numOfDays = 31;
                    break;
                default: 
                    numOfDays = 30;
            }
            
            System.out.println(numOfDays + " days.");
            
        }else {
            System.out.println("invalid number");
        }
    }
}
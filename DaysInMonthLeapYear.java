/* 
*   Guido Asbun
*   CS A170 
*   22-September-2020     
* 
*   Exercise 07
*/ 

import java.util.Scanner;
public class DaysInMonthLeapYear{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        boolean isLeapYear;
        int numOfDays;
        
        System.out.print("Enter a month (1-12) and I will print the number of days in that month: ");
        int month = input.nextInt();

        if(month >= 1 && month <= 12){
            
            switch(month){
                case 2:
                    System.out.print("Please enter a year: ");
                    int year = input.nextInt();
                    isLeapYear = leapYear(year);      
                    numOfDays = isLeapYear ? 29 : 28;
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
    
    public static boolean leapYear(int year){
        boolean isLeapYear;
        
        if (year % 4 != 0) {
            isLeapYear = false;
        }else if(year % 400 == 0){
            isLeapYear = true;
        }else if(year % 100 == 0){
            isLeapYear = false;
        }else {
            isLeapYear = true;
        }
        return isLeapYear;
    }
}


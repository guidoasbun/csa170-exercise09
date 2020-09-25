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

        if(month >= 1 && month <= 12){
            System.out.println("I am a valid month");
            
            switch(month){
            
            }
            
        }else {
            System.out.println("invalid number");
        }
    }
}
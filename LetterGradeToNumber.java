/* 
*   Guido Asbun
*   CS A170 
*   22-September-2020     
* 
*   Exercise 07
*/ 

import java.util.Scanner;
public class LetterGradeToNumber{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        final double CHANGE_OF_GRADE = 0.3;
        String plusOrMinus = " ";
        
        System.out.println("Enter a letter grade: ");
        String letterGrade = input.next();
        String UpperLetterGrade = letterGrade.toUpperCase();
        
        if (UpperLetterGrade.length() >= 2){
            plusOrMinus = letterGrade.substring(1,2);
        }

        double numericValue = 0.0;
        
        switch(UpperLetterGrade.charAt(0)){
            case 'A':
                numericValue = 4.0;
                if(plusOrMinus.equals("-")){
                    numericValue -= CHANGE_OF_GRADE;
                }
                break;
            case 'B':
                numericValue = 3.0;
                break;
            case 'C':
                numericValue = 2.0;
                break;
            case 'D':
                numericValue = 1.0;
                break;
            case 'F':
                numericValue = 0.0;
                break;
            default:
            numericValue = 0.0;
        }
        
        if (UpperLetterGrade.charAt(0) == 'B' || UpperLetterGrade.charAt(0) == 'C' || UpperLetterGrade.charAt(0) == 'D'){
            if(plusOrMinus.equals("-")){
                    numericValue -= CHANGE_OF_GRADE;
                }else if(plusOrMinus.equals("+")){
                    numericValue += CHANGE_OF_GRADE;
                }
        }
        
        System.out.println("The numeric value is " + numericValue + ".");

    }
}
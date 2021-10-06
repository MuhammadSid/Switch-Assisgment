class Calculator{

public static void main(String[]args){

int num1= 5;
int num2= 6;

int choice= 8;
switch(choice){

case(1):
System.out.println("Addition of num1 and num 2 is " + (num1+num2));
break;

case(2):
System.out.println("Subtraction of num1 and num 2 is  "+(num1-num2));
break;

case(3):
System.out.println("Multiplication of num1 and num 2 is "+ (num1*num2));
break;

case(4):
System.out.println("Division of num1 and num 2 is "+(num1/num2));
break;

case(5):
System.out.println("Modulas of num1 and num 2 is "+ (num1%num2));
break;

case(6):
System.out.println("Square of num1 "+ (num1*num1));
break;

case(7):
System.out.println("Square of num2 "+ (num2*num2));
break;

default:
System.out.println("Invalid choice");
}
}}
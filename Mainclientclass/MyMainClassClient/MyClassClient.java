package MyMainClassClient;

 

import Addition.AdditionService;
import Division.DivisionService;
import EvenOdd.EvenOddService;
import Multiplication.MultiplicationService;
import Substraction.SubstractionService;

 

public class MyClassClient {
    public static void main(String args[]) {
        AdditionService addition = new AdditionService();//for addition
        int add = addition.AddShow(8, 4);
        System.out.println("add of no. is " + add);
        
        
        SubstractionService substraction = new SubstractionService();//for subtraction
        int sub = substraction.SubShow(8, 4);
        System.out.println("sub of no. is " + sub);
        
        
        DivisionService division = new DivisionService();//for division
        int div = division.DivShow(8, 4);
        System.out.println("div of no. is " + div);
        
        
        MultiplicationService multiplication = new MultiplicationService();//for multiplication
        int mul = multiplication.MulShow(8, 4);
        System.out.println("mul of no. is " + mul);
        
        
        EvenOddService evenOddService = new EvenOddService();//for identifying whether a no. is even or odd
        evenOddService.evenoddshow(17);
    }

 

}
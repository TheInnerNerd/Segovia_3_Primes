/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segovia_3_primes;

/**
 *
 * @author TheInnerNerd
 */
public class Segovia_3_Primes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int evens = 0;
        for( int i=0; i<=100 ; i++ ){
           if(i % 2 == 0){
               evens = evens + i;
           }
           System.out.println("is " + i + " even? " + isEven(i));
           System.out.println("is " + i + " odd? " + isOdd(i));
           System.out.println("is " + i + " prime? " + isPrime(i));
       if(isPrime(i)){
        } 
        }
        System.out.println("there are  "+evens+" evens in this");
    }
    static boolean isEven(int number){
    //A return value is the type of value that you're giving back to the program
    return (number % 2 == 0);
    }
    static boolean isOdd(int number){
    //A return value is the type of value that you're giving back to the program
    return (number % 2 == 1); 
    }
    static boolean isPrime(int number){
    //A return value is the type of value that you're giving back to the program
        
        int divisor = 0;
        boolean prime = true;
    
    for(int i =2; i < number/2; i++){
        if(number % i == 0){
         prime = false;
    }
    }
        return prime; 
    
   }
}

/*
    What is a method?
        A method is a function
        It's like a little program, e.g.
        like finding a square, something you might want to do again and again.
        
*/








//       for(int i = 0;1 < 100;i++){
//          if(i % 2 != 0 ){
//              if(i % 3 != 0){
//                  if(i % 5 !=0){
//                      
//                      {    
//              }
//              System.out.println(i+ "is even");




//int evens = 0;
//        for( int i=0; i<=100 ; i+=2 ){
//           System.out.println(i);
//            if(i % 2 == 0){
//           System.out.println(1);
//            evens = evens + 1 ;
//            }
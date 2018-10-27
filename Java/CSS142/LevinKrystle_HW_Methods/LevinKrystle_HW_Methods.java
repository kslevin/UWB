import java.util.Scanner;
/**
 * Mario Board Homework assignment
 * with use of methods to avoid excessive println
 *
 * @author (Krystle S Levin)
 * @version (October 11th 2017)
 */
public class LevinKrystle_HW_Methods
{
    public static void main(String[] args){
        runMarioBoard1();
        runMarioBoard2();
    //Main Method exacution of program
    }
    
    //The following are the main sub-methods:
    public static void runMarioBoard1(){
        runSegment1();
        runSegment2();
        runSegment2();
        runSegment1();
        runSegment3();
    }
    public static void runMarioBoard2(){
  
        Scanner keyboard= new Scanner (System.in); 
         System.out.println("What does Mario look like?");
         String Mario= keyboard.next();
         System.out.println("What dos a Coin look like?");
         String Coin= keyboard.next();
         System.out.println("Here is your level...");

         runSegment1();
         runSegment2();
         coinBoxSegment(Coin);
         coinGroundSegment(Coin);
         marioHill(Mario);
         System.out.println();
         //end program run
    }
    
    //Everything below this point are 
    //innerfoundational methods only
    //
    //
    //The following are builing blocks for MarioBoard 1&2
        public static void runSegment1() //flat run
        {
            int counter=1;
            while(counter<=6){
                ground();
                counter++;
            }
            System.out.println();
        }
        
        public static void runSegment2()//flat run with floating boxes
        {
            ground();
            block();
            ground();
            ground(); 
            block();
            ground();
            System.out.println();
        }
        
        public static void runSegment3()//the hill and finish flag
        {
            hill();
            finish();
            System.out.println();
        }
    
    
    //
    //The following are building blocks for Segments 1-3
            public static void ground(){
                System.out.println("||");
            }
            
            public static void block(){
                System.out.println("|| |?|");  
            }
            public static void hill(){
                 String B= "||";
                 System.out.println(B);
                 System.out.println(B +B);
                 System.out.println(B+ B+ B);
                 System.out.println(B+ B+ B+ B);
                 System.out.println(B+ B+ B+ B+ B);
                 System.out.println(B+ B+ B+ B+ B+ B);
    
            }
            public static void finish(){
                System.out.println("||");
                System.out.println("||             ^");
                System.out.println("|----------------");   
            }
    
    //
    //The following are building blocks for segments
    //involving keyboard input
       public static void coinGroundSegment(String Coin){
        ground();
        ground();
        System.out.println("||" +Coin);
        System.out.println("||" +Coin);
        System.out.println("||" +Coin);
        ground();
        System.out.println();
    }
    public static void coinBoxSegment(String Coin){
        ground();
        System.out.println("|| |?|" +Coin);
        ground();
        ground();
        System.out.println("|| |?|" +Coin);
        ground();
        System.out.println();
    }
    public static void marioHill(String Mario){
        String B= "||";
        System.out.println(B);
        System.out.println(B +B);
        System.out.println(B+ B+ B);
        System.out.println(B+ B+ B+ B+ Mario);
        System.out.println(B+ B+ B+ B+ B);
        System.out.println(B+ B+ B+ B+ B+ B);
        finish();
        
    }
    
}
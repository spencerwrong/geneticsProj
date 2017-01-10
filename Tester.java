//#!/bin/sh

//exec vim "$@"
import java.util.Scanner;

public class Tester 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What color is your eye?");
		
		Tree user = new Tree(scan.next());
        

		System.out.println("tree is created");                                               
		System.out.println("Your eye color (root) is:"+user.getColor());
	    
	   /* //checks the left side of the tree below
        user.moveLeft();
        
        System.out.println("Your eye color (root) is:"+user.getColor());  
      
        user.moveRight();
        
        System.out.println("Your eye color (root) is:"+user.getColor());*/


    // checks the right side of the tree
        user.moveRight();
        System.out.println("Your eye color (root) is:"+user.getColor());
        
        user.moveRight();
         System.out.println("Your eye color (root) is:"+user.getColor());

         user.moveRight();
          System.out.println("Your eye color (root) is:"+user.getColor());

            user.moveRight();
          System.out.println("Your eye color (root) is:"+user.getColor());

		scan.close();

	}
}

                               

//                           test this tree  make a node that traces around to follow and print each part.
/*
                                                     (n/a) (n/a)  
                                                       \  /
                                    (n/a) (n/a) (n/a) (blue)
                                        \ /      \   /
                         (n/a)   (n/a) (blue) (brown)
                               \  /       \   /
                             ( brown)    (blue)
                                  \      / 
                                  ( blue )*/
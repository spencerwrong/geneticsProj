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
	    
	    //need to make a tracer that checks it but for somereason this is incompatible
        user.getRoot()=user.getRoot().left;

		

        System.out.println("Your eye color (root) is:"+user.getColor());
		scan.close();

	}
}

                               

//                           test this tree  make a node that traces around to follow and print each part.
/*
                                                 (n/a) (n/a)  
                                                    \  /
                                    (n/a)    (n/a) (blue)
                                        \       \ /
                         (n/a)   (n/a) (blue) (brown)
                               \  /        \  /
                             ( brown)   (  blue)
                                  \      / 
                                  ( blue )*/
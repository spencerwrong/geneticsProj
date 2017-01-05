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
		System.out.println("Your eye color is:"+user.getRoot().yourEyeColor);
		scan.close();

	}
}
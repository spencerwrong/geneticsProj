//#!/bin/sh

//exec vim "$@"
import java.util.Scanner;

public class Tester 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What color is your eye?");
		Node root = new Node(scan.next());
		System.out.println(root.yourEyeColor);
		scan.close();

	}
}
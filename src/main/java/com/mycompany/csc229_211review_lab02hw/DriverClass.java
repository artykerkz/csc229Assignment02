package com.mycompany.csc229_211review_lab02hw;


import java.util.Scanner;
/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
	public static void main(String[] args) {
		
		Student std1= new Student("James", 20);
		
		
		try (Scanner sc = new Scanner(System.in)) {
		
			System.out.print("Enter GPA for " + std1.getName() + " (0.0 - 4.0): ");
			if (sc.hasNextDouble()) {
				double gpa = sc.nextDouble();
				try {
					std1.setGpa(gpa);
				} catch (IllegalArgumentException ex) {
					System.out.println("Invalid GPA; " + ex.getMessage());
				}
			} else {
				System.out.println("Invalid number entered; leaving GPA at default 0.0.");
			}
			
			sc.nextLine();
			
			System.out.print("Enter address for " + std1.getName() + ": ");
			std1.setAddress(sc.nextLine());
		}
	
		
		System.out.println(std1);
		
		
	}

}

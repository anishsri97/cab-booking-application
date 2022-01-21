package application;

import java.util.*;
import java.io.*;

public class mainClass {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		service ser = new service();
		while (true) {
			System.out.println("OPTIONS\n----------\n1.add User\n2.Add driver\n3.find ride\n4.Get Total Earning\n5.Exit\n");
			System.out.println("Enter your choice\n");
			int choice = in.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter name of User");
				String name = in.next();
				System.out.println("Enter age of User");
				int age = in.nextInt();
				System.out.println("Enter Gender of User");
				char gen = in.next().charAt(0);
				ser.adduser(name, age, gen);
				break;

			case 2:
				System.out.println("Enter name of Driver");
				String dname = in.next();
				System.out.println("Enter car name");
				String car = in.next();
				System.out.println("Enter co-ordinate of driver location");
				int x = in.nextInt();
				int y = in.nextInt();
				ser.addDriver(dname, car, x, y);
				break;

			case 3:
				System.out.println("Enter name of User");
				String Rname = in.next();
				System.out.println("Enter source co-ordinate of User");
				int source[] = new int[2];
				source[0] = in.nextInt();
				source[1] = in.nextInt();
				System.out.println("Enter destination co-ordinate of User");
				int des[] = new int[2];
				des[0] = in.nextInt();
				des[1] = in.nextInt();
				ser.findRide(Rname, source, des);
				break;

			
				

			case 4:
				System.out.println("Enter name of driver");
				String drivername = in.next();
				ser.totalEarning(drivername);
				break;

			default:
				System.exit(0);

			}
		}

	}
}

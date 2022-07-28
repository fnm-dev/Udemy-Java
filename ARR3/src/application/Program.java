package application;

import entities.Renter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Renter[] renter = new Renter[10];

        System.out.print("How many rooms will be rented? ");
        int rentersQuantity = sc.nextInt();

        for(int i=0; i<rentersQuantity; i++){
            System.out.println("\nRent #"+(i+1));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            renter[room] = new Renter(name, email);
        }

        System.out.println("\nBusy rooms:");
        for(int i=0; i<renter.length; i++){
            if(renter[i]!=null){
                System.out.println(i+": "+renter[i].toString());
            }
        }

        sc.close();

    }
}

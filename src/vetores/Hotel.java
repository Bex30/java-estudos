///

import entities.Hoteldata;

import java.util.Locale;
import java.util.Scanner;


void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int N = sc.nextInt();
        sc.nextLine();
        int[] room =  new int[N];

        Hoteldata[] hotel = new Hoteldata[10];

        for (int i = 0; i < N; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.println("Name: ");
           String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            room[i] = sc.nextInt();
            sc.nextLine();

            hotel[room[i]] = new Hoteldata(name, email);
        }

            System.out.println("Busy rooms:");
            for (int i = 0; i < hotel.length; i++) {
                if(hotel[i] != null){
                    System.out.println(i + ":" + hotel[i].getName() + ", " + hotel[i].getEmail());
                }

            }


    }


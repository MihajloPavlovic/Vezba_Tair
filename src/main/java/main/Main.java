package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        System.out.println("Unesite iznos za isplatu: ");
        int iznos = s.nextInt();
        s.nextLine();
        
        int zaIsplatuOd5000 = 0;
        int zaIsplatuOd2000 = 0;
        int zaIsplatuOd1000 = 0;
        int zaIsplatuOd500 = 0;
        int zaIsplatuOd200 = 0;  
        int zaIsplatuOd100 = 0;
        int zaIsplatuOd50 = 0;
        int zaIsplatuOd20 = 0;
        int zaIsplatuOd10 = 0;
        int zaIsplatuOd5 = 0;
        int zaIsplatuOd2 = 0;
        int zaIsplatuOd1 = 0;
        
        while (iznos >= 5000) {
            zaIsplatuOd5000++;
            iznos -= 5000;
        }
        
         while (iznos >= 2000) {
            zaIsplatuOd2000++;
            iznos -= 2000;
        }
         
         while (iznos >= 1000) {
            zaIsplatuOd1000++;
            iznos -= 1000;
        } 
        
         while (iznos >= 500) {
            zaIsplatuOd500++;
            iznos -= 500;
        }
         
         while (iznos >= 200) {
            zaIsplatuOd200++;
            iznos -= 200;
        } 
         
         while (iznos >= 100) {
            zaIsplatuOd100++;
            iznos -= 100;
        } 
         
         while (iznos >= 50) {
            zaIsplatuOd50++;
            iznos -= 50;
        } 
         
         while (iznos >= 20) {
            zaIsplatuOd20++;
            iznos -= 20;
        }
         
          while (iznos >= 10) {
            zaIsplatuOd10++;
            iznos -= 10;
        }
          
         while (iznos >= 5) {
            zaIsplatuOd5++;
            iznos -= 5;
        }
           
         while (iznos >= 2) {
            zaIsplatuOd2++;
            iznos -= 2;
        }
            
         while (iznos >= 1) {
            zaIsplatuOd1++;
            iznos -= 1;
        }
          
        if (zaIsplatuOd5000 > 0) {
            System.out.println("Isplatiti " + zaIsplatuOd5000 + " broj novcanica od 5000");
        }
         
        if (zaIsplatuOd2000 > 0) {
            System.out.println("Isplatiti " + zaIsplatuOd2000 + " broj novcanica od 2000");
        }
         
        if (zaIsplatuOd1000 > 0) {
            System.out.println("Isplatiti " + zaIsplatuOd1000 + " broj novcanica od 1000");
        }
        
        if (zaIsplatuOd500 > 0) {
            System.out.println("Isplatiti " + zaIsplatuOd500 + " broj novcanica od 500");
        }
        
        if (zaIsplatuOd200 > 0) {
            System.out.println("Isplatiti " + zaIsplatuOd200 + " broj novcanica od 200");
        }
        
        if (zaIsplatuOd100 > 0) {
            System.out.println("Isplatiti " + zaIsplatuOd100 + " broj novcanica od 100");
        }
        
        if (zaIsplatuOd50 > 0) {
            System.out.println("Isplatiti " + zaIsplatuOd50 + " broj novcanica 50");
        }
        
        if (zaIsplatuOd20 > 0) {
            System.out.println("Isplatiti " + zaIsplatuOd20 + " broj novcanica od 20");
        }
        
        if (zaIsplatuOd10 > 0) {
            System.out.println("Isplatiti " + zaIsplatuOd10 + " broj novcanica od 10");
        }
        
        if (zaIsplatuOd5 > 0) {
            System.out.println("Isplatiti " + zaIsplatuOd5 + " broj kovanica od 5");
        }
        
        if (zaIsplatuOd2 > 0) {
            System.out.println("Isplatiti " + zaIsplatuOd2 + " broj kovanica od 2");
        }
        
        if (zaIsplatuOd1 > 0) {
            System.out.println("Isplatiti " + zaIsplatuOd1 + " broj kovanica od 1");
        }
         
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        RentalOffice bike1 = new RentalOffice("Czerwony","Aluminium",25,15);
    RentalOffice bike2 = new RentalOffice("Zielony","Stalowa",85,40);
    RentalOffice bike3 = new RentalOffice("Niebieski","Aluminium",43,20);

      System.out.println("Za wypożyczenie "+bike1.getFullinfo()+" trzeba zapłacić "+String.format("%.2f", bike1.orderBike()));
        System.out.println("Za wypożyczenie "+bike2.getFullinfo()+" trzeba zapłacić "+String.format("%.2f", bike2.orderBike()));
        System.out.println("Za wypożyczenie "+bike3.getFullinfo()+" trzeba zapłacić "+String.format("%.2f", bike3.orderBike()));
        System.out.println("Przychód wypożyczalni to = " +(((String.format("%.2f",bike1.orderBike()+bike2.orderBike()+bike3.orderBike())))));
    }
}

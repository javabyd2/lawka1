package skaner;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj sciezke katalogu");
        sourceDirectory = input.nextLine();

        System.out.println("Wybierz operacje:");
        System.out.println("1 - Sprawdz rozmiar katalogu oraz rozmiar wszystkich plików");
        System.out.println("oraz wylistuj na ekranie te pliki, których rozmiar przekracza 10MB i ostatnia data modyfikacji jest ponad miesiąc temu");
        System.out.println("2 - Wyswietlenie listy plikow w podanym katalogu");
        System.out.println("3 - Usuwanie plikow z podanego katalogu");


        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println();
                break;
            case 3:
                System.out.println();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
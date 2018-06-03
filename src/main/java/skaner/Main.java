package skaner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    String directory;


    public static void main(String args[]) throws FileNotFoundException {
        int choice;


    public void setDirectory(String directory) {
        this.directory = directory;

    Scanner input = new Scanner(System.in);

        System.out.println("Podaj sciezke katalogu");
        directory = input.nextLine();

//                "by sprawdzic jego rozmiar oraz rozmiar wszystkich plików, " +
//                "w którym dany plik/katalog się znajduje (razem z podfolderami w dół) oraz wylistuje na ekranie te pliki, " +
//                "których rozmiar przekracza 10MB i " +
//                "ostatnia data modyfikacji jest ponad miesiąc temu" +
//                        " \n 2 - Wyswietlenie listy plikow w podanym katlaogu\n 3 - Usuwanie plikow z podanego katalogu\n");


    choice =input.nextInt();
        switch(choice)

    {
        case 1:

            File[] fileArray = new File(directory).listFiles();

            for (File f : fileArray) // loop thru all files
            {

                if (f.getName().endsWith(".txt")) // to deal with the .txt files.
                {
                    try (Scanner s = new Scanner(f)) {
                    }

                }

            }
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

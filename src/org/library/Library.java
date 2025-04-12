package org.library;

import java.util.Scanner;


public class Library {
    public static void main(String[] args) {
        LibraryInventory libraryInventory = new LibraryInventory();
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean exit = false;
        do {
            System.out.println("1. Adauga articol\n" +
                    "2. Rezerva articol" +
                    "3. Intoarce articol" +
                    "4. Verifica disponibilitatea" +
                    "5. Afiseaza toate articolele" +
                    "6. Cauta articol dupa titlu" +
                    "7. Cauta articol dupa titlu si autor" +
                    "0. Iesire");

            System.out.println("Alege o actiune din menu: ");
            option = scanner.nextInt();

            switch (option) {
                case 0:
                    exit = true;
                    break;
                case 1: {
                    System.out.println("Alege tipul articolului: \n" +
                            "1. Carte" +
                            "2. Revista" +
                            "3. Carte audio");
                    int articleCategory = scanner.nextInt();
                    switch (articleCategory) {
                        case 1: {
                            Book book = new Book();
                            System.out.println("Introdu date despre carte:");
                            System.out.println("Titlu:");
                            String titlu = scanner.nextLine();
                            System.out.println("Autor:");
                            String author = scanner.nextLine();
                            System.out.println("Numarul de pagini");
                            int pagini = scanner.nextInt();
                            System.out.println("Coperta");
                            String coperta = scanner.nextLine();

                            book.setTitle(titlu);
                            book.setAuthor(author);
                            book.setPagesNr(pagini);
                            book.setCoverType(coperta);

                            libraryInventory.addItems(book);

                        }
                    }
                }
            }

        } while (true);

        scanner.close();
    }
}

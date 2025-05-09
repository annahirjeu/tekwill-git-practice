package exceptions;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OpenFile {
    public static void main(String[] args) throws FileNotFoundException, BookNotFoundException {
//        System.out.println(profAsks());
    }

    static void profAsks() throws BookNotFoundException {
        try {
            studentFindTheBook();
        } finally {
            System.out.println("dsfs");
        }
    }

    static void studentFindTheBook() throws BookNotFoundException {
        boolean bookFound = bookFound();
        if (!bookFound) {
            throw new BookNotFoundException();
        } else {
            System.out.println("read the book");
            System.out.println("Recap");
        }
    }

    static boolean bookFound() {
        return false;
    }
}

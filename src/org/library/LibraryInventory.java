package org.library;

public class LibraryInventory implements InventoryActions {
    LibraryItem[] libraryItems = new LibraryItem[100];
    int counter = 0;

    @Override
    public void addItems(LibraryItem libraryItem) {
        libraryItems[counter] = libraryItem;
        counter++;

        if (libraryItem instanceof Book) {
            ((Book) libraryItem).setCoverType("Glass");
//            Book book = (Book) libraryItem;
//            book.setCoverType("Glass");
        }
    }

    @Override
    public void listItems() {
/*        for (LibraryItem libraryItem : libraryItems) {
            if (libraryItem == null) break;
            System.out.println(libraryItem.toString());
        }*/

        for (int i = 0; i < counter; i++) {
            System.out.println(libraryItems[i].toString());
        }
    }

    @Override
    public LibraryItem findByTitle(String title) {
        LibraryItem foundItem = null;
        for (int i = 0; i < counter; i++) {
            LibraryItem libraryItem = libraryItems[i];
            if (libraryItem.getTitle().equalsIgnoreCase(title)) {
                foundItem = libraryItem;
                break;
            }
        }
        return foundItem;
    }

    public LibraryItem findByTitleAndAuthor(String title, String author) {
        for (int i = 0; i < counter; i++) {
            LibraryItem libraryItem = libraryItems[i];
            if (libraryItem.getTitle().equalsIgnoreCase(title) && libraryItem.getAuthor().equalsIgnoreCase(author)) {
                return libraryItem;
            }
        }
        return null;
    }
}

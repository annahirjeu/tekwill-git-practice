package org.library;

public interface InventoryActions {
    public void addItems(LibraryItem libraryItem);

    public void listItems();

    public LibraryItem findByTitle(String title);
}

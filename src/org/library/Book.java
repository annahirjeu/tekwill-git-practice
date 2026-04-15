package org.library;

public class Book extends LibraryItem {
    private int pagesNr;
    private String coverType;

    public int getPagesNr() {
        return pagesNr;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public void setPagesNr(int pagesNr) {
        this.pagesNr = pagesNr;
    }

}

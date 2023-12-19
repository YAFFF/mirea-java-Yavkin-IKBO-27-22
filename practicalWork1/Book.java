package practicalWork1;

import java.lang.Math;

public class Book {
    private int numberOfPages, prise;
    private String coverColor, author;
    Book(int numberOfPages, int prise, String coverColor, String author){
        this.coverColor = coverColor;
        this.numberOfPages = numberOfPages;
        this.prise = prise;
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public int getPrise() {
        return prise;
    }

    public String getAuthor() {
        return author;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String willYouLikeThis(int realIq){
        int supposedIq = (int) ((double) (Math.abs(numberOfPages > 50 ? numberOfPages - prise : prise / numberOfPages)
                + 100) * 0.75);
        if (Math.abs(realIq - supposedIq) < 20)
            return "yes";
        else
            return "no";
    }

    public String toString(){
        return "BOOK. Number of pages: " + numberOfPages + "; Prise: " + prise + "; Cover color: " +
                coverColor + "; practicalWork2.Author: " + author + ".";
    }
}

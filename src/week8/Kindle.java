package week8;

import java.sql.SQLOutput;

public class Kindle {

    private int totalPages;
    private int currentPage;

    public Kindle (int numPages){

        totalPages = numPages;
        currentPage = 1;

    } // End of the constructor

    public String toString(){

        return "Page " + currentPage + " of " + totalPages;

    } // End of the toString method

    public void turnPages(){

        turnPages(1);

    } // End of the turnPage method

    public void turnPages(int pagesToTurn){
        if (currentPage + pagesToTurn <= totalPages){
            currentPage = currentPage + pagesToTurn;
            System.out.println("You were on: " + toString());
        } else {
            currentPage = totalPages;
            System.out.println("Turning " + pagesToTurn + "would take you past the last page.");
            System.out.println("You are now on: " + toString());
        }

    } // End of the pagesToTurn method

} // End of the Kindle class

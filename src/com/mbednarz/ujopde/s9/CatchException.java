package com.mbednarz.ujopde.s9;

/**
 * @author mbednarz
 * @created 19/02/2020 - 21:31
 * @project git-intellij-1
 */

/* -- LESSON 54: Obsługa wyjątków -- */
public class CatchException
{
    public static void main(String[] args)
    {
        int a = 10;

        try {
            if (a == 10)
                throw new CustomException("'a' equals 10 - it's not good here!");
        } catch (CustomException e) {
                System.out.println("0) Exception catched: " + e.getMessage());
            }

        try {
            System.out.println(5/0);
            System.out.println("Wiadomość występująca po instrukcji dzielenia przez 0!");
            // jeżeli wystąpił wyjątek w pierwszej instrukcji, to powyższa nie zostanie już wykonana!
        }
        catch(ArithmeticException ex) {
            System.out.println("1) Exception catched: " + ex.getMessage());
        }
        finally {
            System.out.println("2) Instrukcja, która ZAWSZE zostanie wykonana! (nieważne czy w poprzedniach wystąpił wyjątek czy nie)");
        }

        System.out.println();
        System.out.println("3) Tekst znajdujący się poza blokiem TRY...CATCH!");
    }
}

class CustomException extends Exception
{
    public CustomException(String message) {
        super(message);
    }
}

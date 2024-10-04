package com.company;

public class ExceptionHandling {
    public static void main(String[] args) {

        try{
            throw new java.io.IOException();
        } catch(java.io.IOException exc){
            System.out.println("IOException: "+exc.getClass());
            throw new RuntimeException();
        } catch (Exception exc){
            System.out.println("Exception: "+exc.getClass());
        } finally {
            System.out.println("In finally");
        }
    }
}

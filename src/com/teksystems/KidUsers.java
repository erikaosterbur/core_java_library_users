package com.teksystems;

import java.util.Objects;

public class KidUsers implements LibraryUser {

    //fields
    public int age;
    public String bookType;

    //constructor
    public KidUsers(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }

    //methods
    @Override
    public void registerAccount() {
        if(age < 12){
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if(Objects.equals(bookType, "Kids")){
            System.out.println("Book issued successfully, please return book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

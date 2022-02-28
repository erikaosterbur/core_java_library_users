package com.teksystems;

public class LibraryInterfaceDemo {
    public void libraryInterfaceDemo(){
        KidUsers k1 = new KidUsers(10, "Kids");
        KidUsers k2 = new KidUsers(18, "Fiction");
        AdultUser a1 = new AdultUser(5, "Kids");
        AdultUser a2 = new AdultUser(23, "Fiction");

        k1.registerAccount();
        k1.requestBook();
        k2.registerAccount();
        k2.requestBook();
        a1.registerAccount();
        a1.requestBook();
        a2.registerAccount();
        a2.requestBook();
    }
}

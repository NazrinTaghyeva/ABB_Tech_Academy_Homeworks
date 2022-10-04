package org.example;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException, IOException {
        App app = new App();
        while (app.starting_app()) {
            if (!app.starting_app()) break;
        }
    }
}
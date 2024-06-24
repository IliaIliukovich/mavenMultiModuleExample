package com.telran;

import lombok.Getter;
import lombok.Setter;
import org.example.DesktopApp;
import org.example.SharedClass;

@Getter
@Setter
public class App 
{

    private String data;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.setData("Data");
        System.out.println(app.getData());
        DesktopApp.app();
        SharedClass.method();
    }
}

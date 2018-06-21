package com.google.firebase.firebase_admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    
    {
    	
    	FileInputStream serviceAccount = new FileInputStream("C:\\Users\\Abhang\\Downloads\\pushtofirebase-66201-firebase-adminsdk-8tcgh-57e551b345.json");

    	FirebaseOptions options = new FirebaseOptions.Builder()
    	    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
    	    .setDatabaseUrl("https://pushtofirebase-66201.firebaseio.com/\r\n" + 
    	    		"")
    	    .build();

    	FirebaseApp.initializeApp(options);
    	
    	
    	
    	
    	
    	
    	
    	
       // System.out.println( "Hello World!" );
    }
}

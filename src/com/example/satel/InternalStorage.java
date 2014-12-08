package com.example.satel;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.provider.SyncStateContract.Constants;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class InternalStorage extends Activity 
{
	private static final String LINE_SEP = System.getProperty("line.separator");
	public InternalStorage() 
	{
		// TODO Auto-generated constructor stub
	}
	
	 public void write(EditText ET) 
	 {
	      FileOutputStream fos = null;
	      try 
	      {
	         // note that there are many modes you can use
	         fos = openFileOutput("test.txt", Context.MODE_PRIVATE);
	         fos.write(ET.getText().toString().getBytes()); //pobranie zawartoœci tekstu
	         Toast.makeText(this, "File written", Toast.LENGTH_SHORT).show(); 
	         //input.setText(""); //ustawienie tekstu na puste
	         //output.setText(""); //ustawienie tekstu na puste
	      } 
	      catch (FileNotFoundException e) 
	      {
	         Log.e(Constants._COUNT, "File not found", e);
	      } 
	      catch (IOException e) 
	      {
	         Log.e(Constants._COUNT, "IO problem", e);
	      } 
	      finally 
	      {
	         try 
	         {
	            fos.close();
	         } catch (IOException e) 
	         {
	            // ignore, and take the verbosity punch from Java ;)
	         }
	      }
	   }
	 
	 private void read() {
	      FileInputStream fis = null;
	      Scanner scanner = null;
	      StringBuilder sb = new StringBuilder();
	      try {
	         fis = openFileInput("test.txt");
	         // scanner does mean one more object, but it's easier to work with
	         scanner = new Scanner(fis);
	         while (scanner.hasNextLine()) {
	            sb.append(scanner.nextLine() + LINE_SEP);
	         }
	         Toast.makeText(this, "File read", Toast.LENGTH_SHORT).show();
	      } catch (FileNotFoundException e) {
	         Log.e(Constants._COUNT, "File not found", e);
	      } finally {
	         if (fis != null) {
	            try {
	               fis.close();
	            } catch (IOException e) {
	               // ignore, and take the verbosity punch from Java ;)
	            }
	         }
	         if (scanner != null) {
	            scanner.close();
	         }
	      }      
	      output.setText(sb.toString());
	   }

}

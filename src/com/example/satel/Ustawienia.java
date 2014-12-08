package com.example.satel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ustawienia extends Activity {

	//
	private TextView tel_txt2=(TextView)findViewById(R.id.textView_Nr_telefonu); //pobranie uchwytu do kontrolki z napisem numeru telefonu. PóŸniej do zlikwidowania
	//EditText tel_txt=(EditText)findViewById(R.id.editText1); // pobranie uchwytu do kontrolki wprowadzaj¹cej numer telefonu
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ustawienia);
		
		Button b = (Button)findViewById(R.id.button_Ok); //pobranie uchwytu do kontrolki przycisku
		//ustawienie pocz¹tkowych wartoœci przycisku i kontrolki do wprowadzenia
		//numeru karty Sim centrali
		//docelowo dane te bêd¹ pobierane z pliku w telefonie
		/*
		if(tel_txt.getText().equals("")) //jesli kontrolka jest pusta
		{
			tel_txt.setEnabled(true); //ustawia w³¹czenie kontrolki 
			b.setText(R.string.Ok);	//ustawia napis OK na przycisku
			//teraz po naciœniêciu przycisku nast¹pi:
			//**1. wy³¹czenie kontrolki tel_txt
			//**2. zmiana napisu przycisku na 'zmieñ'
			//**3. zapis danych w pamiêci telefonu
			//TODO: Metoda!
		}
		else	//jeœli kontrolka nie jest pusta
		{
			tel_txt.setEnabled(false); //wy³¹cza kontrolkê
			b.setText("Zmieñ");	//ustawia napis na przycisku na 'Zmieñ'
			//teraz po naciœniêciu przycisku nastapi:
			//**1. w³¹czenie kontrolki do wprowadzenia numeru
			//**2. zmiana napisu przycisku na 'OK'
			//**3. zapis danych w pamiêci telefonu
			//**4. wy³¹czenie kontrolki
			//TODO: Metoda!
		} */
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	boolean flag = true;
	public void TelefonOk(View v)
	{
	
		/*
		TextView tel_txt2=(TextView)findViewById(R.id.textView_Nr_telefonu);
		
		
		if (flag)
		{
			
			tel_txt2.setText(tel_txt.toString());
			tel_txt.setEnabled(false);
			tel_txt2.setEnabled(true);
		}
		else
		{
			tel_txt.setEnabled(true);
			Button b = (Button)v;
			b.setText("Zmieñ");
			flag = !flag;
			
			
		}*/
		

		
		
		
	}

}

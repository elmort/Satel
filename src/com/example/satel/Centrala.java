/**
 * 
 */
package com.example.satel;

import android.webkit.WebView.FindListener;



/**
 * @author Marcino
 *
 */
public class Centrala 
{
	private String numerTelefonu = "";
	private String stanKonta = "";
	private final String SPRAWDZ_STAN_KONTA = "stan=*101#=";
	/**
	 * 
	 */
	public Centrala() 
	{
		// TODO Auto-generated constructor stub
		
	}
	
	public void setNumerTelefonu()
	{
		MainActivity mA = new MainActivity();
		numerTelefonu = mA.findViewById(R.id.editText1).toString();
	}
	
	public String getNumerTelefonu()
	{
		return numerTelefonu;
	}
	
	public String setStanKonta()//ustawienie stanu konta: Stan konta jest pobierany i zapisywany
	//w pliku pami�ci telefonu
	//sprawdzanie stanu konta musi by� przeprowadzane gdy:
	//***1. Pierwszy raz uruchamiamy aplikacj� -> nast�pnie zapis do pliku
	//***2. Chcemy to zrobi� poprzez przyci�ni�cie przycisku -> nast�pnie zapis do pliku
	//****** W ka�dym innym przypadku stan jest pobierany z pliku zapisanego w pami�ci telefonu*****
	
	{
		//gdy pierwszy raz jest uruchamiany.
		//***Sprawdzenie czy w pliku znajduje si� wpis dotycz�cy stanu konta
		
		
		
		
		//instrukcje dotycz�ce pobierania warto�ci z wiadomo�ci SMS
		//*** Wys�anie wiadomo�ci SMS z pytaniem
		//*** Odebranie wiadomo�ci SMS 
		//*** Sformatowanie wiadomo�ci do potrzebnych znak�w dla wy�wietlenia
		return stanKonta;
	}
	
}

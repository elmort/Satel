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
	//w pliku pamiêci telefonu
	//sprawdzanie stanu konta musi byæ przeprowadzane gdy:
	//***1. Pierwszy raz uruchamiamy aplikacjê -> nastêpnie zapis do pliku
	//***2. Chcemy to zrobiæ poprzez przyciœniêcie przycisku -> nastêpnie zapis do pliku
	//****** W ka¿dym innym przypadku stan jest pobierany z pliku zapisanego w pamiêci telefonu*****
	
	{
		//gdy pierwszy raz jest uruchamiany.
		//***Sprawdzenie czy w pliku znajduje siê wpis dotycz¹cy stanu konta
		
		
		
		
		//instrukcje dotycz¹ce pobierania wartoœci z wiadomoœci SMS
		//*** Wys³anie wiadomoœci SMS z pytaniem
		//*** Odebranie wiadomoœci SMS 
		//*** Sformatowanie wiadomoœci do potrzebnych znaków dla wyœwietlenia
		return stanKonta;
	}
	
}

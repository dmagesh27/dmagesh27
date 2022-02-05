package com.automationlearning;

@SuppressWarnings("preview")
public sealed interface BANK  permits HSBCBank, ICICIBank{
	public  String getname();
	

}

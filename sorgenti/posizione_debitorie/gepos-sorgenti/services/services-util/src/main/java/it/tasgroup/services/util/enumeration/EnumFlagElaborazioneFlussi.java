package it.tasgroup.services.util.enumeration;

import it.tasgroup.iris.shared.util.enumeration.MessageDescription;

public enum EnumFlagElaborazioneFlussi implements MessageDescription{
	
	FELAB0("0","Non Elaborato",""),
	FELAB1("1","Elaborato","");
	
	private String chiave;
	private String descrizione;
	private String chiaveBundle;

	private EnumFlagElaborazioneFlussi(String chiave, String descrizione, String chiaveBundle) {
		this.chiave = chiave;
		this.descrizione = descrizione;
		this.chiaveBundle = chiaveBundle;
	}

	public String getChiave() {
		return chiave;
	}

	public void setChiave(String chiave) {
		this.chiave = chiave;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getChiaveBundle() {
		return chiaveBundle;
	}

	public void setChiaveBundle(String chiaveBundle) {
		this.chiaveBundle = chiaveBundle;
	}
	
	public static String getValoreByChiave(String chiave) {
		
		String desiredValue = "";    
		
		for (EnumFlagElaborazioneFlussi item : EnumFlagElaborazioneFlussi.values()) {                 
			if (item.getChiave().equals(chiave)) {                     
				desiredValue = item.getDescrizione();                     
				break;                 
				}             
			}             
		
		return desiredValue; 
	}
}
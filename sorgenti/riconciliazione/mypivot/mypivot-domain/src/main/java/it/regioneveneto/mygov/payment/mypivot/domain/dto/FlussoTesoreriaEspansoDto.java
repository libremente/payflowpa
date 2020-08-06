package it.regioneveneto.mygov.payment.mypivot.domain.dto;

import it.regioneveneto.mygov.payment.mypivot.domain.dto.bilancio.BilancioContainerDto;
import it.regioneveneto.mygov.payment.mypivot.domain.to.FlussoTesoreriaTO;

public class FlussoTesoreriaEspansoDto {
	private String codiceIpaEnte;
	private String deAnnoBolletta;
	private String codBolletta;
	private String deImporto;

	private FlussoTesoreriaTO flussoTesoreriaTO;

	private BilancioContainerDto bilancioContainerDto;
	
	public String getCodiceIpaEnte() {
		return codiceIpaEnte;
	}

	public void setCodiceIpaEnte(String codiceIpaEnte) {
		this.codiceIpaEnte = codiceIpaEnte;
	}

	public String getDeAnnoBolletta() {
		return deAnnoBolletta;
	}

	public void setDeAnnoBolletta(String deAnnoBolletta) {
		this.deAnnoBolletta = deAnnoBolletta;
	}

	public String getCodBolletta() {
		return codBolletta;
	}

	public void setCodBolletta(String codBolletta) {
		this.codBolletta = codBolletta;
	}

	public String getDeImporto() {
		return deImporto;
	}

	public void setDeImporto(String deImporto) {
		this.deImporto = deImporto;
	}

	public FlussoTesoreriaTO getFlussoTesoreriaTO() {
		return flussoTesoreriaTO;
	}

	public void setFlussoTesoreriaTO(FlussoTesoreriaTO flussoTesoreriaTO) {
		this.flussoTesoreriaTO = flussoTesoreriaTO;
	}

	public BilancioContainerDto getBilancioContainerDto() {
		return bilancioContainerDto;
	}

	public void setBilancioContainerDto(BilancioContainerDto bilancioContainerDto) {
		this.bilancioContainerDto = bilancioContainerDto;
	}

	
}
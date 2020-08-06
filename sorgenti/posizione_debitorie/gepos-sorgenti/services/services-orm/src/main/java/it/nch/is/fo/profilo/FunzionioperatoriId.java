package it.nch.is.fo.profilo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

// Generated 24-lug-2006 20.35.41 by Hibernate Tools 3.1.0.beta5

/**
 * FunzionioperatoriId generated by hbm2java
 */
@Embeddable
public class FunzionioperatoriId implements java.io.Serializable {

	// Fields    

	private String functionCode;

	private String corporate;

	private String operatore;

	// Constructors

	/** default constructor */
	public FunzionioperatoriId() {
	}

	/** full constructor */
	public FunzionioperatoriId(String functionCode, String corporate,
			String operatore) {
		this.functionCode = functionCode;
		this.corporate = corporate;
		this.operatore = operatore;
	}

	// Property accessors
	@Column(name="CODFUNZIONE")
	public String getFunctionCode() {
		return this.functionCode;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}

	@Column(name="INTESTATARIO")
	public String getCorporate() {
		return this.corporate;
	}

	public void setCorporate(String corporate) {
		this.corporate = corporate;
	}

	@Column(name="OPERATORE")
	public String getOperatore() {
		return this.operatore;
	}

	public void setOperatore(String operatore) {
		this.operatore = operatore;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FunzionioperatoriId))
			return false;
		FunzionioperatoriId castOther = (FunzionioperatoriId) other;

		return ((this.getFunctionCode() == castOther.getFunctionCode()) || (this
				.getFunctionCode() != null
				&& castOther.getFunctionCode() != null && this.getFunctionCode()
				.equals(castOther.getFunctionCode())))
				&& ((this.getCorporate() == castOther.getCorporate()) || (this
						.getCorporate() != null
						&& castOther.getCorporate() != null && this
						.getCorporate().equals(castOther.getCorporate())))
				&& ((this.getOperatore() == castOther.getOperatore()) || (this
						.getOperatore() != null
						&& castOther.getOperatore() != null && this
						.getOperatore().equals(castOther.getOperatore())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFunctionCode() == null ? 0 : this.getFunctionCode().hashCode());
		result = 37
				* result
				+ (getCorporate() == null ? 0 : this.getCorporate()
						.hashCode());
		result = 37 * result
				+ (getOperatore() == null ? 0 : this.getOperatore().hashCode());
		return result;
	}

}
package it.nch.is.fo.tributi;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * JltentrId generated by hbm2java
 */
@Embeddable
public class JltentrId implements java.io.Serializable {

	private String idEntePk;
	private String cdTrbEntePk;

	public JltentrId() {
	}

	public JltentrId(String idEnte, String cdTrbEnte) {
		this.idEntePk = idEnte;
		this.cdTrbEntePk = cdTrbEnte;
	}

	@Column(name="ID_ENTE")
	public String getIdEntePk() {
		return this.idEntePk;
	}

	public void setIdEntePk(String idEnte) {
		this.idEntePk = idEnte;
	}

	@Column(name="CD_TRB_ENTE")
	public String getCdTrbEntePk() {
		return this.cdTrbEntePk;
	}

	public void setCdTrbEntePk(String cdTrbEnte) {
		this.cdTrbEntePk = cdTrbEnte;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof JltentrId))
			return false;
		JltentrId castOther = (JltentrId) other;

		return ((this.getIdEntePk() == castOther.getIdEntePk()) || (this.getIdEntePk() != null
				&& castOther.getIdEntePk() != null && this.getIdEntePk().equals(castOther.getIdEntePk())))
				&& ((this.getCdTrbEntePk() == castOther.getCdTrbEntePk()) || (this.getCdTrbEntePk() != null
						&& castOther.getCdTrbEntePk() != null && this.getCdTrbEntePk().equals(castOther.getCdTrbEntePk())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdEntePk() == null ? 0 : this.getIdEntePk().hashCode());
		result = 37 * result + (getCdTrbEntePk() == null ? 0 : this.getCdTrbEntePk().hashCode());
		return result;
	}

}
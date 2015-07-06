package domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
//@Table(name="AMMETHOD",schema="LAWTEST")//work
@Table(name="XXRH_INTFC_RUN_DTLS_V",schema="APPS")
public class RHIntegrationImpl implements RHIntegration,Serializable {

	

	private static final long serialVersionUID = 4596642043967092540L;

	@Column(name = "BUSINESS_PROCESS_NAME")
	private String rhnterface;

	@Id
	@Column(name = "REQUEST_DATE")
	private Timestamp lastRunTime;

	@Column(name = "TOTAL_NO_RECORDS")
	private BigDecimal tranx;
	
	@Column(name = "TOTAL_NO_FAIL_RECORDS")
	private BigDecimal invalidTrans;

	public RHIntegrationImpl() { }

	@NotNull
	public String getRhinterface() {
		return rhnterface;
	}

	@NotNull
	public Date getLastRunTime() {
		return lastRunTime;
	}

	@NotNull
	public BigDecimal getTranx() {
		return tranx;
	}

	@NotNull
	public BigDecimal getInvalidTrans() {
		return invalidTrans;
	}

}

package domain;

import java.math.BigDecimal;
import java.util.Date;

public interface RHIntegration {

	public String getRhinterface();
	
	public Date getLastRunTime();
	
	public BigDecimal getTranx();

	public BigDecimal getInvalidTrans();
		
}

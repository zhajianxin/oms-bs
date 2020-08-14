package com.sinoservices.bs.basicdata.query;

import com.sinoservices.framework.core.query.QuerySettingCondition;

/**
 * <p>
 * Description:类说明
 * </p>
 *
 * @author Blake
 * @version 1.00
 *
 *          <pre>
 * 修改记录:
 * 修改后版本    		修改人   		修改日期   		修改内容
 * 20170301.1	Blake  	20170301	create
 *
 * </pre>
 */
public class EsRoleListQueryCondition extends QuerySettingCondition {

    private static final long serialVersionUID = -8713602572228225858L;
    /**
     * esroId
     */
    private Long esroId;

    private Long esroEscoId;
    /**
     * esroRoleCode
     */
    private String esroRoleCode;
    /**
     * esroRoleName
     */
    private String esroRoleName;
    /**
     * esroStatus
     */
    private String esroStatus;
    /**
     * esroTypeFunction
     */
    private String esroTypeFunction;
    /**
     * esroTypeData
     */
    private String esroTypeData;
    /**
     * quicklyName
     */
    private String quicklyName;
    /**
     * esroTypeReport
     */
    private String esroTypeReport;

    public Long getEsroEscoId() {
		return esroEscoId;
	}

	public void setEsroEscoId(Long esroEscoId) {
		this.esroEscoId = esroEscoId;
	}

	/**
     * Set esroId
     */
    public void setEsroId(Long esroId) {
        this.esroId = esroId;
    }

    /**
     * Get esroId
     */
    public Long getEsroId() {
        return esroId;
    }

    /**
     * Set esroRoleCode
     */
    public void setEsroRoleCode(String esroRoleCode) {
        this.esroRoleCode = esroRoleCode;
    }

    /**
     * Get esroRoleCode
     */
    public String getEsroRoleCode() {
        return esroRoleCode;
    }

    /**
     * Set esroRoleName
     */
    public void setEsroRoleName(String esroRoleName) {
        this.esroRoleName = esroRoleName;
    }

    /**
     * Get esroRoleName
     */
    public String getEsroRoleName() {
        return esroRoleName;
    }

    /**
     * Set esroStatus
     */
    public void setEsroStatus(String esroStatus) {
        this.esroStatus = esroStatus;
    }

    /**
     * Get esroStatus
     */
    public String getEsroStatus() {
        return esroStatus;
    }

    /**
     * Set esroTypeFunction
     */
    public void setEsroTypeFunction(String esroTypeFunction) {
        this.esroTypeFunction = esroTypeFunction;
    }

    /**
     * Get esroTypeFunction
     */
    public String getEsroTypeFunction() {
        return esroTypeFunction;
    }

    /**
     * Set esroTypeData
     */
    public void setEsroTypeData(String esroTypeData) {
        this.esroTypeData = esroTypeData;
    }

    /**
     * Get esroTypeData
     */
    public String getEsroTypeData() {
        return esroTypeData;
    }

    /**
     * Set quicklyName
     */
    public void setQuicklyName(String quicklyName) {
        this.quicklyName = quicklyName;
    }

    /**
     * Get quicklyName
     */
    public String getQuicklyName() {
        return quicklyName;
    }

    public String getEsroTypeReport() {
		return esroTypeReport;
	}

	public void setEsroTypeReport(String esroTypeReport) {
		this.esroTypeReport = esroTypeReport;
	}

	@Override
    public boolean validate() {
        // TODO 暂且返回true
        return true;
    }

}

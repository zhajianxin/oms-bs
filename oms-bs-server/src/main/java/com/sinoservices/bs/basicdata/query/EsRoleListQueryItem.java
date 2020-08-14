package com.sinoservices.bs.basicdata.query;

import com.sinoservices.framework.core.query.BaseQueryItem;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;


@Entity
public class EsRoleListQueryItem extends BaseQueryItem {

	/**
	 * 角色表主键
	 * esroId
	 */
	private Long esroId;
	/**
	 * 所属公司
	 * esroEscoId
	 */
	private Long esroEscoId;
	/**
	 * 角色代码
	 * esroRoleCode
	 */
	private String esroRoleCode;
	/**
	 * 角色名称
	 * esroRoleName
	 */
	private String esroRoleName;
	/**
	 * 角色描述
	 * esroDesc
	 */
	private String esroDesc;
	/**
	 * 角色状态 数据字典配置
	 * esroStatus
	 */
	private String esroStatus;
	/**
	 * 预留字段
	 * esroSubstr1
	 */
	private String esroSubstr1;
	/**
	 * 预留字段
	 * esroSubstr2
	 */
	private String esroSubstr2;
	/**
	 * 预留字段
	 * esroSubstr3
	 */
	private String esroSubstr3;
	/**
	 * 预留字段
	 * esroSubstr4
	 */
	private String esroSubstr4;
	/**
	 * 预留字段
	 * esroSubstr5
	 */
	private String esroSubstr5;
	/**
	 * 预留字段
	 * esroSubstr6
	 */
	private String esroSubstr6;
	/**
	 * 预留字段
	 * esroSubstr8
	 */
	private String esroSubstr8;
	/**
	 * 预留字段
	 * esroSubstr7
	 */
	private String esroSubstr7;
	/**
	 * 预留字段
	 * esroSubdate1
	 */
	private Date esroSubdate1;
	/**
	 * 预留字段
	 * esroSubdate2
	 */
	private Date esroSubdate2;
	/**
	 * 预留字段
	 * esroSubdate3
	 */
	private Date esroSubdate3;
	/**
	 * 预留字段
	 * esroSubdate5
	 */
	private Date esroSubdate5;
	/**
	 * 预留字段
	 * esroSubdate4
	 */
	private Date esroSubdate4;
	/**
	 * 预留字段
	 * esroSubnum1
	 */
	private Double esroSubnum1;
	/**
	 * 预留字段
	 * esroSubnum2
	 */
	private Double esroSubnum2;
	/**
	 * 预留字段
	 * esroSubnum3
	 */
	private Double esroSubnum3;
	/**
	 * 时间戳
	 * recVer
	 */
	private Long recVer;
	/**
	 * 创建时间
	 * createTime
	 */
	private Date createTime;
	/**
	 * 创建人
	 * creator
	 */
	private String creator;
	/**
	 * 修改时间
	 * modifyTime
	 */
	private Date modifyTime;
	/**
	 * 修改人
	 * modifier
	 */
	private String modifier;
	/**
	 * 类型（功能权限-FUNCTION、数据权限-DATA）
	 * esroType
	 */
	private String esroType;

	/**
	 * Set 角色表主键
	 */
	public void setEsroId(Long esroId){
		this.esroId = esroId;
		addValidField("esroId");
	}

	/**
	 * Get 角色表主键
	 */
	@Column(name = "ESRO_ID")
	public Long getEsroId(){
		return esroId;
	}

	/**
	 * Set 所属公司
	 */
	public void setEsroEscoId(Long esroEscoId){
		this.esroEscoId = esroEscoId;
		addValidField("esroEscoId");
	}

	/**
	 * Get 所属公司
	 */
	@Column(name = "ESRO_ESCO_ID")
	public Long getEsroEscoId(){
		return esroEscoId;
	}

	/**
	 * Set 角色代码
	 */
	public void setEsroRoleCode(String esroRoleCode){
		this.esroRoleCode = esroRoleCode;
		addValidField("esroRoleCode");
	}

	/**
	 * Get 角色代码
	 */
	@Column(name = "ESRO_ROLE_CODE")
	public String getEsroRoleCode(){
		return esroRoleCode;
	}

	/**
	 * Set 角色名称
	 */
	public void setEsroRoleName(String esroRoleName){
		this.esroRoleName = esroRoleName;
		addValidField("esroRoleName");
	}

	/**
	 * Get 角色名称
	 */
	@Column(name = "ESRO_ROLE_NAME")
	public String getEsroRoleName(){
		return esroRoleName;
	}

	/**
	 * Set 角色描述
	 */
	public void setEsroDesc(String esroDesc){
		this.esroDesc = esroDesc;
		addValidField("esroDesc");
	}

	/**
	 * Get 角色描述
	 */
	@Column(name = "ESRO_DESC")
	public String getEsroDesc(){
		return esroDesc;
	}

	/**
	 * Set 角色状态 数据字典配置
	 */
	public void setEsroStatus(String esroStatus){
		this.esroStatus = esroStatus;
		addValidField("esroStatus");
	}

	/**
	 * Get 角色状态 数据字典配置
	 */
	@Column(name = "ESRO_STATUS")
	public String getEsroStatus(){
		return esroStatus;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubstr1(String esroSubstr1){
		this.esroSubstr1 = esroSubstr1;
		addValidField("esroSubstr1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBSTR1")
	public String getEsroSubstr1(){
		return esroSubstr1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubstr2(String esroSubstr2){
		this.esroSubstr2 = esroSubstr2;
		addValidField("esroSubstr2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBSTR2")
	public String getEsroSubstr2(){
		return esroSubstr2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubstr3(String esroSubstr3){
		this.esroSubstr3 = esroSubstr3;
		addValidField("esroSubstr3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBSTR3")
	public String getEsroSubstr3(){
		return esroSubstr3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubstr4(String esroSubstr4){
		this.esroSubstr4 = esroSubstr4;
		addValidField("esroSubstr4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBSTR4")
	public String getEsroSubstr4(){
		return esroSubstr4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubstr5(String esroSubstr5){
		this.esroSubstr5 = esroSubstr5;
		addValidField("esroSubstr5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBSTR5")
	public String getEsroSubstr5(){
		return esroSubstr5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubstr6(String esroSubstr6){
		this.esroSubstr6 = esroSubstr6;
		addValidField("esroSubstr6");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBSTR6")
	public String getEsroSubstr6(){
		return esroSubstr6;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubstr8(String esroSubstr8){
		this.esroSubstr8 = esroSubstr8;
		addValidField("esroSubstr8");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBSTR8")
	public String getEsroSubstr8(){
		return esroSubstr8;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubstr7(String esroSubstr7){
		this.esroSubstr7 = esroSubstr7;
		addValidField("esroSubstr7");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBSTR7")
	public String getEsroSubstr7(){
		return esroSubstr7;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubdate1(Date esroSubdate1){
		this.esroSubdate1 = esroSubdate1;
		addValidField("esroSubdate1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBDATE1")
	public Date getEsroSubdate1(){
		return esroSubdate1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubdate2(Date esroSubdate2){
		this.esroSubdate2 = esroSubdate2;
		addValidField("esroSubdate2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBDATE2")
	public Date getEsroSubdate2(){
		return esroSubdate2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubdate3(Date esroSubdate3){
		this.esroSubdate3 = esroSubdate3;
		addValidField("esroSubdate3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBDATE3")
	public Date getEsroSubdate3(){
		return esroSubdate3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubdate5(Date esroSubdate5){
		this.esroSubdate5 = esroSubdate5;
		addValidField("esroSubdate5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBDATE5")
	public Date getEsroSubdate5(){
		return esroSubdate5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubdate4(Date esroSubdate4){
		this.esroSubdate4 = esroSubdate4;
		addValidField("esroSubdate4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBDATE4")
	public Date getEsroSubdate4(){
		return esroSubdate4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubnum1(Double esroSubnum1){
		this.esroSubnum1 = esroSubnum1;
		addValidField("esroSubnum1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBNUM1")
	public Double getEsroSubnum1(){
		return esroSubnum1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubnum2(Double esroSubnum2){
		this.esroSubnum2 = esroSubnum2;
		addValidField("esroSubnum2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBNUM2")
	public Double getEsroSubnum2(){
		return esroSubnum2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsroSubnum3(Double esroSubnum3){
		this.esroSubnum3 = esroSubnum3;
		addValidField("esroSubnum3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESRO_SUBNUM3")
	public Double getEsroSubnum3(){
		return esroSubnum3;
	}

	/**
	 * Set 时间戳
	 */
	public void setRecVer(Long recVer){
		this.recVer = recVer;
		addValidField("recVer");
	}

	/**
	 * Get 时间戳
	 */
	@Column(name = "REC_VER")
	public Long getRecVer(){
		return recVer;
	}

	/**
	 * Set 创建时间
	 */
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
		addValidField("createTime");
	}

	/**
	 * Get 创建时间
	 */
	@Column(name = "CREATE_TIME")
	public Date getCreateTime(){
		return createTime;
	}

	/**
	 * Set 创建人
	 */
	public void setCreator(String creator){
		this.creator = creator;
		addValidField("creator");
	}

	/**
	 * Get 创建人
	 */
	@Column(name = "CREATOR")
	public String getCreator(){
		return creator;
	}

	/**
	 * Set 修改时间
	 */
	public void setModifyTime(Date modifyTime){
		this.modifyTime = modifyTime;
		addValidField("modifyTime");
	}

	/**
	 * Get 修改时间
	 */
	@Column(name = "MODIFY_TIME")
	public Date getModifyTime(){
		return modifyTime;
	}

	/**
	 * Set 修改人
	 */
	public void setModifier(String modifier){
		this.modifier = modifier;
		addValidField("modifier");
	}

	/**
	 * Get 修改人
	 */
	@Column(name = "MODIFIER")
	public String getModifier(){
		return modifier;
	}

	/**
	 * Set 类型（功能权限-FUNCTION、数据权限-DATA）
	 */
	public void setEsroType(String esroType){
		this.esroType = esroType;
		addValidField("esroType");
	}

	/**
	 * Get 类型（功能权限-FUNCTION、数据权限-DATA）
	 */
	@Column(name = "ESRO_TYPE")
	public String getEsroType(){
		return esroType;
	}

}

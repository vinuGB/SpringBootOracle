package com.yrc.cdb.eai.model;


import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import oracle.sql.DATE;

import java.util.Date;

@Entity
@Table(name = "YRCW_PROPERTIES_CONFIG", schema="EAIU")
public class PropertiesModel implements  Serializable {


        /**
	 * 
	 */
	//private static final long serialVersionUID = -3486594031919204990L;


	@Id
    @Column(name="APPLICATION_ID", columnDefinition="varchar(50)")
    private String applicationID;
	
	@Column(name="PACKAGE_NAME", columnDefinition="varchar(50)")
    private String packageName;
    
    @Column(name = "KEY", columnDefinition = "varchar(100)")
	private String key;

	@Column(name = "VALUE", columnDefinition = "varchar(1000)")
	private String value;
	

//	//@Column(name = "DATE_CREATED", columnDefinition = "date(7)")
//	@Temporal(TemporalType.DATE)
//	private Date dateCreated;

	@Column(name = "CREATED_BY", columnDefinition = "varchar(50)")
	private String createdBy;

////	@Column(name = "DATE_MODIFIED", columnDefinition = "date(7)")
//	@Temporal(TemporalType.DATE)
//	private Date dateModified;
	
	@Column(name = "MODIFIED_BY", columnDefinition = "varchar(50)")
	private String modifiedBy;


    public String getApplicationID() {
			return applicationID;
		}

		public void setApplicationID(String applicationID) {
			this.applicationID = applicationID;
		}

		public String getPackageName() {
			return packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

//		public Date getDateCreated() {
//			return dateCreated;
//		}
//
//		public void setDateCreated(Date dateCreated) {
//			this.dateCreated = dateCreated;
//		}

		public String getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

//		public Date getDateModified() {
//			return dateModified;
//		}
//
//		public void setDateModified(Date dateModified) {
//			this.dateModified = dateModified;
//		}

		public String getModifiedBy() {
			return modifiedBy;
		}

		public void setModifiedBy(String modifiedBy) {
			this.modifiedBy = modifiedBy;
		}





}
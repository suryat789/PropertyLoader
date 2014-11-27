package com.dev.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity @IdClass(AppPropertiesID.class)
@Table(name="\"AppProperties\"")
public class AppProperties implements Serializable {

	private static final long serialVersionUID = -7701151865527208944L;

	@Id
	@Column(name="\"applicationCode\"")
	private String applicationCode;
	
	@Id
	@Column(name="fileName")
	private String fileName;
	
	@Column(name="key")
	private String key;
	
	@Column(name="value")
	private String value;
	
	public String getApplicationCode() {
		return applicationCode;
	}
	public void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
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
	
	@Override
	public String toString() {
		return "AppCode: " + this.applicationCode + ", File: " + this.fileName + ", [" + this.key + ": " + this.value + "]";
	}
}

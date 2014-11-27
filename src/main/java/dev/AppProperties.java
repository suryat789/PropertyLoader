package dev;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="AppProperties")
public class AppProperties {

	private String applicationCode;
	private String fileName;
	private String key;
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
		return this.applicationCode + " " + this.fileName + " " + this.key + " " + this.value;
	}
}

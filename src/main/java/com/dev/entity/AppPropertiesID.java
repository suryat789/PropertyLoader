package com.dev.entity;

import java.io.Serializable;

public class AppPropertiesID implements Serializable {

	private static final long serialVersionUID = -6923852417467832404L;

	private String applicationCode;
	private String fileName;

	public synchronized String getApplicationCode() {
		return applicationCode;
	}
	public synchronized void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}
	public synchronized String getFileName() {
		return fileName;
	}
	public synchronized void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((applicationCode == null) ? 0 : applicationCode.hashCode());
		result = prime * result
				+ ((fileName == null) ? 0 : fileName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppPropertiesID other = (AppPropertiesID) obj;
		if (applicationCode == null) {
			if (other.applicationCode != null)
				return false;
		} else if (!applicationCode.equals(other.applicationCode))
			return false;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		return true;
	}


}

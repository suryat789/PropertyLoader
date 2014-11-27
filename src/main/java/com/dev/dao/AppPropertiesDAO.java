package com.dev.dao;

import java.util.List;

import com.dev.entity.AppProperties;

public interface AppPropertiesDAO {
	List<AppProperties> getAppProperties(final String strAppCode, final String strFIleNme);
}

package dev;

import java.util.List;

public interface AppPropertiesBO {
	// http://www.journaldev.com/3524/spring-hibernate-integration-example-tutorial-spring-4-hibernate-3-and-hibernate-4
	List<AppProperties> getAppProperties(final String strAppCode, final String strFIleNme);
}

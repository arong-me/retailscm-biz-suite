
package com.doublechaintech.retailscm.retailstoreorderprocessing;
import com.doublechaintech.retailscm.AccessKey;


public class RetailStoreOrderProcessingTable{


	public static AccessKey withId(Object value){
		AccessKey accessKey = new AccessKey();
		accessKey.setColumnName(COLUMN_ID);
		accessKey.setValue(value);
		return accessKey;
	}
	//Add extra identifiers
	

	//only this package can use this, so the scope is default, not public, not private either nor protected
	public static final String TABLE_NAME="retail_store_order_processing_data";
	static final String COLUMN_ID = "id";
	static final String COLUMN_WHO = "who";
	static final String COLUMN_PROCESS_TIME = "process_time";
	static final String COLUMN_VERSION = "version";
 
<<<<<<< HEAD
	public static final String []ALL_CLOUMNS = {COLUMN_ID, 
		COLUMN_WHO, COLUMN_PROCESS_TIME, 
		COLUMN_VERSION};
	public static final String []NORMAL_CLOUMNS = {
		COLUMN_WHO, COLUMN_PROCESS_TIME
		};
=======
	public static final String []ALL_CLOUMNS = {COLUMN_ID,COLUMN_WHO,COLUMN_PROCESS_TIME,COLUMN_VERSION};
	public static final String []NORMAL_CLOUMNS = {COLUMN_WHO,COLUMN_PROCESS_TIME};
>>>>>>> ea67698ef1c4e94c89147baaf9f93aa768973fbe
	
	
}



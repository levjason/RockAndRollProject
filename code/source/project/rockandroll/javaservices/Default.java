package project.rockandroll.javaservices;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.softwareag.util.IDataMap;
import java.lang.String;
// --- <<IS-END-IMPORTS>> ---

public final class Default

{
	// ---( internal utility methods )---

	final static Default _instance = new Default();

	static Default _newInstance() { return new Default(); }

	static Default _cast(Object o) { return (Default)o; }

	// ---( server methods )---




	public static final void MakeItUpper (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(MakeItUpper)>> ---
		// @sigtype java 3.5
		// [i] field:0:required Str1
		// [o] field:0:required Str2
		// --- <<IS-BEGIN-PIPELINE-IN>> ---
		// WARNING: Auto generate code will not be preserved upon Java signature update.
		// Do not add custom code here.
		
		IDataMap pipelineInMap = new IDataMap(pipeline);
		String inputStr1 = (String) pipelineInMap.get("Str1");
		// --- <<IS-END-PIPELINE-IN>> ---
		
		// --- <<IS-BEGIN-INSTANCES-PIPELINE-OUT>> ---
		// WARNING: Auto generate code will not be preserved upon Java signature update.
		// Do not add custom code here.
		
		String outputStr2 = null;
		// --- <<IS-END-INSTANCES-PIPELINE-OUT>> ---
		
		// --- <<IS-BEGIN-PIPELINE-OUT>> ---
		// WARNING: Auto generate code will not be preserved upon Java signature update.
		// Do not add custom code here.
		
		IDataMap pipelineOutMap = new IDataMap(pipeline);
		pipelineOutMap.put("Str2", outputStr2);
		// --- <<IS-END-PIPELINE-OUT>> ---
		// --- <<IS-END>> ---

                
	}
}


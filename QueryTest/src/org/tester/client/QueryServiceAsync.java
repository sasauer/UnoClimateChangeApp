package org.tester.client;

import java.util.List;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface QueryServiceAsync {

	void getData(String value, AsyncCallback<List<City>> callback);

}

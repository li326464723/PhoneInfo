package com.lowry.data.dao.factory;

import com.lowry.data.dao.dao.DataDao;
import com.lowry.data.dao.impl.DataImpl;

public class DataDaoFactory {
	public static DataDao getDataDao(){
		return new DataImpl();
	}

}

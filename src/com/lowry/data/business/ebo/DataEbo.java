package com.lowry.data.business.ebo;

import com.lowry.data.business.ebi.DataEbi;
import com.lowry.data.dao.factory.DataDaoFactory;
import com.lowry.data.vo.DataItem;

public class DataEbo implements DataEbi{

	@Override
	public boolean addData(DataItem data) {
		return DataDaoFactory.getDataDao().addData(data);
	}

}

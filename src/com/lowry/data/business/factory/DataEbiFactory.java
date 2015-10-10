package com.lowry.data.business.factory;

import com.lowry.data.business.ebi.DataEbi;
import com.lowry.data.business.ebo.DataEbo;

public class DataEbiFactory {
	public static DataEbi getDataEbi(){
		return new DataEbo();
	}
}

package com.yjf.esupplier.domain;

import com.yjf.common.domain.api.Domain;
import com.yjf.esupplier.ws.hotel.info.HotelStockInfo;
import com.yjf.esupplier.ws.product.data.ProductData;

public class HotelStockDomain extends HotelStockInfo implements Domain {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void examSelf() throws Exception {
	}
	
}

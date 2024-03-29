package com.utd.nts.service;

import com.utd.nts.common.pojo.ServerStatusResponsePojo;
import com.utd.nts.reqres.pojo.NtsNftTradeReq;


public interface NtsNftTradeService {

	public abstract ServerStatusResponsePojo validateAndCompleteTheTradeTransaction(NtsNftTradeReq req);
	
	public abstract ServerStatusResponsePojo validateAndCancelTheTransaction(int transactionId);
}

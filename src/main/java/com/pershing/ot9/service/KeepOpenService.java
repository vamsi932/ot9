package com.pershing.ot9.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pershing.ot9.entity.KeepOpen;
import com.pershing.ot9.model.KeepOpenModel;
import com.pershing.ot9.repository.KeepOpenRepository;

@Service
public class KeepOpenService {
	
	@Autowired
	KeepOpenRepository keepOpenRepository;
	
	public KeepOpen saveKeepOpen(KeepOpenModel keepOpenModel) {
		
		KeepOpen keepOpen = new KeepOpen();
		keepOpen.setAcctId(keepOpenModel.getAccountNumber().substring(0, 9));
		keepOpen.setAcTypeCd(keepOpenModel.getAccountNumber().substring(9));
		keepOpen.setCusipId(keepOpenModel.getCusipId());
		keepOpen.setComSymId(keepOpenModel.getComSymId());
		keepOpen.setUpdtUsrId(keepOpenModel.getUpdtUsrId());
		
		
		return keepOpenRepository.save(keepOpen);
	}

}

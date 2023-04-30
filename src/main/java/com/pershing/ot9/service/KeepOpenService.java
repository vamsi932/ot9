package com.pershing.ot9.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pershing.ot9.entity.KeepOpen;
import com.pershing.ot9.model.KeepOpenModel;
import com.pershing.ot9.repository.KeepOpenRepository;

@Service
public class KeepOpenService {
	
	@Autowired
	KeepOpenRepository keepOpenRepository;
	
	public KeepOpen saveKeepOpen(KeepOpenModel keepOpenModel) throws ParseException {
		
		KeepOpen keepOpen = new KeepOpen();
		keepOpen.setAcctId(keepOpenModel.getAccountNumber());
		keepOpen.setCusipId(keepOpenModel.getCusip());
		keepOpen.setComSymId(keepOpenModel.getSymbol());
		keepOpen.setExpiryDate(new SimpleDateFormat("ddMMyyyy").parse(keepOpenModel.getExpiryDate()));
		// keepOpen.setAcTypeCd(keepOpenModel.getAccountNumber().substring(9));
		
		
		return keepOpenRepository.save(keepOpen);
	}
	
	public List<String> validate(KeepOpenModel keepOpenModel) {
		List<String> errorList = new ArrayList<>();
		if(StringUtils.isBlank(keepOpenModel.getAccountNumber())) {
			errorList.add("Account number should not be empty");
		}
		if(StringUtils.isNotBlank(keepOpenModel.getAccountNumber()) && keepOpenModel.getAccountNumber().length() != 9) {
			errorList.add("Account number should be of length 9");
		}
		if(StringUtils.isBlank(keepOpenModel.getCusip())) {
			errorList.add("CUSIP should not be empty");
		}
		if(StringUtils.isNotBlank(keepOpenModel.getCusip()) && keepOpenModel.getCusip().length() != 9) {
			errorList.add("CUSIP should be of length 9");
		}
		if(StringUtils.isBlank(keepOpenModel.getSymbol())) {
			errorList.add("Symbol should not be empty");
		}
		if(StringUtils.isBlank(keepOpenModel.getcOrP())) {
			errorList.add("C/P should not be empty");
		}
		if(StringUtils.isBlank(keepOpenModel.getStrikePrice())) {
			errorList.add("Strike price should not be empty");
		}
		if(StringUtils.isBlank(keepOpenModel.getExpiryDate())) {
			errorList.add("Expirydate should not be empty");
		}
		if(StringUtils.isNotBlank(keepOpenModel.getExpiryDate()) && !isValidDate(keepOpenModel.getExpiryDate())) {
			errorList.add("Expiry date is invalid");
		}
		
		
		return errorList;
	}
	
	private boolean isValidDate(String expiryDate) {
			try {
				LocalDate localDate = LocalDate.now(ZoneId.systemDefault());
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy");
				LocalDate inputDate = LocalDate.parse(expiryDate, dtf);
				return inputDate.isAfter(localDate);
			} catch (Exception e) {
				return false;
			}
	}


}

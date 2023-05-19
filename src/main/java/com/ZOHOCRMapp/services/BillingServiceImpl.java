package com.ZOHOCRMapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ZOHOCRMapp.entities.Billing;
import com.ZOHOCRMapp.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	private BillingRepository billingRepository;

	@Override
	public void saveOneBill(Billing billing) {
		billingRepository.save(billing);	
	}

}

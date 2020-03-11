package com.taikang.jkx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taikang.jkx.mapper.HiomsAgreementMapper;
import com.taikang.jkx.service.AgreementService;

@Service
public class AgreementServiceImpl implements AgreementService {

	@Autowired
	private HiomsAgreementMapper hiomsAgreementMapper;
}

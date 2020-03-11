package com.taikang.jkx.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.taikang.jkx.model.HiomsPatrol;
import com.taikang.jkx.model.Page;

public interface PatrolService {

	public void save(HiomsPatrol patrol, HttpServletRequest request) throws IOException;

	public Page<HiomsPatrol> listReceivedPatrol(int page, int rows);

	public void execute(String patrolId, String executeDescription,HttpServletRequest request)  throws IOException;

	public Page<HiomsPatrol> listLaunchedPatrol(int page, int rows);

}

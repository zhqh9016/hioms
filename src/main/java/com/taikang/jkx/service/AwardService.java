package com.taikang.jkx.service;

import java.util.List;

import com.taikang.jkx.model.AwardTemp;
import com.taikang.jkx.model.Awards;

public interface AwardService {

	List<Awards> findAwardByLotteryId(String lotteryId);

	void updateAwardKeys(String aid, List<String> keys);

	void deleteAllAwardInfos();

	List<AwardTemp> findAwardTemp();


}

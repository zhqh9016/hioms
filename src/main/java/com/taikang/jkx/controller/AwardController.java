package com.taikang.jkx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taikang.jkx.model.AwardParam;
import com.taikang.jkx.model.AwardResult;
import com.taikang.jkx.model.AwardTemp;
import com.taikang.jkx.model.Awards;
import com.taikang.jkx.service.AwardService;

/**
 * 抽奖
 * @author Administrator
 *
 */
@RestController
@RequestMapping("award")
public class AwardController {
	
	@Autowired
	private AwardService awardService ;
	
	@RequestMapping("getResult")
	public AwardResult getAwardResult(String lotteryId){
		AwardResult result = new AwardResult();
		List<Awards> awardList = awardService.findAwardByLotteryId(lotteryId);
		result.setLotteryId(lotteryId);
		result.setResults(awardList);
		List<AwardTemp> awardTempList = awardService.findAwardTemp();
		result.setAwardTemp(awardTempList);
		return result;
	}
	
	@RequestMapping(path="updateAwardResult",method= RequestMethod.POST)
	public void updateAwardResult( @RequestBody AwardParam param){
		awardService.updateAwardKeys(param.getAid(),param.getKeys());
	}
	@RequestMapping(path="clear")
	public void clearAwardResult(){
		awardService.deleteAllAwardInfos();
	}

}

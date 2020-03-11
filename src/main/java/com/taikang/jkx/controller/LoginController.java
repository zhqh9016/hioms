package com.taikang.jkx.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taikang.jkx.common.util.UserUtils;
import com.taikang.jkx.model.HiomsUser;


@Controller
@RequestMapping("/user")
public class LoginController {

  private Logger log = LoggerFactory.getLogger(LoginController.class);

  /**
   * 处理重复登录的处理
   *
   * @param request
   * @param response
   */
  @RequestMapping(path = "login", method = RequestMethod.POST)
  @ResponseBody
  public void login(HttpServletRequest request, HttpServletResponse response) {
	String loginName = request.getParameter("loginName");;
    HiomsUser currentUser = UserUtils.getCurrentUser();
    response.setCharacterEncoding("UTF-8");
    try {
      PrintWriter out = response.getWriter();
      if (currentUser != null) {
    	  if(loginName.equals(currentUser.getLoginName())){
    		  out.println("{\"state\":true,\"message\":\"登入成功\"}");
    	  }else{
    		  
    	  }
      } else {
        out.println("{\"state\":false,\"message\":\"请通过前台访问\"}");
      }
      out.flush();
      out.close();
    } catch (IOException e) {
      log.error("--重复登录时出现异常--", e);
    }
  }
}

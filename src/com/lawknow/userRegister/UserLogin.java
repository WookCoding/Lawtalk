package com.lawknow.userRegister;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lawyer.action.Action;
import com.lawyer.action.ActionInfo;


public class UserLogin implements Action {

   public ActionInfo execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
      
      ActionInfo actionInfo = new ActionInfo();
      
      //쿠키 검사
      String userId = null;
      String userPw = null;
      String saveId = null;
      
      String cookieCheck = req.getHeader("Cookie");
      
      
      if(cookieCheck != null) {
         Cookie[] cookies = req.getCookies();
         for(Cookie cookie : cookies) {
            if(cookie.getName().equals("userId")) {
               userId = cookie.getValue();
               
            } else if(cookie.getName().equals("userPw")) {
               userPw = cookie.getValue();
               
            }else if(cookie.getName().equals("saveId")) {
               saveId = cookie.getValue();
               
            }
         }
      }
      
      req.setAttribute("userId", userId);
      req.setAttribute("userPw", userPw);
      req.setAttribute("saveId", saveId);
      
      System.out.println(userId);
      System.out.println(userPw);
      System.out.println(saveId);
      
      actionInfo.setRedirect(false);
      actionInfo.setPath("/login.jsp");
      
      return actionInfo;
   }

}





















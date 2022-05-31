package com.lawknow.userRegister;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

import com.lawknow.domain.dao.UserDAO;
import com.lawknow.domain.vo.UserVO;
import com.lawyer.action.Action;
import com.lawyer.action.ActionInfo;

public class UserDeleteAccountOk implements Action{

	@Override
	public ActionInfo execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		req.setCharacterEncoding("UTF-8"); 
		
		HttpSession session = req.getSession();
		ActionInfo actionInfo = new ActionInfo();
		UserDAO userDAO = new UserDAO();
		
		int userNum = (int)session.getAttribute("userNum");
		
		req.setAttribute("checkDel", userDAO.UserdeleteAccount(userNum));
		
		actionInfo.setRedirect(false);
		actionInfo.setPath("/LawKnowMainPage.jsp");
		
		return actionInfo;
		
	}
}
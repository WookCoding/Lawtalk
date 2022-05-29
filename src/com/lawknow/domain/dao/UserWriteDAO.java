package com.lawknow.domain.dao;

import java.sql.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.lawknow.domain.vo.UserReviewVO;
import com.lawknow.domain.vo.UserWriteVO;
import com.mybatis.config.MyBatisConfig;

public class UserWriteDAO {
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlSessionFactory();
	SqlSession sqlSession;
	
	public UserWriteDAO() {
		sqlSession = sqlSessionFactory.openSession(true);
	}

	//의뢰인 글 삭제
	public void userDelete(UserWriteVO user)  {
		sqlSession.delete("UserWrite.userDelete", user);
	}
	
	//의뢰인 글 수정
	public int userWriteUpdate(UserWriteVO user) {
		return sqlSession.update("UserWrite.userWriteUpdate", user);
	}
	
	//의뢰인 글 작성
	public void userWirte(UserWriteVO user) {
		sqlSession.insert("UserWrite.userWrite" , user);
	}

	//사건 번호
	public int requestNum(UserWriteVO user) {
		return sqlSession.selectOne("UserWrite.requestNum");
	}

	//의뢰인 글 번호
	public int userWirteNum(UserWriteVO user) {
		return sqlSession.selectOne("UserWrite.userWriteNum");
	}
	
	//의뢰인 글 날짜
	public Date userWriteDate(UserWriteVO user) {
		return null;
	}
	public int selectField(UserWriteVO user) {
		
		return sqlSession.selectOne("UserWrite.selectField");
	}
	
}

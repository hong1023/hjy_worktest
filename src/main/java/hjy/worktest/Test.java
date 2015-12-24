package hjy.worktest;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.web.dao.SpringDao;

@Controller
public class Test{
	private static Logger logger = LoggerFactory.getLogger(Test.class);
	
	@Autowired
	private SpringDao dao;
	
	@RequestMapping("/test")
	public String test(HttpServletRequest req, HttpServletResponse res){
		logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>요청URL : " + req.getRequestURI() );
		return "test";
	}
	
	@RequestMapping("/hello.do")
	public String hello(HttpServletRequest req, HttpServletResponse res){
		
		logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>요청URL : " + req.getRequestURI() );
		try {
			List<String> list = (List<String>)dao.queryTest();
			logger.info(">>>>>>>>>>>>>>>query Test Info : " + list.toString() );
			
			req.setAttribute("list", list);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error(e.toString());
		}
		
		return "hello";
	}
}
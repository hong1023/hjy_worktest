package hjy.worktest.common;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test{
	private static Logger logger = LoggerFactory.getLogger(Test.class);
	@RequestMapping("/test")
	public String test(HttpServletRequest req, HttpServletResponse res){
		logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>요청URL : " + req.getRequestURI() );
		return "test";
	}
	
	@RequestMapping("/hello.do")
	public String hello(HttpServletRequest req, HttpServletResponse res){
		logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>요청URL : " + req.getRequestURI() );
		return "hello";
	}
}
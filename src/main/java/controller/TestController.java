package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("one.action")
    @ResponseBody
    public String testOne(ServletRequest req, ServletResponse res) {
        HttpServletRequest request = (HttpServletRequest)req;
//        HttpServletResponse response = (HttpServletResponse)res;

        String sessionId = request.getSession().getId();
        System.out.println("-----------sessionID:" + sessionId +"----------");
        return "访问成功";
    }

}

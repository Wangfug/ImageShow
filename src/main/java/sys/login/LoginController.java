package sys.login;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sys.entity.UserInfo;
import sys.utils.Global;
import sys.utils.UserUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wfg on 2017/8/23.
 */
@Controller
@RequestMapping(value = "")
public class LoginController  {

    @RequestMapping(value = "main")
    public String toIndex() {
           return "reports/main";
    }
    @RequestMapping(value = "login")
    public String login(String username, String password, HttpServletRequest request) {

            String[] users = Global.getAccount();
            String[] pwd = Global.getPwd();
            int index = 0;
            for(String name:users){
                if(name.equals(username)&&pwd[index].equals(password)){
                    UserInfo user = UserUtil.setUser(request,username);
                    UserUtil.setUser(request,user);
                    return "redirect:/main" ;
                }
                index++;
            }
        if(StringUtils.isNotEmpty(username)){
            request.setAttribute("msg","密码错误！请联系管理员");
        }else{
            request.setAttribute("msg","请重新登陆");
        }

        return "login";
    }
    @RequestMapping(value = "logout")
    public String logout(String username, String password, HttpServletRequest request) {
        UserUtil.clearUser(request);
        return "login";
    }
}

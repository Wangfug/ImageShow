package services.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/9/18.
 */
@Controller
@RequestMapping(value = "report")
public class ReportSendController {
    @RequestMapping(value = "goReport")
    public void goReport(String type, HttpServletResponse response){
        try{
            StringBuilder url = new StringBuilder();
            switch (type){
                case "1":
                    url = url.append("http://222.92.8.88:9502/analytics/saw.dll?portalpages&PortalPath=%2Fshared%2F1.1%") ;
                    url.append("E5%B8%82%E5%9C%BA%E9%87%87%E8%B4%AD%E6%80%BB%E8%B6%8B%E5%8A%BF%E5%88%86%E6%9E%90%2F_portal%2F1.1%");
                    url.append("E5%B8%82%E5%9C%BA%E9%87%87%E8%B4%AD%E5%87%BA%E5%8F%A3%E6%80%BB%E8%B6%8B%E5%8A%BF&page=%E9%A1%B5%201");
                    url.append("&NQUser=gwh&NQPassword=gwh123456");
                    response.sendRedirect(url.toString());
                    break;
                case "2":
                    url = url.append("http://222.92.8.88:9502/analytics/saw.dll?portalpages&PortalPath=%2Fshared%2F1.2%E5%8E%9F%E4%BA%A7%E5%9C%B0");
                    url = url.append("%E5%88%86%E6%9E%90%2F_portal%2F1.2%E5%8E%9F%E4%BA%A7%E5%9C%B0%E7%BB%9F%E8%AE%A1%E5%88%86%E6%9E%90&page=%E9");
                    url = url.append("%A1%B5%201&NQUser=gwh&NQPassword=gwh123456");
                    response.sendRedirect(url.toString());
                    break;
                case "3":
                    url = url.append("http://222.92.8.88:9502/analytics/saw.dll?portalpages&PortalPath=%2Fshared%2F1.3%E6%8A%B5%E8%BF%90%E5%8C%BA%E5%9F");
                    url = url.append("%9F%E5%88%86%E6%9E%90%2F_portal%2F1.3%E6%8A%B5%E8%BF%90%E5%8C%BA%E5%9F%9F%E5%88%86%E6%9E%90&page=%E9%A1%B5%201");
                    url = url.append("&NQUser=gwh&NQPassword=gwh123456");
                    response.sendRedirect(url.toString());
                    break;
                case "4":
                    url = url.append("http://222.92.8.88:9502/analytics/saw.dll?portalpages&PortalPath=%2Fshared%2F1.4%E6%8A%B5%E8%BF%90%E5%9B%BD%E7%BB%9F");
                    url = url.append("%E8%AE%A1%E5%88%86%E6%9E%90%2F_portal%2F1.4%E6%8A%B5%E8%BF%90%E5%9B%BD%E7%BB%9F%E8%AE%A1%E5%88%86%E6%9E%90&page=%E9%A1");
                    url = url.append("%B5%201&NQUser=gwh&NQPassword=gwh123456");
                    response.sendRedirect(url.toString());
                    break;
                case "5":
                    url = url.append("http://222.92.8.88:9502/analytics/saw.dll?portalpages&PortalPath=%2Fshared%2F1.5%E5%A4%96%E8%B4%B8%E5%85%AC%E5%8F%B8%E8");
                    url = url.append("%B6%8B%E5%8A%BF%E5%88%86%E6%9E%90%2F_portal%2F1.5%E5%A4%96%E8%B4%B8%E5%85%AC%E5%8F%B8%E8%B6%8B%E5%8A%BF%E5%88%86%E6");
                    url = url.append("%9E%90&page=%E9%A1%B5%201&NQUser=gwh&NQPassword=gwh123456");
                    response.sendRedirect(url.toString());
                    break;
                case "6":
                    url = url.append("http://222.92.8.88:9502/analytics/saw.dll?portalpages&PortalPath=%2Fshared%2F1.7%E5%95%86%E6%88%B7%E8%B6%8B%E5%8A%BF%E5");
                    url = url.append("%88%86%E6%9E%90%2F_portal%2F1.6%E5%95%86%E6%88%B7%E8%B6%8B%E5%8A%BF%E5%88%86%E6%9E%90&Page=%E9%A1%B5%201");
                    url = url.append("&NQUser=gwh&NQPassword=gwh123456");
                    response.sendRedirect(url.toString());
                    break;
                case "7":
                    url = url.append("http://222.92.8.88:9502/analytics/saw.dll?portalpages&PortalPath=%2Fshared%2F1.8%E6%8A%A5%E5%85%B3%E8%A1%8C%E7%BB%9F%E8%AE");
                    url = url.append("%A1%2F_portal%2F1.7%E6%8A%A5%E5%85%B3%E8%A1%8C%E7%BB%9F%E8%AE%A1&page=%E9%A1%B5%201");
                    url = url.append("&NQUser=gwh&NQPassword=gwh123456");
                    response.sendRedirect(url.toString());
                    break;
                case "8":
                    url = url.append("http://222.92.8.88:9502/analytics/saw.dll?portalpages&PortalPath=%2Fshared%2F1.9%E5%95%86%E5%93%81%E5%88%86%E7%B1%BB%E7%BB%9F%E8");
                    url = url.append("%AE%A1%E5%88%86%E6%9E%90%2F_portal%2F1.8%E5%95%86%E5%93%81%E5%88%86%E7%B1%BB%E7%BB%9F%E8%AE%A1%E5%88%86%E6%9E%90&page=%E9%A1%B5%201");
                    url = url.append("&NQUser=gwh&NQPassword=gwh123456");
                    response.sendRedirect(url.toString());
                    break;
                case "9":
                    url = url.append("http://222.92.8.88:9502/analytics/saw.dll?portalpages&PortalPath=%2Fshared%2F1.10%E4%B8%80%E5%B8%A6%E4%B8%80%E8%B7%AF%E5%87%BA");
                    url = url.append("%E5%8F%A3%E5%9B%BD%E5%8C%BA%E5%9F%9F%E5%88%86%E6%9E%90%2F_portal%2F1.9%E4%B8%80%E5%B8%A6%E4%B8%80%E8%B7%AF%E5%87%BA%E5%8F");
                    url = url.append("%A3%E5%9B%BD%E5%8C%BA%E5%9F%9F%E5%88%86%E6%9E%90&Page=%E9%A1%B5%201");
                    url = url.append("&NQUser=gwh&NQPassword=gwh123456");
                    response.sendRedirect(url.toString());
                    break;
                case "10":
                    url = url.append("http://222.92.8.88:9502/analytics/saw.dll?portalpages&PortalPath=%2Fshared%2F1.13%E5%A4%96%E6%B1%87%E6%80%BB%E8%B6%8B%E5%8A%BF");
                    url = url.append("%2F_portal%2F1.13%E5%A4%96%E6%B1%87%E6%80%BB%E8%B6%8B%E5%8A%BF&page=%E9%A1%B5%201");
                    url = url.append("&NQUser=gwh&NQPassword=gwh123456");
                    response.sendRedirect(url.toString());
                    break;
                default:
                    url = url.append("http://222.92.8.88:9502/analytics/saw.dll?portalpages&PortalPath=%2Fshared%2F1.1%") ;
                    url.append("E5%B8%82%E5%9C%BA%E9%87%87%E8%B4%AD%E6%80%BB%E8%B6%8B%E5%8A%BF%E5%88%86%E6%9E%90%2F_portal%2F1.1%");
                    url.append("E5%B8%82%E5%9C%BA%E9%87%87%E8%B4%AD%E5%87%BA%E5%8F%A3%E6%80%BB%E8%B6%8B%E5%8A%BF&page=%E9%A1%B5%201");
                    url.append("&NQUser=gwh&NQPassword=gwh123456");
                    response.sendRedirect(url.toString());
                    break;
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

package services.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sys.utils.Constant;

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
            switch (type){
                case "1":
                    response.sendRedirect(Constant.URL_TOTAL_EXTREND);
                    break;
                case "1.1":
                    response.sendRedirect(Constant.URL_TOTAL_EXTREND1);
                    break;
                case "2":
                    response.sendRedirect(Constant.URL_ORIGIN_PLACE);
                    break;
                case "2.1":
                    response.sendRedirect(Constant.URL_ORIGIN_PLACE1);
                    break;
                case "3":
                    response.sendRedirect(Constant.URL_ARRIVED_AREA);
                    break;
                case "3.1":
                    response.sendRedirect(Constant.URL_ARRIVED_AREA1);
                    break;
                case "4":
                    response.sendRedirect(Constant.URL_ARRIVED_COUNTRY);
                    break;
                case "4.1":
                    response.sendRedirect(Constant.URL_ARRIVED_COUNTRY1);
                    break;
                case "5":
                    response.sendRedirect(Constant.URL_WAIMAO);
                    break;
                case "5.1":
                    response.sendRedirect(Constant.URL_WAIMAO1);
                    break;
                case "6":
                    response.sendRedirect(Constant.URL_SHANGHU);
                    break;
                case "6.1":
                    response.sendRedirect(Constant.URL_SHANGHU1);
                    break;
                case "7":
                    response.sendRedirect(Constant.URL_BAOGUANHANG);
                    break;
                case "7.1":
                    response.sendRedirect(Constant.URL_BAOGUANHANG1);
                    break;
                case "8":
                    response.sendRedirect(Constant.URL_SHANGPINFENLEI);
                    break;
                case "8.1":
                    response.sendRedirect(Constant.URL_SHANGPINFENLEI1);
                    break;
                case "9":
                    response.sendRedirect(Constant.URL_YIDAIYILU);
                    break;
                case "9.1":
                    response.sendRedirect(Constant.URL_YIDAIYILU1);
                    break;
                case "10":
                    response.sendRedirect(Constant.URL_SHOUHUI);
                    break;
                case "10.1":
                    response.sendRedirect(Constant.URL_SHOUHUI1);
                    break;
                default:
                    response.sendRedirect(Constant.URL_TOTAL_EXTREND);
                    break;
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

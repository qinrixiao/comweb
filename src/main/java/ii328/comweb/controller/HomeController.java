package ii328.comweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类的说明
 * @author 覃日晓
 * @since 2019-03-13 16:53
 */
@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping("/index")
    public String index() {
        return "sdfsf";
    }
}

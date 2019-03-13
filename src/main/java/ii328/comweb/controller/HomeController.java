package ii328.comweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类的说明
 * @author 覃日晓
 * @since 2019-03-13 16:53
 */
@Controller
public class HomeController {
    Logger logger = LoggerFactory.getLogger("sss");


    @RequestMapping("/index")
    public String index() {

        logger.error("sdfsdfsdfsf");
        return "home/index";
    }
}

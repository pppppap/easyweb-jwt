package com.wf.ew.system;

import com.wf.ew.common.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController extends BaseController {

    @RequestMapping({"/", "/index"})
    public String index() {
        return "redirect:swagger-ui.html";
    }
}

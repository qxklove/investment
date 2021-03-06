package cn.qxk.trend.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author laijianzhen
 * @date 2020/01/29
 */
@RefreshScope
@Controller
public class ViewController {
    @Value("${version}")
    String version;
    @GetMapping("/")
    public String view(Model m) throws Exception {
        m.addAttribute("version", version);
        return "view";
    }
}

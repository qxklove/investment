package cn.qxk.trend.controller;

import cn.qxk.trend.config.IpConfiguration;
import cn.qxk.trend.pojo.Index;
import cn.qxk.trend.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author laijianzhen
 * @date 2020/01/29
 */
@RestController
public class IndexController {
    @Autowired
    IndexService indexService;
    @Autowired
    IpConfiguration ipConfiguration;

    @GetMapping("/codes")
    @CrossOrigin
    public List<Index> codes() throws Exception {
        System.out.println("current instance's port is "+ ipConfiguration.getPort());
        return indexService.get();
    }
}

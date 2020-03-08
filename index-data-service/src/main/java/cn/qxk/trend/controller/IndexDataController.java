package cn.qxk.trend.controller;

import cn.qxk.trend.config.IpConfiguration;
import cn.qxk.trend.pojo.IndexData;
import cn.qxk.trend.service.IndexDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author laijianzhen
 * @date 2020/01/29
 */
@RestController
public class IndexDataController {
    @Autowired
    IndexDataService indexDataService;
    @Autowired
    IpConfiguration ipConfiguration;

    @GetMapping("/data/{code}")
    public List<IndexData> get(@PathVariable("code") String code) throws Exception {
        System.out.println("current instance is :" + ipConfiguration.getPort());
        return indexDataService.get(code);
    }
}

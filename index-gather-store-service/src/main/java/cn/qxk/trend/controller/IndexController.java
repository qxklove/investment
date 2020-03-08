package cn.qxk.trend.controller;

import cn.qxk.trend.pojo.Index;
import cn.qxk.trend.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author laijianzhen
 * @date 2020/01/28
 */
@RestController
public class IndexController {

    @Autowired
    IndexService indexService;

    @GetMapping("/getCodes")
    public List<Index> get() throws Exception {
        return indexService.fetch_indexes_from_third_part();
    }

    @GetMapping("/freshCodes")
    public List<Index> fresh() throws Exception {
        return indexService.fresh();
    }

    @GetMapping("/removeCodes")
    public String remove() throws Exception {
        indexService.remove();
        return "remove codes successfully";
    }
}

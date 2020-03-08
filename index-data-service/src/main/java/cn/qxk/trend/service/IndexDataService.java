package cn.qxk.trend.service;

import cn.hutool.core.collection.CollUtil;
import cn.qxk.trend.pojo.IndexData;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author laijianzhen
 * @date 2020/01/29
 */
@Service
@CacheConfig(cacheNames="index_datas")
public class IndexDataService {

    @Cacheable(key="'indexData-code-'+ #p0")
    public List<IndexData> get(String code){
        return CollUtil.toList();
    }
}

package cn.qxk.trend.client;

import cn.hutool.core.collection.CollectionUtil;
import cn.qxk.trend.pojo.IndexData;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author laijianzhen
 * @date 2020/01/29
 */
@Component
public class IndexDataClientFeignHystrix implements IndexDataClient {

    @Override
    public List<IndexData> getIndexData(String code) {
        IndexData indexData = new IndexData();
        indexData.setClosePoint(0);
        indexData.setDate("0000-00-00");
        return CollectionUtil.toList(indexData);
    }

}

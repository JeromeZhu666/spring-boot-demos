package xin.jerome.cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * cache 控制器
 *
 * @author Jerome Zhu
 * @since 2018.08.29 12:33
 */
@RestController
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    @Qualifier("simpleCacheManager")
    private CacheManager cacheManager;

    @PostMapping
    public Map<String, String> save(@RequestParam String key, @RequestParam String value) {

        Cache cache = cacheManager.getCache("cache-1");
        cache.put(key, value);

        Map<String, String> map = new HashMap<>();
        map.put(key, value);
        return map;
    }

}

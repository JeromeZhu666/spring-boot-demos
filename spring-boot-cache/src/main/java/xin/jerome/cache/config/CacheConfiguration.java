package xin.jerome.cache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Cache 的配置
 *
 * @author Jerome Zhu
 * @since 2018.08.29 12:41
 */
@Configuration
@EnableCaching
public class CacheConfiguration {

    @Bean
    public CacheManager simpleCacheManager() {

        SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
        ConcurrentMapCache concurrentMapCache = new ConcurrentMapCache("cache-1");
        ConcurrentMapCache studentCache = new ConcurrentMapCache("students");

        simpleCacheManager.setCaches(Arrays.asList(concurrentMapCache, studentCache));

        return simpleCacheManager;

    }
}

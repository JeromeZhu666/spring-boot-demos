package xin.jerome.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author Jerome Zhu
 * @since 2018.09.13 17:23
 */
@SpringBootApplication
public class SpringBootDemoLogbackApplication {

//    private static Logger logger = LoggerFactory.getLogger(SpringBootDemoLogbackApplication.class);

    public static void main(String[] args) {
//        logger.trace("trace level log.");
//        logger.debug("debug level log.");
//        logger.info("info level log.");
//        logger.warn("warn level log.");
//        logger.error("error level log.");
        SpringApplication.run(SpringBootDemoLogbackApplication.class);
    }
}

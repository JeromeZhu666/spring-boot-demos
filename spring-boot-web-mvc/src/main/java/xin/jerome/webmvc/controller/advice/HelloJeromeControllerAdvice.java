package xin.jerome.webmvc.controller.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xin.jerome.webmvc.controller.HelloJeromeController;

/**
 * {@link HelloJeromeController} advice
 *
 * @author Jerome Zhu
 * @since 2018.11.13 10:43
 */
@ControllerAdvice
public class HelloJeromeControllerAdvice {

    /**
     * 获取cookie的值
     * @param cookie cookie
     * @return cookie 的值
     */
    @ModelAttribute("cookie")
    public String getCookie(@CookieValue("Idea-ad618ba1") String cookie) {
        return cookie;
    }

    /**
     * 获取请求头的内容
     * @param accept 请求头中的 accept 参数
     * @return accept的值
     */
    @ModelAttribute("accept")
    public String getAccept(@RequestHeader("Accept") String accept) {
        return accept;
    }

    /**
     * 异常处理
     * @param throwable 拦截的异常
     * @return {@link ResponseEntity}
     */
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleException(Throwable throwable) {
        return ResponseEntity.ok(throwable.getMessage());
    }
}

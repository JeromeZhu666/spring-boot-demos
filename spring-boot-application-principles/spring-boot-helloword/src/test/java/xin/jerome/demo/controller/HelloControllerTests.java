package xin.jerome.demo.controller;

import org.junit.Test;
import xin.jerome.demo.HelloApplicationTests;

import static org.junit.Assert.*;

/**
 * {@link HelloController} 测试
 *
 * @author Jerome Zhu
 */
public class HelloControllerTests extends HelloApplicationTests {

    @Test
    public void sayHello() {
        assertEquals("Hello Jerome !",new HelloController().sayHello());
    }
}
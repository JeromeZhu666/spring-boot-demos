package xin.jerome.jmx.mbean;

import javax.management.*;
import java.lang.management.ManagementFactory;

/**
 * MBeanDemo
 *
 * @author Jerome Zhu
 * @since 2018.09.20 14:16
 */
public class MBeanDemo {

    public static void main(String[] args) throws Exception {

        // MBean 服务器的 agent level
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        // 注册对象
        SimpleData simpleData = new SimpleData();
        // 注册名称
        ObjectName objectName = createObjectName(simpleData);

        mBeanServer.registerMBean(simpleData, objectName);

        Thread.sleep(Long.MAX_VALUE);
    }

    private static ObjectName createObjectName(Object mbean) throws MalformedObjectNameException {

        Class<?> mBeanClass = mbean.getClass();

        String  packageName = mBeanClass.getPackage().getName();
        String className = mBeanClass.getSimpleName();

        return new ObjectName(packageName + ":type=" + className);


    }
}

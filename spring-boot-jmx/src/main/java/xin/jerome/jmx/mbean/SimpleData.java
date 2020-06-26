package xin.jerome.jmx.mbean;

import javax.management.*;
import java.util.concurrent.atomic.AtomicLong;

import static javax.management.AttributeChangeNotification.ATTRIBUTE_CHANGE;

/**
 * {@link SimpleDataMBean} 的实现
 *
 * @author Jerome Zhu
 * @since 2018.09.20 14:13
 */
public class SimpleData extends NotificationBroadcasterSupport implements SimpleDataMBean,
        NotificationListener, NotificationFilter {

    private String data;

    private static final AtomicLong sequenceNumber = new AtomicLong();

    public SimpleData() {
        this.addNotificationListener(this, this, null);
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public void setData(String data) {
        String oldData = this.data;
        this.data = data;
        Notification notification = new AttributeChangeNotification(this,
                sequenceNumber.incrementAndGet(),
                System.currentTimeMillis(),
                "Data has been changed from " + oldData + " to " + data,
                "data",
                String.class.getName(),
                oldData,
                data
        );
        sendNotification(notification);
    }

    @Override
    public String displayData() {
        return data;
    }

    @Override
    public void handleNotification(Notification notification, Object handback) {

        AttributeChangeNotification attributeChangeNotification = (AttributeChangeNotification) notification;

        String oldData = (String) attributeChangeNotification.getOldValue();

        String newData = (String) attributeChangeNotification.getNewValue();

        System.out.printf("The notification of data's attribute  - old data : %s , new data : %s \n", oldData, newData);

    }

    @Override
    public boolean isNotificationEnabled(Notification notification) {
        if (AttributeChangeNotification.class.isAssignableFrom(notification.getClass())) {

            AttributeChangeNotification attributeChangeNotification = AttributeChangeNotification.class.cast(notification);

            if ("data".equals(attributeChangeNotification.getAttributeName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 暴露通知信息
     *
     * @return
     */
    public MBeanNotificationInfo[] getNotificationInfo() {

        return new MBeanNotificationInfo[]{
                new MBeanNotificationInfo(new String[]{ATTRIBUTE_CHANGE}, "Data Change Notification",
                        "数据改变通知")
        };
    }
}

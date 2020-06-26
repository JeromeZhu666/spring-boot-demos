package xin.jerome.jmx.mbean;

/**
 * SimpleDataMBean
 *
 * @author Jerome Zhu
 * @since 2018.09.20 14:12
 */
public interface SimpleDataMBean {

    void setData(String data);

    String getData();

    String displayData();

}

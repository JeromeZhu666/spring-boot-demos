package xin.jerome.autoconfigure.service;

/**
 * 计算业务
 *
 * @author Jerome Zhu
 * @since 2018.10.23 16:59
 */
public interface CalculateService {

    /**
     * 对多个参数进行求和
     * @param values 累加的数
     * @return values 的累加和
     */
    Integer sum(Integer... values);
}

package xin.jerome.configuration.autoconfigure.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import xin.jerome.configuration.autoconfigure.service.CalculateService;

/**
 * Java7 for循环 {@link CalculateService} 实现
 *
 * @author Jerome Zhu
 * @since 2018.10.23 17:01
 */
@Profile("Java7")
@Service
public class Java7CalculateServiceImpl implements CalculateService {

    @Override
    public Integer sum(Integer... values) {
        System.out.println("Java7 for循环");
        int sum = 0;
        for (Integer value : values) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        CalculateService calculateService = new Java7CalculateServiceImpl();
        System.out.println(calculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }
}

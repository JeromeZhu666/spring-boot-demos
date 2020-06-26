package xin.jerome.autoconfigure.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import xin.jerome.autoconfigure.service.CalculateService;

import java.util.stream.Stream;

/**
 * Java8 lambda {@link CalculateService} 实现
 *
 * @author Jerome Zhu
 * @since 2018.10.23 17:01
 */
@Profile("Java8")
@Service
public class Java8CalculateServiceImpl implements CalculateService {

    @Override
    public Integer sum(Integer... values) {
        System.out.println("Java8 lambda");
        int sum = Stream.of(values).reduce(0, Integer::sum);
        return sum;
    }

    public static void main(String[] args) {
        CalculateService calculateService = new Java8CalculateServiceImpl();
        System.out.println(calculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }
}

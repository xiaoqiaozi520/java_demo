package concert;

import org.springframework.stereotype.Component;

/**
 * @author HeQiao
 * @create 2018-04-11 11:57
 **/
@Component
public class PerformanceImpl implements Performance {
    @Override
    public void perform() {
        int a = 0 ;

        int b = 1/a;
        System.out.println("测试");
    }
}

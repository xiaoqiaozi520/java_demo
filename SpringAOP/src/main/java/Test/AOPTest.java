package Test;


import concert.Config;
import concert.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author HeQiao
 * @create 2018-04-10 18:22
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class AOPTest {

    @Autowired
    private Performance performance;


    @Test
    public void testTrancCount(){
        performance.perform();
    }




}

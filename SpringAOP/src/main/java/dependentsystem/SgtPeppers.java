package dependentsystem;

import org.springframework.stereotype.Component;

/**
 * @author HeQiao
 * @create 2018-04-11 16:40
 **/
@Component
public class SgtPeppers implements CompactDisc {

    private String title  = "小芳";

    private String artis = "李荣浩";
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artis);
    }
}

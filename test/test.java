import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

/**
 * Created by hy on 16-5-16.
 */
public class test {
    public static  void main(String[] args) throws IOException{
        ClassPathResource c=new ClassPathResource("config");
        System.out.println(c.getFile().getAbsolutePath());
    }
}

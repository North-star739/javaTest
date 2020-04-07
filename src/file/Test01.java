package file;

import org.junit.Test;
import java.util.ArrayList;

public class Test01 {
    @Test
    public void a() {
        ArrayList<String> list = new ArrayList<String> ();
        list.add ( "23" );
        System.out.println (list);
        System.out.println ( "junit单元测试类" );
    }

}

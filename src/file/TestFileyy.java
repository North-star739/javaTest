package file;

import java.io.File;
import java.io.IOException;

public class TestFileyy {

    public static void main(String[] args) {
        File file=new File ( "D:/1sxt/b.txt" );
        boolean flag=file.exists ();
        if (flag){
            boolean flagd= file.delete ();
            if (flagd){
                System.out.println ("删除成功");

            }else{
                System.out.println ("删除失败");

            }

        }else{
            boolean flagn=false;
            try {
                File dir=file.getParentFile ();
                dir.mkdirs ();
                file.createNewFile ();
                System.out.println ("chenggong");

            }catch (IOException e){
                System.out.println ("shibai");
                e.printStackTrace ();
            }



        }

    }

}

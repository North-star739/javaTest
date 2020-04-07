package file;

import java.io.File;
import java.util.*;

public class TestFile {

    public static void main(String[] args) {
       // file f=new file("D:\\1sxt\\a.txt");
        //System.out.println(f);
       //f.renameTo(new file("D:/1sxt/b.txt"));
        //System.out.println(f);


        //System.out.println ( System.getProperties ( user.dir ) );

        File f = new File ("gg.txt");
        System.out.println ("File文件是否存在："+f.exists ());
        System.out.println ("File是否是目录："+f.isDirectory ());
        System.out.println ("File是否是文件："+f.isFile ());
        System.out.println ("File最后一次修改时间："+new Date (f.lastModified ()));
        System.out.println ("File的大小："+f.length ());
        System.out.println ("File的文件名："+f.getName ());
        System.out.println ("File绝对路径："+f.getAbsolutePath ());

        File f2=new File ( "D:/电影/华语/大陆" );
        //boolean flag=f2.mkdir ();//目录结构中有一个不存在，就不会创建整个目录树
        f2.mkdirs ();//目录结构中有一个不存在没关系，创建整个目录树
        //System.out.println (flag);//创建失败


    }


}

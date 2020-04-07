package file;

import java.io.File;

public class PrintFileTree {

    public static void main(String[] args) {
        File file=new File ( "D:\\2sxt" );
        printFile ( file ,0);

    }

     public static void printFile(File file,int level){

        for (int i=0;i<level;i++){
            System.out.print ("-");
        }

        System.out.println (file.getName ());
        if (file.isDirectory ()){

            File[] files = file.listFiles ();


            for (File temp:files){
                printFile ( temp,level+1 );
                //System.out.println ( temp );

            }
        }
    }

}

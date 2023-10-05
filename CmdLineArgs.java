				METHOD-1
import java.io.*;
public class CmdLineArgs {
    public static void main(String args[]) {
        if(args.length>2)
        System.out.println("Invalid arguments");
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x+y;
        System.out.println("Sum of"+x+"and"+y+"is"+z);
    }
}

       				METHOD-2
import java.io.*;
public class CmdLineArgsV2 {
    public static void main(String args[]) {
        if(args.length!=2){
        System.out.println("Invalid number of arguments \n You need to pass two integers");
        }
        else{
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x+y;
        System.out.println("Sum of"+x+"and"+y+"is"+z);
        }
    }
}

                           METHOD-3
import java.io.*;
public class CmdLineArgsV3 extends Object {
    public static void main(String args[]) {
        CmdLineArgsV3 obj = new CmdLineArgsV3();
        if(args.length!=2){
        System.out.println("Invalid number of arguments \n You need to pass two integers");
        }
        else{
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x+y;
        System.out.println("Sum of"+x+"and"+y+"is"+z);
        }
    }
}

				METHOD-4
import java.io.*;
public class CmdLineArgsV3 extends Object {
    public static void main(String args[]) {
        CmdLineArgsV3 obj = new CmdLineArgsV3();
        if(args.length!=2){
        System.out.println("Invalid number of arguments \n You need to pass two integers");
        }
        else{
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x+y;
         System.out.println("The class name is:-"+obj.getClass());
        System.out.println("Sum of"+x+"and"+y+"is"+z);
        }
    }
}
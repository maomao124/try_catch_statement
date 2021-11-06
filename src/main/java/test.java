import java.awt.*;
import java.util.Scanner;

/**
 * Project name(项目名称)：try catch语句
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/6
 * Time(创建时间)： 18:45
 * Version(版本): 1.0
 * Description(描述)： 如果 try 语句块中发生异常，那么一个相应的异常对象就会被拋出，
 * 然后 catch 语句就会依据所拋出异常对象的类型进行捕获，并处理。处理之后，程序会跳过 try 语句块中剩余的语句，
 * 转到 catch 语句块后面的第一条语句开始执行。
 * 如果 try 语句块中没有异常发生，那么 try 块正常结束，后面的 catch 语句块被跳过，程序将从 catch 语句块后的第一条语句开始执行。
 * 注意：try...catch 与 if...else 不一样，try 后面的花括号{ }不可以省略，即使 try 块里只有一行代码，也不可省略这个花括号。
 * 与之类似的是，catch 块后的花括号{ }也不可以省略。另外，try 块里声明的变量只是代码块内的局部变量，它只在 try 块内有效，其它地方不能访问该变量。
 * printStackTrace() 方法：指出异常的类型、性质、栈层次及出现在程序中的位置.
 * getMessage() 方法：输出错误的性质。
 * toString() 方法：给出异常的类型与性质。
 */

public class test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name = null;
        int age = 0;
        String sex = null;
        try
        {
            System.out.print("姓名：");
            name = input.next();
            System.out.print("年龄：");
            age = input.nextInt();
            System.out.print("性别：");
            sex = input.next();
        }
        catch (Exception e)
        {
            System.err.println("输入错误！！！");
            Toolkit.getDefaultToolkit().beep();
        }
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + sex);

        int number = 0;
        int errCount = 0;
        while (true)
        {
            try
            {
                System.out.println("输入数字（1-10）：");
                number = input.nextInt();
                if (number >= 1 && number <= 10)
                {
                    break;
                }
                else
                {
                    errCount++;
                    Toolkit.getDefaultToolkit().beep();
                    if (errCount > 10)
                    {
                        System.out.println("错误次数过多！！！退出");
                        System.exit(1);
                    }
                    System.err.println("输入的数据不在范围内");
                }
            }
            catch (Exception e)
            {
                errCount++;
                if (errCount > 3)
                {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("错误次数过多！！！退出");
                    System.exit(1);
                }
                else
                {
                    Toolkit.getDefaultToolkit().beep();
                    System.err.println("输入错误！！！请重新输入！");
                    input.nextLine();
                }
            }
        }
        System.out.println("数字：" + number);
    }
}

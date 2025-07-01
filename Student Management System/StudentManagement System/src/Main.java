import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        loop:while (true){System.out.println("-----欢迎来到管理系统-----");
        System.out.println("1:添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改信息");
        System.out.println("4:查询信息");
        System.out.println("5:退出");
        System.out.println("输入您的选择");

        switch(sc.nextInt()) {
            case 1:
                stu.addto(list);
                break;
            case 2:
                stu.delete(list);
                break;
            case 3:
                stu.edit(list);
                break;
            case 4:
                stu.find(list);
                break;
            case 5:
                System.out.println("结束");
                break loop;
        }
        }
    }
}

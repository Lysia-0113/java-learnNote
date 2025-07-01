import java.util.Scanner;
import java.util.ArrayList;
public class Student {
    private int id;
    private String name;
    private int age;
    private String address;


    public Student() {
    }

    public Student(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Student{id = " + id + ", name = " + name + ", age = " + age + ", address = " + address + "}";
    }
    //添加
    public  void addto(ArrayList<Student> list) {
        Student s=new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入ID");
        int id=sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println("ID重复");
                return;
            }
        }
        s.setId(id);
        System.out.println("输入名字");
        s.setName(sc.next());
        System.out.println("输入年龄");
        s.setAge(sc.nextInt());
        System.out.println("输入家庭地址");
        s.setAddress(sc.next());
        list.add(s);
        return ;
    }
    //删除
    public  int delete(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入删除的ID");
        int id=sc.nextInt();
        if(isRepeat(list,id)==list.size()) {
            System.out.println("不存在该id");

        }
        else  {
            list.remove(isRepeat(list,id));
            System.out.println("删除成功");
        }
        return isRepeat(list,id);
    }
    //修改
    public   void edit(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入修改ID");
        int id=sc.nextInt();

            if (isRepeat(list,id)==list.size()) {
                System.out.println("不存在该ID");
            }
            else {
                System.out.println("请输入要修改的信息");
                System.out.println("1:id");
                System.out.println("2:name");
                System.out.println("3:age");
                System.out.println("4:address");
                int num=sc.nextInt();

                switch (num) {
                        case 1:
                            System.out.println(list.get(isRepeat(list, id)).getId());
                            System.out.println("修改为:");
                            int id1=sc.nextInt();
                            if (isRepeat(list,num)!=list.size()) {
                                System.out.println("该ID已存在");
                                break;
                            }
                            else{
                                list.get(isRepeat(list, id)).setId(id1);
                                break;
                            }
                        case 2:
                            System.out.println(list.get(isRepeat(list, id)).getName());
                            System.out.println("修改为:");
                            list.get(isRepeat(list, id)).setName(sc.next());
                            break;
                        case 3:
                            System.out.println(list.get(isRepeat(list, id)).getAge());
                            System.out.println("修改为:");
                            list.get(isRepeat(list, id)).setAge(sc.nextInt());
                            break;
                        case 4:
                            System.out.println(list.get(isRepeat(list, id)).getAddress());
                            System.out.println("修改为:");
                            list.get(isRepeat(list, id)).setAddress(sc.next());
                            break;
                        default:
                            System.out.println("没有这个选项");
                    }
            }


    }
    //查询
    public void find(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入查询ID");
        int id=sc.nextInt();

        if (isRepeat(list,id)==list.size()) {
            System.out.println("不存在该ID");
        }
        else {
            System.out.print(list.get(isRepeat(list,id)).getId()+"\t");
            System.out.print(list.get(isRepeat(list,id)).getName()+"\t");
            System.out.print(list.get(isRepeat(list,id)).getAge()+"\t");
            System.out.print(list.get(isRepeat(list,id)).getAddress()+"\t");
            System.out.println();
        }
    }
    //id是否重复
    public  int isRepeat(ArrayList<Student> list,int id){
        int i=0;
        for ( i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
               return i;
            }
        }
        return i;
    }
}

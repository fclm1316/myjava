public class Part {
//    设定常量 final 数据类型  常量名称(一般用大写字母) ,常量必须赋值
    static final double PI = 3.14;
    static int age = 23;
    public static void main(String[] args){
        final int number;
        number = 1234;
        age = 24;
        //number = 1398      //number 为常量，只能赋值一次
        System.out.println("常量PI的值：" + PI);
        System.out.println("int 型变量age的值为: " + age);

    }
}

public class Calculation {
    public static void main(String[] args){
        int a = 2;
        int b = 5;
//        声明boolean 型变量，用于保存应用逻辑运算符 && 后的返回值
//        短路运算符 &&  ，非短路运算符&
        boolean result1 = ((a > b ) && (a != b));
        boolean result2 = ((a > b ) || (a != b));
        System.out.println(result1);
        System.out.println(result2);
    }
}

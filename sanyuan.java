public class sanyuan {
    public static void main(String[] args){
        int a = 3;
        int b = 4;
//      值1 运算符 值2  ? false;ture
        int c = a > b ? 100:200;
        System.out.println(c);

        if(a > b)
            c = 200;
        else
            c = 100;
        System.out.println(c);


    }
}

public class GetSwitch {
    public static void main(String[] args){
//        字符串或 整型
        String str = "我是魔王";
        switch (str){
            case "魔王":
                System.out.println("魔王");
                break;
            case "我是魔王":
                System.out.println("对的");
                break;
            default:
                System.out.println("你猜");
        }
        int week = 2;
        switch (week){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
        }
    }

}

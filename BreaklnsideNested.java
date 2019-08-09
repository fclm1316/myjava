public class BreaklnsideNested {
    public static void main(String args[]){
        Loop:for (int i = 0;i <= 100;i++){
//        for (int i = 0;i <= 100;i++){
            for (int j = 100;j >= 0; j--){
                if (j == 50 ){
                    break Loop;
//                  break;
                }
                System.out.println(i+ " ," + j);
            }
        }
    }
}

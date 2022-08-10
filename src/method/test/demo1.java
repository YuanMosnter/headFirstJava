package method.test;

public class demo1 {
    public static void main(String[] args) {
        demo1 demo1 = new demo1();
        demo1.go();
      demo1.mixFor();

    }

    void go(){
        int y = 7;
        for (int x = 1; x < 8; x++) {
            //先拿值再自增
            y++;
            if (x>4){
                //拿到自增之后的值展示
                System.out.println(++y+ " ");
            }
            if (y>14){
                System.out.println("x = " +x );
                break;
            }
        }
    }

    void mixFor(){
        int x = 0 ;
        int y = 30;
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner >1 ; inner--) {
                x++;
                y=y-2;
                if (x==6){
                    break;
                }
                x= x+3;
            }
            y = y-2 ;
        }
        System.out.println(x + " " + y);
    }
}

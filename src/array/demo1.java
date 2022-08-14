package array;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {

        //创建一个arraylist
        ArrayList<Egg> arrayList = new ArrayList<Egg>();

        //加入元素
        Egg egg = new Egg();
        Egg egg1 = new Egg();

        arrayList.add(egg);
        arrayList.add(egg1);

        System.out.println(arrayList);

        //查询数组的大小
        int size = arrayList.size();
        System.out.println(size);

        //查询特定元素
        boolean b = arrayList.contains(egg1);
        System.out.println(b);
        boolean ba= arrayList.contains(egg);
        System.out.println(ba);

        boolean empty = arrayList.isEmpty();
        System.out.println(empty);

    }

}

package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveRemoveIfTest {

    public static void main(String[] args) {

        ArrayList<Integer> test = new ArrayList<>();

        test.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        test.get(0);
//TODO When using foreach it gives error but at normal for loop there is not any problem. I need to research this issue.
        /*for (Integer each : test) {
            if(each % 2 == 0){
                test.remove(each);
            }
        }*/

        for (int i = 0; i < test.size(); i++) {
            if(test.get(i) == 5 || test.get(i) == 6){
                test.remove(i);
            }
        }

        System.out.println("test = " + test);


    }
}

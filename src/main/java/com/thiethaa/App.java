package com.thiethaa;

import com.thiethaa.model.Apple;
import com.thiethaa.model.GreenBigApple;
import com.thiethaa.model.RedApple;
import com.thiethaa.predicate.ApplePredicate;
import com.thiethaa.utils.AppleUtil;

import java.util.ArrayList;
import java.util.List;
//using lambda and predicate
public class App {
    public static void main(String[] args) {
        List<Apple>inventory = AppleUtil.getApples();
        //loop over inventory using double colon ::
        inventory.forEach(System.out::println);
        //print red apples
        System.out.println("\nred APPle");
        filterApple(inventory,new RedApple()).forEach(System.out::println);
        //print green and big apples
        System.out.println("bigGreenApple");
        filterApple(inventory,new GreenBigApple()).forEach(System.out::println);
    }
    public static List<Apple> filterApple(List<Apple> apples, ApplePredicate p){
        List<Apple> result= new ArrayList<>();
        for(Apple a :apples){
            if(p.test(a)){
                result.add(a);
            }
        }
        return result;
    }
}

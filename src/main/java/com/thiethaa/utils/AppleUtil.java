package com.thiethaa.utils;

import com.thiethaa.model.Apple;

import java.util.ArrayList;
import java.util.List;

public class AppleUtil {
    public static List<Apple>getApples(){
        List<Apple>apples= new ArrayList<>();
        apples.add(Apple.builder().color("red").weight(99).build());
        apples.add(Apple.builder().color("green").weight(103).build());
        apples.add(Apple.builder().color("orange").weight(104).build());
        apples.add(Apple.builder().color("yellow").weight(134).build());
        apples.add(Apple.builder().color("red").weight(121).build());
        apples.add(Apple.builder().color("yellow").weight(145).build());
        apples.add(Apple.builder().color("orange").weight(98).build());
        apples.add(Apple.builder().color("yellow").weight(131).build());
        apples.add(Apple.builder().color("green").weight(132).build());
        apples.add(Apple.builder().color("red").weight(176).build());
        return apples;
    }

}

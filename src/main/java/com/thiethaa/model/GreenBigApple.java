package com.thiethaa.model;

import com.thiethaa.predicate.ApplePredicate;

public class GreenBigApple implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equalsIgnoreCase("green") && apple.getWeight() > 100;
    }
}

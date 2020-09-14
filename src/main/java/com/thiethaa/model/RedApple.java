package com.thiethaa.model;

import com.thiethaa.predicate.ApplePredicate;

public class RedApple implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equalsIgnoreCase("red");
    }
}

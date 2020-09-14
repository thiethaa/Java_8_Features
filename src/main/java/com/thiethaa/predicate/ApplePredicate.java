package com.thiethaa.predicate;

import com.thiethaa.model.Apple;

@FunctionalInterface
public interface ApplePredicate {
    boolean test(Apple apple);
}

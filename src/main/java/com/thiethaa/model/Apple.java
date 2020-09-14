package com.thiethaa.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Apple {
    private int weight;
    private String color;

    @Override
    public String toString() {
        return "weight = " + weight +
               ", color = " + color;
    }
}

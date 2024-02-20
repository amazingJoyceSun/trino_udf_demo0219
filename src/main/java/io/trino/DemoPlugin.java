package io.trino;

import io.trino.spi.Plugin;

import java.util.Set;
import com.google.common.collect.ImmutableSet;
public class DemoPlugin implements Plugin {
    /*
    joyce,
    2024/2/19
    */

    @Override
    public Set<Class<?>> getFunctions() {

        return ImmutableSet.<Class<?>>builder().add(DemoFunction.class)
                .add(DemoFunction2.class)
                .build();
    }

    public static void main(String args[]) {
    }
}
package io.trino;

import io.airlift.slice.Slice;
import io.airlift.slice.SliceUtf8;
import io.airlift.slice.Slices;
import io.trino.spi.function.Description;
import io.trino.spi.function.ScalarFunction;
import io.trino.spi.function.SqlNullable;
import io.trino.spi.function.SqlType;
import io.trino.spi.type.StandardTypes;

public class DemoFunction2 {
    /*
    joyce,
    2024/2/20
    */
    @SqlType(StandardTypes.VARCHAR)
    @Description("to lower case")
    @ScalarFunction("get_lower_case")
    public static Slice getLower(@SqlNullable @SqlType(StandardTypes.VARCHAR)Slice input){
        String inpt = input.toStringUtf8();
        if(inpt.isEmpty())
            return Slices.utf8Slice("");
        else return Slices.utf8Slice(inpt.toLowerCase());

    }
    public static void main(String args[]) {
    }
}
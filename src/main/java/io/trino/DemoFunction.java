package io.trino;

import io.airlift.slice.Slice;
import io.trino.spi.function.Description;
import io.trino.spi.function.ScalarFunction;
import io.trino.spi.function.SqlNullable;
import io.trino.spi.function.SqlType;
import io.trino.spi.type.StandardTypes;
public class DemoFunction {
    /*
    joyce,
    2024/2/19
    */
    @SqlType(StandardTypes.BIGINT)
    @Description("this is a demo function")
    @ScalarFunction("demo_0219")
    public static long demoFunction(@SqlNullable @SqlType(StandardTypes.VARCHAR) Slice input){
        String inpt = input.toStringUtf8();
        try {
            if ("test".equals(inpt))
                return 1;
            else
                return 2;
        }catch (Exception e){e.printStackTrace();return 0;}
    }
}
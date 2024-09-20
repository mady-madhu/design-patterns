package org.example.factory;

import java.util.function.Function;

public class ProcessorFactory {

    public static AnalyticalProcessor createProcessor(String processType) {

        Function<String, AnalyticalProcessor> processorFunction =
                (processorType) -> {
                     switch (processorType) {
                         case "4G": return new AnalyticalProcessor4G();
                         case "5G": return new AnalyticalProcessor5G();
                         default: return null;
                    }
                };

        return processorFunction.apply(processType);
    }
}

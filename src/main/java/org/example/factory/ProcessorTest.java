package org.example.factory;

public class ProcessorTest {
    public static void main(String[] args) {
        AnalyticalProcessor processor4G = ProcessorFactory.createProcessor("4G");
        processor4G.process();

        AnalyticalProcessor processor5G = ProcessorFactory.createProcessor("5G");
        processor5G.process();
    }
}

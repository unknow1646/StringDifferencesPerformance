package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //EXAMPLE OF StringBuffer Object
        StringBuffer stringBuffer = new StringBuffer("First StringBuffer");
        stringBuffer.append(" Second StringBuffer");
        System.out.println("StringBuffer -> " + stringBuffer); //Final StringBuffer Object

        StringBuilder stringBuilder = new StringBuilder("First StringBuilder");
        stringBuilder.append(" Second StringBuilder"); //Final StringBuilder Object
        System.out.println("StringBuilder -> "+ stringBuilder);

        //Let´s take a look to a performance test
        System.out.println("--- PERFORMANCE TEST ---");
        //StringBuffer
        long startTime = System.currentTimeMillis();
        StringBuffer stringBuffer1 = new StringBuffer();
        for (int i=0; i< 10000; i++){
            stringBuffer1.append("WORD");
        }
        System.out.println("StringBuffer time process : " + (System.currentTimeMillis() - startTime) + "ms");

        //StringBuilder
        long startTime1 = System.currentTimeMillis();
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i=0; i< 10000; i++){
            stringBuilder1.append("WORD");
        }
        System.out.println("StringBuilder time process : " + (System.currentTimeMillis() - startTime1) + "ms");
    }
}

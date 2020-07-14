package utils;

import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {
    public void saveOrderIDs(String methodName, String orderID) throws IOException {
        java.io.FileWriter fileWriter = new java.io.FileWriter("fetchrOrders.txt", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("Method Name: " + methodName + " : Order ID: " + orderID);
        printWriter.close();
    }

    public void saveOrderIDsforAramex(String methodName, String orderID) throws IOException {
        java.io.FileWriter fileWriter = new java.io.FileWriter("aramexOrders.txt", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("Method Name: " + methodName + " : Order ID: " + orderID);
        printWriter.close();
    }
}

package Java_Seminar12_CWandHW.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class Saver implements Saveable {

    @Override
    public void saveToJson(Order o) {
        String fileName = "src/Java_Seminar12_CWandHW/srp2/order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + o.getClientName() + "\",\n");
            writer.write("\"product\":\"" + o.getProduct() + "\",\n");
            writer.write("\"qnt\":" + o.getQnt() + ",\n");
            writer.write("\"price\":" + o.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
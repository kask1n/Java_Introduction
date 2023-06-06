package Java_Lecture8.Ex006.Format;

import Java_Lecture8.Ex006.Document.TextDocument;

import java.io.FileWriter;
import java.io.IOException;

public class Pdf extends TextFormat {
    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".pdf", false)) {
            writer.write("PDF Format\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
package Java_Lecture8.Ex006.Interface;

import Java_Lecture8.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}

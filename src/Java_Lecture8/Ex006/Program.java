package Java_Lecture8.Ex006;

import Java_Lecture8.Ex006.Applications.Notepad;
import Java_Lecture8.Ex006.Format.*;

public class Program {
    public static void main(String[] args) {

        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("E:\\Git\\Java_Introduction\\src\\Java_Lecture8\\Ex006\\file1", new Txt());
        notes.SaveAs("E:\\Git\\Java_Introduction\\src\\Java_Lecture8\\Ex006\\file2", new Md());
        notes.SaveAs("E:\\Git\\Java_Introduction\\src\\Java_Lecture8\\Ex006\\file3", new Doc());
        notes.SaveAs("E:\\Git\\Java_Introduction\\src\\Java_Lecture8\\Ex006\\file4", new Pdf());

    }
}
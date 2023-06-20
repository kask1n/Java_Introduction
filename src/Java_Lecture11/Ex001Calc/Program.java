package Java_Lecture11.Ex001Calc;

public class Program {
    public static void main(String[] args) {
//        var m = new SumModel();
//        var v = new View();
        Presenter p = new Presenter(new SumModel(), new View());
//        PresenterOfT<SumModel> p = new PresenterOfT<>(new SumModel(), new View());

        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

    }
}

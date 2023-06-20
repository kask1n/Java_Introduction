package Java_Seminar13_CWandHW.decoratorFactory_calculator;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    int getResult();
}

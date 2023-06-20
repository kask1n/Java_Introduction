package Java_Lecture10.Ex004.V3;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class Content {
    public String name;

    public Content(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}

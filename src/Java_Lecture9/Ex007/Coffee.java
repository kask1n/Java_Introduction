package Java_Lecture9.Ex007;

import java.util.Iterator;

public class Coffee extends Beverage {

    @Override
    public Iterator<Ingredient> iterator() {

        Iterator<Ingredient> it = new Iterator<>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Ingredient next() {
                return components.get(index++);
            }

        };
        return it;

    }

}

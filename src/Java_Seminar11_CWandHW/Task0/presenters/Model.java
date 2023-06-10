package Java_Seminar11_CWandHW.Task0.presenters;

import Java_Seminar11_CWandHW.Task0.models.Table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public interface Model {

    /**
     * Получение списка всех столиков.
     *
     * @return
     */
    public Collection<Table> loadTables();

    /**
     * Бронирование столика
     *
     * @param reservationDate Дата бронирования
     * @param tableNo         Номер столика
     * @param name            Имя клиента
     * @return
     */
    public int reservationTable(Date reservationDate, int tableNo, String name);
}
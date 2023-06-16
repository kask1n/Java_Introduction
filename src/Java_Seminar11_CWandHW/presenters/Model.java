package Java_Seminar11_CWandHW.presenters;

import Java_Seminar11_CWandHW.models.Table;

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

    /**
     * Изменение бронирования (удаление старого и добавление нового)
     * @param oldReservationId Номер удаляемого бронирования
     * @param reservationDate Новая дата бронирования
     * @param tableNo Новый номер столика
     * @param name Новое имя клиента
     * @return
     */
    public int changeReservationTable(int oldReservationId, Date reservationDate, int tableNo, String name);
}
package Java_Seminar11_CWandHW.Task0.views;

import Java_Seminar11_CWandHW.Task0.models.Table;
import Java_Seminar11_CWandHW.Task0.presenters.View;
import Java_Seminar11_CWandHW.Task0.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void updateTablesView(Collection<Table> tables) {
        for (Table table : tables)
            System.out.println(table);
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     *
     * @param reservationDate Дата бронирования
     * @param tableNo         Номер столика
     * @param name            Имя клиента
     */
    public void reservationTableEvent(Date reservationDate, int tableNo, String name) {
        observer.onReservationTable(reservationDate, tableNo, name);  // Наблюдатель.
    }

    @Override
    public void updateReservationTableResult(int reservationNo) {
        System.out.printf("Столик успешно забронирован. Номер Вашей брони: %d", reservationNo);
    }


    /**
     * TODO: Доработать метод в рамках домашнего задания.
     * Действие клиента (пользователь нажал на кнопку изменения бронирования), изменение бронирования столика
     *
     * @param oldReservation
     * @param reservationDate
     * @param tableNo
     * @param name
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {

    }
}

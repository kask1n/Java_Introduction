package Java_Seminar11_CWandHW.views;

import Java_Seminar11_CWandHW.models.Table;
import Java_Seminar11_CWandHW.presenters.View;
import Java_Seminar11_CWandHW.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

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


    @Override
    public void updateReservationTableResult(int tableNo, int reservationNo) {
        System.out.printf("\nСтолик #%d успешно забронирован. Номер Вашей брони: %d", tableNo, reservationNo);
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

    /** Действие клиента (пользователь нажал на кнопку изменения бронирования), изменение бронирования столика
     *
     * @param oldReservationId Номер удаляемого бронирования
     * @param reservationDate Новая дата бронирования
     * @param tableNo Новый номер столика
     * @param name Новое имя клиента
     */
    public void changeReservationTableEvent(int oldReservationId, Date reservationDate, int tableNo, String name) {
        observer.onChangeReservationTable(oldReservationId, reservationDate, tableNo, name);
    }
}

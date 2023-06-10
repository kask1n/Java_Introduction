package Java_Seminar11_CWandHW.Task0;

import Java_Seminar11_CWandHW.Task0.models.TableModel;
import Java_Seminar11_CWandHW.Task0.presenters.BookingPresenter;
import Java_Seminar11_CWandHW.Task0.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА.
     * Метод changeReservationTable должен заработать!
     *
     * @param args
     */
    public static void main(String[] args) {
        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();

        bookingView.reservationTableEvent(new Date(), 103, "Станислав");

//        bookingView.changeReservationTable();
    }
}

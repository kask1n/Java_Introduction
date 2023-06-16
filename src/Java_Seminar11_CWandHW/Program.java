// Семинар 11. Домашняя работа:
// Метод changeReservationTable должен заработать!

package Java_Seminar11_CWandHW;

import Java_Seminar11_CWandHW.models.TableModel;
import Java_Seminar11_CWandHW.presenters.BookingPresenter;
import Java_Seminar11_CWandHW.views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();

        bookingView.reservationTableEvent(new Date(), 103, "Станислав");

        bookingView.changeReservationTableEvent(9001, new Date(), 101, "Александр");
    }
}
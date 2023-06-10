package Java_Seminar11_CWandHW.Task0.presenters;

import Java_Seminar11_CWandHW.Task0.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final View bookingView;
    private final Model tableModel;

    public BookingPresenter(View bookingView, Model tableModel) {
        this.bookingView = bookingView;
        this.tableModel = tableModel;
        bookingView.setObserver(this);
    }

    private Collection<Table> loadTables() {
        return tableModel.loadTables();
    }

    public void showTables() {
        bookingView.updateTablesView(loadTables());
    }

    private void showReservationTableResult(int reservationNo) {
        bookingView.updateReservationTableResult(reservationNo);
    }

    @Override
    public void onReservationTable(Date reservationDate, int tableNo, String name) {
        int reservationNo = tableModel.reservationTable(reservationDate, tableNo, name);
        showReservationTableResult(reservationNo);
    }
}

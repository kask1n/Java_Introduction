package Java_Seminar11_CWandHW.presenters;

import Java_Seminar11_CWandHW.models.Table;

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

    private void showReservationTableResult(int tableNo, int reservationNo) {
        bookingView.updateReservationTableResult(tableNo, reservationNo);
    }

    public void onReservationTable(Date reservationDate, int tableNo, String name) {
        int reservationNo = tableModel.reservationTable(reservationDate, tableNo, name);
        showReservationTableResult(tableNo, reservationNo);
    }

    @Override
    public void onChangeReservationTable(int oldReservationId, Date reservationDate, int tableNo, String name) {
        int newReservationNo = tableModel.changeReservationTable(oldReservationId, reservationDate, tableNo, name);
        if (newReservationNo > 0)
            showReservationTableResult(tableNo, newReservationNo);
    }
}

package Java_Seminar11_CWandHW.presenters;

import Java_Seminar11_CWandHW.models.Table;

import java.util.Collection;

public interface View {

    void setObserver(ViewObserver observer);

    void updateTablesView(Collection<Table> tables);

    void updateReservationTableResult(int tableNo, int reservationNo);
}

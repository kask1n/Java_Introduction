package Java_Seminar12_CWandHW.isp1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<PaymentService> paymentServices = new ArrayList<>();
        paymentServices.add(new CustomPaymentService());
        paymentServices.add(new InternetPaymentService());

        for (PaymentService paymentService: paymentServices) {
            if (paymentService instanceof PhonePayable){
                ((PhonePayable)paymentService).payPhoneNumber(2000);
                break;
            }


        }

    }

}

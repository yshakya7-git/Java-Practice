package solidprinciple.ocp;

public interface NotificationService {

    void sendOtp(String medium);

    void sendTransactionReport(String medium);
}

package week5.ExceptionHandling.ExceptionHandling.src.age_check_exception;

public class AgeCheckException extends Exception {
    public AgeCheckException(String message) {
        super(message);
        //  System.out.println("Hata Yakalandı!!");
        // İlk buradaki kod çalışır çünkü kalıtılan parent burasıdır yani önce hata yakalandı yazacak.
    }

    @Override
    public String toString() {
        return "Age Check sınıfına ait bir exception yapısıdır";
    }
}

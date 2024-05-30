package week5.ExceptionHandling.ExceptionHandling.src.exception_handler;

public class ExceptionHandlerIntroduction {
    public static void main(String[] args) {

        String str = null;
        int[] arr = new int[3];

        try {
            System.out.println(str.length());
            System.out.println(arr[5]);
            // 2 veya daha fazla farklı catch aşağıdaki gibi birleştirilebilir.
            // Bir try catch'de sadece 1 farklı kod hatası tespit edilebilir yani farklı farklı kodlardaki hatalar aynı anda tespit edilemez.
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Hatalar olsa da bu blokta çalışmak güzeldir");
        }
    }
}

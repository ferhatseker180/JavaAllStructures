package week5.PatikaStore.PatikaStore.src;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MobilePhone extends Brand implements FunctionInterface {
    // Telefona ait bazı specific fieldlar eklendi.
    private int phoneId;
    private String battery;
    private String phoneColor;
    private String camera;
    Map<Integer, MobilePhone> mobilePhoneMap = new TreeMap<>();
    Scanner scanner = new Scanner(System.in);

    public MobilePhone(int brandId, int phoneId, String brandName, String productName, int perPrice,
                       String screenSize, String storageInfo, String ram, String battery, String phoneColor,
                       String camera, int stockCount, int discountRate) {
        super(brandId, brandName, productName, storageInfo, perPrice, discountRate, stockCount, screenSize, ram);
        this.phoneId = phoneId;
        this.battery = battery;
        this.phoneColor = phoneColor;
        this.camera = camera;

    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getPhoneColor() {
        return phoneColor;
    }

    public void setPhoneColor(String phoneColor) {
        this.phoneColor = phoneColor;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    // Interface üzerindeki ortak bir metod olan print metodu override edildi ve listenin yazdırılma işlemi gerçekleştirildi.
    @Override
    public void print() {
        System.out.println("Telefon Listesi");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat       |  Marka    | Depolama  | Ekran    | Kamera  | Pil      | RAM     | Renk     |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

        // Map içerisindeki her bir elemanı gezer ve fieldlara aktarıp yazdırır
        for (Map.Entry<Integer, MobilePhone> entry : mobilePhoneMap.entrySet()) {
            int id = entry.getKey();
            MobilePhone phone = entry.getValue();
            String productName = phone.getProductName();
            double price = phone.getPerPrice();
            String brandName = phone.getBrandName();
            String storageInfo = phone.getStorageInfo();
            String screenSize = phone.getScreenSize();
            String camera = phone.getCamera(); // Kamera bilgisini al
            String battery = phone.getBattery();
            String ram = phone.getRam();
            String color = phone.getPhoneColor(); // Renk bilgisini al

            System.out.printf("| %-2d | %-30s | %-3.2f TL | %-9s | %-9s | %-8s | %-7s | %-8s | %-7s | %-8s |\n",
                    id, productName, price, brandName, storageInfo, screenSize, camera, battery, ram, color);
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
    }
    // Interface üzerindeki bir diğer ortak metod olan add metodu override edildi ve cep telefonu ekleme işlemi burada yapıldı.
    @Override
    public void add() {
        super.addBrand();
        System.out.println("Kaçıncı Ürünü Ekliyorsunuz? Key Giriniz: ");
        int key = scanner.nextInt();
        scanner.nextLine(); // Boş satırı oku

        System.out.println("Ürünün Markasının id Numarasını Giriniz: ");
        int brandId = scanner.nextInt();
        scanner.nextLine(); // Boş satırı oku

        System.out.println("Ürünün id Numarasını Giriniz: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); // Boş satırı oku

        System.out.println("Cep Telefonunun Modelini Giriniz: ");
        String productName = scanner.nextLine();

        System.out.println("Ürünün Fiyatını Giriniz: ");
        int price = scanner.nextInt();
        scanner.nextLine(); // Boş satırı oku

        System.out.println("Ürünün Ekran Boyutunu Giriniz:");
        String screenSize = scanner.nextLine();

        System.out.println("Ürünün Depolama Kapasitesini Giriniz:");
        String storage = scanner.nextLine();

        System.out.println("Ürünün RAM Bilgisini Giriniz: ");
        String ram = scanner.nextLine();

        System.out.println("Ürünün Batarya Kapasitesini Giriniz: ");
        String battery = scanner.nextLine();

        System.out.println("Ürünün Renginizi Giriniz: ");
        String color = scanner.nextLine();

        System.out.println("Ürünün Kamera Megapikselini Giriniz: ");
        String camera = scanner.nextLine();

        System.out.println("Ürünün Stok Adetini Giriniz: ");
        int stock = scanner.nextInt();
        scanner.nextLine(); // Boş satırı oku

        System.out.println("Ürünün İndirim Oranını Giriniz: ");
        int discountRate = scanner.nextInt();
        scanner.nextLine(); // Boş satırı oku

        mobilePhoneMap.put(key, new MobilePhone(brandId, phoneId, brandList.get(brandId), productName, price, screenSize, storage,
                ram, battery, color, camera, stock, discountRate));

    }
    // Listeden silinmek istenilen cep telefonu interface'de oluşturulup burada override edilen bu fonksiyonla silinmektedir.
    @Override
    public void delete() {
        super.addBrand();
        System.out.println("Hangi Cep Telefonunu Listeden Çıkartmak İstiyorsunuz: ");
        int choose = scanner.nextInt();
        mobilePhoneMap.remove(choose);
    }
    // Interface üzerinde ortak oluşturulan bu metod, Cep Telefonu seçimi yapılırsa kullanıcıya gösterilecek menüdür
    @Override
    public void createMenu() {
        System.out.println("1 -> Ürünleri Listele");
        System.out.println("2 -> Ürün Ekle");
        System.out.println("3 -> Ürün Sil");
        System.out.println("0 -> Çıkış");
        System.out.println("Seçiminiz: ");
        int menuChoose = scanner.nextInt();
        switch (menuChoose) {
            case 1:
                print();
                break;
            case 2:
                add();
                print();
                break;
            case 3:
                delete();
                break;
            case 0:
                break;
            default:
                System.out.println("Hatalı Seçim!!");
        }
    }

}

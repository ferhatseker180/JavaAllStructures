package week5.PatikaStore.PatikaStore.src;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Notebook extends Brand implements FunctionInterface {
    // Brand sınıfından extend alınarak daha az sayıda özelleştirilmiş field yazıldı.
    private int notebookId;
    Map<Integer, Notebook> notebookMap = new TreeMap<>();
    Scanner scanner = new Scanner(System.in);
    int menuChoose;

    public Notebook(int brandId, String brandName, int notebookId, String productName, String screenSize, String storageInfo, String ram, int perPrice, int stockCount, int discountRate) {
        super(brandId, brandName, productName, storageInfo, perPrice, discountRate, stockCount, screenSize, ram);
        this.notebookId = notebookId;
    }

    public int getNotebookId() {
        return notebookId;
    }

    public void setNotebookId(int notebookId) {
        this.notebookId = notebookId;
    }

    // Interface üzerindeki ortak bir metod olan print metodu override edildi ve listenin yazdırılma işlemi gerçekleştirildi.
    @Override
    public void print() {
        System.out.println("Notebook Listesi");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı \t \t \t \t | Fiyat \t \t | Marka \t| Depolama    | Ekran \t | RAM \t  |");
        System.out.println("----------------------------------------------------------------------------------------------");

        for (Map.Entry<Integer, Notebook> entry : notebookMap.entrySet()) {
            int id = entry.getKey();
            Notebook notebook = entry.getValue();
            String productName = notebook.getProductName();
            double price = notebook.getPerPrice();
            String brandName = notebook.getBrandName();
            String storageInfo = notebook.getStorageInfo();
            String screenSize = notebook.getScreenSize();
            String ram = notebook.getRam();

            System.out.printf("| %-2d | %-25s | %-8.2fTL    | %-10s | %-11s | %-8s| %-6s|\n",
                    id, productName, price, brandName, storageInfo, screenSize, ram);
        }
        System.out.println("----------------------------------------------------------------------------------------------");
    }

    // Interface üzerindeki bir diğer ortak metod olan add metodu override edildi ve notebook ekleme işlemi burada yapıldı.
    @Override
    public void add() {
        super.addBrand();

        System.out.println("Kaçıncı Ekleme İşlemini Yapıyorsunuz, Key Giriniz: ");
        int key = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ürünün Markasının id Numarasını Giriniz: ");
        int brandId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ürünün id Numarasını Giriniz: ");
        int productId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ürünün Adını Giriniz: ");
        String productName = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ürünün Ekran Boyutunu Giriniz:");
        String screenSize = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ürünün Depolama Kapasitesini Giriniz:");
        String storage = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ürünün RAM Bilgisini Giriniz: ");
        String ram = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ürünün Fiyatını Giriniz: ");
        int price = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ürünün Stok Adetini Giriniz: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ürünün İndirim Oranını Giriniz: ");
        int discountRate = scanner.nextInt();
        scanner.nextLine();

        notebookMap.put(key, new Notebook(brandId, brandList.get(brandId), notebookId, productName, screenSize, storage, ram, price, stock, discountRate));

    }

    // Listeden silinmek istenilen notebook interface'de oluşturulup burada override edilen bu fonksiyonla silinmektedir.
    @Override
    public void delete() {
        super.addBrand();
        System.out.println("Hangi Notebook'u Listeden Çıkartmak İstiyorsunuz: ");
        int choose = scanner.nextInt();
        notebookMap.remove(choose);
    }

    // Interface üzerinde ortak oluşturulan bu metod, Notebook seçimi yapılırsa kullanıcıya gösterilecek menüdür
    @Override
    public void createMenu() {
        System.out.println("1 -> Ürünleri Listele");
        System.out.println("2 -> Ürün Ekle");
        System.out.println("3 -> Ürün Sil");
        System.out.println("0 -> Çıkış");
        System.out.println("Seçiminiz: ");
        menuChoose = scanner.nextInt();
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

package week5.PatikaStore.PatikaStore.src;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Store {
    // Kullanıcıdan veri almak için Scanner import edildi.
    private Scanner scanner = new Scanner(System.in);
    // TreeMap tercih edildi çünkü FIFO mantığı bu proje için daha kullanışlı olabilir.
    Map<Integer, String> brandList = new TreeMap<>();
    // MobilePhone Ve Notebook sınıflarından bir default constructor tanımlaması yapıldı.
    MobilePhone mobilePhone = new MobilePhone(0, 0, "", "", 0, "", "", "",
            "", "", "", 0, 0);
    Notebook notebook = new Notebook(0, "", 0, "", "", "",
            "", 0, 0, 0);
    // Menüdeki bazı seçimleri aşağıdaki 2 field tutmaktadır.
    int choose;
    int brandMenuChoose;

    // Açılış ekranı fonksiyonudur ve kullanıcı 0'a basana kadar sonlanmaz.
    public void menu() {
        do {
            System.out.println("Patika Store Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz: ");
            choose = scanner.nextInt();
            menuChooseControl();
        } while (choose != 0);
        System.out.println("Yeniden Bekleriz!");
    }

    // Cep Telefonları Listesinin yazdırılması işlemini gerçekleştirir.
    public void printMobilePhone() {
        mobilePhone.print();
    }

    public void setBrandList(Map<Integer, String> brandList) {
        this.brandList = brandList;
    }

    // Notebook listesinin yazdırılmasını sağlar.
    public void printNotebook() {
        notebook.print();
    }

    // Menu seçimlerini kontrol edip yönlendirme yapar.
    public void menuChooseControl() {
        switch (choose) {
            case 1:
                notebook.createMenu();
                break;
            case 2:
                mobilePhone.createMenu();
                break;
            case 3:
                brandMenu();
                break;
            case 0:
                break;
            default:
                System.out.println("Wrong Number: ");
        }
    }

    // Burada override edilerek notebook sınıfına eklenen addBrand fonksiyon parametreleri bu class içerisinde aktarıldı.
    public void addBrand() {
        brandList.clear();
        notebook.addBrand();
        brandList.putAll(notebook.brandList);
    }


    // Markaların görüntülenmesini, yazdırılmasını sağlar ayrıca girilen değerin Integer ve geçerli olup olmadığı kontrol edilir.
    public void showBrandList() {
        addBrand();
        for (String brand : brandList.values()) {
            System.out.println("- " + brand);
        }
        System.out.print("Ana Menüye Dönmek İçin 0'a Basın: ");
        String input = scanner.next();

        if (isInteger(input)) {
            brandMenuChoose = Integer.parseInt(input);
            if (brandMenuChoose == 0) {
                menu();
            } else {
                System.out.println("Hatalı Giriş!! Tekrar Ana Menüye Dönmek İçin 0'a Basın.");
                while (brandMenuChoose != 0 || !isInteger(input)) {
                    System.out.print("Lütfen Geçerli Bir Sayı Girin: ");
                    input = scanner.next();
                    if (isInteger(input)) {
                        brandMenuChoose = Integer.parseInt(input);
                        if (brandMenuChoose == 0) {
                            menu();
                        }
                    }
                }
            }
        } else {
            System.out.println("Hatalı Giriş!! Lütfen Geçerli Bir Sayı Girin.");
            showBrandList();
        }

    }

    // Değerin Integer veri tipinde olup olmadığı bu fonksiyonda kontrol edilir.
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Marka listesinin görüntülenmesini sağlar.
    public void brandMenu() {
        showBrandList();
    }

    // Ana fonksiyondur ve tüm fonksiyonlar buradan çağrılır
    public void start() {
        menu();
    }
}

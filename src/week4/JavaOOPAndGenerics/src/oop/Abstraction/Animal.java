package week4.JavaOOPAndGenerics.src.oop.Abstraction;

public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed); // private abstract kullanımı Java'da yasak olan bir kullanımdır diğer erişim belirleyiciler kullanılabilir.
    public abstract void makeNoise();

    // Abstrac classlar soyut olsalarda class içlerinde abstrack olmayan gövdeli metotlarda yazılabilir örneği aşağıdadır.
    public String getExplicitType(){
        return getClass().getSimpleName() + " (" + type + ")";
    }
}

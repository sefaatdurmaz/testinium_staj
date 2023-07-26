import java.util.Random;

public class Snake extends Obstacle {
    public Snake() {
        super(4, "Yılan", randomDamage(), 12, 5);
    }

    private static int randomDamage() {
        Random random = new Random();
        return random.nextInt(4) + 3; // 3 ile 6 (dahil) arasında rastgele bir sayı döndürür
    }
}



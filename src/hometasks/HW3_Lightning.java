// Расчет расстояния до места удара молнии. Звук в воздухе распространяется со скоростью приблизительно
// равной 1100 футам в секунду. Зная интервал времени между вспышкой молнии и звуком сопровождающим ее
// можно рассчитать расстояние. Допустим интервал 7,2 секунды.

package hometasks;

public class HW3_Lightning {
    //s = v * t
    private static float SOUND_SPEED = 1_087 * 0.3048f; // in meters

    public static float getLightningDistance(float time){
        float distance = SOUND_SPEED * time;
        return distance;
    }

    public static float getSoundSpeed() {
        return SOUND_SPEED;
    }


    public static void main(String[] args) {
        float time = 7.2f;
        System.out.println("Speed of sound is " + HW3_Lightning.getSoundSpeed() + " meters per second.");
        System.out.println("Distance to the lightning, flashing " + time + " seconds ago: "
                + HW3_Lightning.getLightningDistance(time) + " meters");
    }
}

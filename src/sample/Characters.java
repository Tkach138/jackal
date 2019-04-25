package sample;


import javafx.scene.image.ImageView;

public class Characters {
    ImageView image;
    ImageView fog;

    Characters(ImageView image, ImageView fog) {
        this.image = image;
        this.fog = fog;
    }

    public void move(int x, int y) {
        image.setY(image.getY() + y);
        fog.setY(fog.getY() + y);
        image.setX(image.getX() + x);
        fog.setX(fog.getX() + x);
    }
}

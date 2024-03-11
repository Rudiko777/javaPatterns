package pract7.Deputy;

import java.util.Objects;

public class SecuredDoor {
    protected Door door;
    public SecuredDoor(Door door){
        this.door = door;
    }

    public void open(String password){
        if (this.authenticate(password)){
            this.door.open();
        } else {
            System.out.println("Пароль неверный");
        }
    }

    public boolean authenticate(String password){
        return Objects.equals(password, "Пароль123");
    }

    public void close(){
        this.door.close();
    }
}

// File : DroppableItem.java
// Parent class for FishFood and Coin

public class DroppableItem {
    protected Position currentPosition;

    public DroppableItem(Position initialPosition) {
        this.currentPosition = initialPosition;
    }

    // Getter for Position
    public Position getCurrentPosition() {
        return this.currentPosition;
    }

    // Setter for Position
    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    // Method for vertical move
    public void moveDown(double t){
        this.currentPosition.setY(getCurrentPosition().getY()+20*t);
    }

}
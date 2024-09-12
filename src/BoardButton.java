import javafx.scene.control.Button;

public class BoardButton extends Button {
    private final int[] coordinate;

    //This makes the buttons for the markers on the board

    public BoardButton(int col, int row, String text) {
        super(text);
        this.coordinate = new int[]{col, row};
    }
    public int getCol() {
        return this.coordinate[0];
    }
    public int getRow() {
        return this.coordinate[1];
    }

    public boolean isAvailable() {
        return this.getText().trim().isEmpty();
    }
}
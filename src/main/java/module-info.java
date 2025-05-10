module br.com.dio.sudoku {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens br.com.dio.sudoku to javafx.fxml;
    exports br.com.dio.sudoku;
}
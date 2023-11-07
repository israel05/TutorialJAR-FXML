module usuario {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires accesorio;
	
	opens application to javafx.graphics, javafx.fxml;
	opens controllers to javafx.graphics, javafx.fxml;
}

module usuario {
	requires javafx.controls;
	requires javafx.fxml;
	requires componenteAccesorio;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens controllers to javafx.graphics, javafx.fxml;
}

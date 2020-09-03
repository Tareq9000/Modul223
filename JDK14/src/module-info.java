module JDK14 {
	exports demo;
	requires javafx.controls;
	opens demo to javafx.graphics;
	requires javafx.fxml;
}
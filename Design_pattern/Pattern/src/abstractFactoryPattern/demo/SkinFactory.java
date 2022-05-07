package abstractFactoryPattern.demo;

public interface SkinFactory {

    public Button createButton();

    public TextField createTextField();

    public ComboBox createComboBax();
}

interface Button {
    void click();
}

class LightButton implements Button {
    public void click() { System.out.println("Light Button"); }
}

class DarkButton implements Button {
    public void click() { System.out.println("Dark Button"); }
}

interface ThemeFactory {
    Button createButton();
}

class LightFactory implements ThemeFactory {
    public Button createButton() { return new LightButton(); }
}

class DarkFactory implements ThemeFactory {
    public Button createButton() { return new DarkButton(); }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        ThemeFactory factory = new DarkFactory();
        Button b = factory.createButton();
        b.click();
    }
}
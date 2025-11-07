class Document implements Cloneable {
    String title;

    Document(String t) { title = t; }

    public Document clone() {
        return new Document(title);
    }

    void show() {
        System.out.println("Title: " + title);
    }
}

public class PrototypeDemo {
    public static void main(String[] args) {
        Document d1 = new Document("Original");
        Document d2 = d1.clone();
        d2.title = "Copy";
        d1.show();
        d2.show();
    }
}

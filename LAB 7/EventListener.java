// Interface EventListener
interface EventListener {
    void performEvent();
}

// Interface MouseListener inheriting EventListener
interface MouseListener extends EventListener {
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}

// Interface KeyListener inheriting EventListener
interface KeyListener extends EventListener {
    void keyPressed();
    void keyReleased();
}

// EventDemo class implementing MouseListener and KeyListener
class EventDemo implements MouseListener, KeyListener {
    @Override
    public void performEvent() {
        System.out.println("Event performed");
    }

    @Override
    public void mouseClicked() {
        System.out.println("Mouse clicked");
    }

    @Override
    public void mousePressed() {
        System.out.println("Mouse pressed");
    }

    @Override
    public void mouseReleased() {
        System.out.println("Mouse released");
    }

    @Override
    public void mouseMoved() {
        System.out.println("Mouse moved");
    }

    @Override
    public void mouseDragged() {
        System.out.println("Mouse dragged");
    }

    @Override
    public void keyPressed() {
        System.out.println("Key pressed");
    }

    @Override
    public void keyReleased() {
        System.out.println("Key released");
    }
}

public class Main {
    public static void main(String[] args) {
        EventDemo eventDemo = new EventDemo();
        
        // Demonstrating MouseListener methods
        eventDemo.mouseClicked();
        eventDemo.mousePressed();
        eventDemo.mouseReleased();
        eventDemo.mouseMoved();
        eventDemo.mouseDragged();
        
        // Demonstrating KeyListener methods
        eventDemo.keyPressed();
        eventDemo.keyReleased();
        
        // Demonstrating performEvent method
        eventDemo.performEvent();
    }
}
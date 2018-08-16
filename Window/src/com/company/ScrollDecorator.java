package com.company;

//6. Optional embellishment
public class ScrollDecorator extends Decorator {

    public ScrollDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public void draw() {
        //7. Delegate to base class and add extra stuff
        super.draw();
        System.out.println(" ScrollDecorator");
    }
}


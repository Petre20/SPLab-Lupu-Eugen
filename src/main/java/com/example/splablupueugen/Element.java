package com.example.splablupueugen;

public interface Element {
    void render();
    void add(Element element);
    void remove(Element element);
    Element get(int index);
    void accept(Visitor visitor);
}

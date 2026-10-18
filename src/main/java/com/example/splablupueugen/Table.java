package com.example.splablupueugen;

public class Table implements Element{
    private String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void render() {
        System.out.println("Table with title: " + title);
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

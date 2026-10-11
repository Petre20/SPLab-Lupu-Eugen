package com.example.splablupueugen;

public class Paragraph implements Element{
    private String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text){
        this.text=text;
    }

    @Override
    public void print() {
        if (textAlignment == null) {
            System.out.println("Paragraph: " + text);
        } else {
            textAlignment.render(this, new Context(30));
        }
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

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy textAlignment) {
        this.textAlignment = textAlignment;
    }
}

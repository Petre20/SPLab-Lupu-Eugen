package com.example.splablupueugen;

import jakarta.persistence.Entity;
import jakarta.persistence.Transient;


@Entity
public class Paragraph extends BaseElement {
    private String text;
    @Transient
    private AlignStrategy textAlignment;
    public Paragraph(){}
    public Paragraph(String text){
        this.text=text;
    }

    @Override
    public void render() {
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setText(String text) {
        this.text = text;
    }
}

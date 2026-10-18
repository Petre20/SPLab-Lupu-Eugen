package com.example.splablupueugen;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    protected String title;
    protected List<Element> children=new ArrayList<>();

    public Section(String title){
        this.title=title;
    }


    public String getTitle() {
        return title;
    }

    @Override
    public void render() {
        System.out.println(title);
    }

    @Override
    public void add(Element element) {
        children.add(element);
    }

    @Override
    public void remove(Element element) {
        children.remove(element);
    }

    @Override
    public Element get(int index) {
        return children.get(index);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (Element element : children) {
            element.accept(visitor);
        }
    }
}

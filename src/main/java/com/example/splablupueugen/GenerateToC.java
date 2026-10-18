package com.example.splablupueugen;

public class GenerateToC implements Visitor {

    private final TableOfContents tableOfContents = new TableOfContents();

    @Override
    public void visit(Book book) {
        tableOfContents.addEntry(book.getTitle());
    }

    @Override
    public void visit(Section section) {
        tableOfContents.addEntry(section.getTitle());
    }

    @Override
    public void visit(TableOfContents tableOfContents) {
        // nothing to add
    }

    @Override
    public void visit(Paragraph paragraph) {
        // paragraphs are not part of the table of contents
    }

    @Override
    public void visit(ImageProxy imageProxy) {
        // images are not part of the table of contents
    }

    @Override
    public void visit(Image image) {
        // images are not part of the table of contents
    }

    @Override
    public void visit(Table table) {
        // tables are not part of the table of contents
    }

    public TableOfContents getToC() {
        return tableOfContents;
    }
}
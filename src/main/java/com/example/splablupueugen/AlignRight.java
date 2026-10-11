package com.example.splablupueugen;

public class AlignRight implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph, Context context) {
        String text = paragraph.getText();
        int spaces = context.getLineLength() - text.length();
        if (spaces < 0) {
            spaces = 0;
        }

        System.out.println(" ".repeat(spaces) + text);
    }
}

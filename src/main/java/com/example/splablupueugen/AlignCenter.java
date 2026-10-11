package com.example.splablupueugen;

public class AlignCenter implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph, Context context) {
        String text = paragraph.getText();
        int spaces = (context.getLineLength() - text.length()) / 2;
        if (spaces < 0) {
            spaces = 0;
        }

        System.out.println(" ".repeat(spaces) + text);
    }
}

package com.example.splablupueugen;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Paragraph.class, name = "paragraph"),
        @JsonSubTypes.Type(value = Image.class, name = "image"),
        @JsonSubTypes.Type(value = ImageProxy.class, name = "imageProxy"),
        @JsonSubTypes.Type(value = Table.class, name = "table"),
        @JsonSubTypes.Type(value = Section.class, name = "section"),
        @JsonSubTypes.Type(value = TableOfContents.class, name = "tableOfContents")
})

public interface Element {
    void render();
    void add(Element element);
    void remove(Element element);
    Element get(int index);
    void accept(Visitor visitor);
}

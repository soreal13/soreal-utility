package com.sorealutility.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class TranslateV1 {

    private String filename;

    private String text;

    private String translatedText;

}

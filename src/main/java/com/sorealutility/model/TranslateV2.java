package com.sorealutility.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 구글 브라우저 번역
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class TranslateV2 {

    private String filename;

    private String text;

}

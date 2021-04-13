package com.winkey.eventviewer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Venkatesh Rajendran
 * @vendor (Ideas2IT)
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeDto {
    private List<String> about;
    private List<String> slides;
}

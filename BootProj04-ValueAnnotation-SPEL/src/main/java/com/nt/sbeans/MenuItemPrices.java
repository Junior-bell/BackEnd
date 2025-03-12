package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("MenuP")
@Data
public class MenuItemPrices {

    @Value("${Menu.dosarate}")
    private Float dosarate;

    @Value("${Menu.Idlyrate}")
    private Float Idlyrate;

    @Value("${Menu.Poharate}")
    private Float Poharate;

    @Value("${Menu.Upmarate}")
    private Float Upmarate;

    @Value("${Menu.PavBhajirate}")
    private Float Pavbhajirate;
}

package com.alkosto.pageObject;

import org.openqa.selenium.By;

public class BusquedaPageObject {

    private static By txtProducto = By.xpath("//h3[@data-id='889842640755']");

    public static By getTxtProducto(){
        return txtProducto;
    }

    BusquedaPageObject(){}
}

package com.example.ecom.Services

import com.example.ecom.Model.Category
import com.example.ecom.Model.Product

object DataService {

    val categories= listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )
    val hats= listOf(
        Product("Devslopes Graphic Beanie","$18","hat01"),
        Product("Devslopes Hat Black","$28","hat02"),
        Product("Devslopes Hat White","$18","hat03"),
        Product("Devslopes Hat Snapback","$58","hat04")
    )
    val hoodies= listOf(
        Product("Devslopes Hoodie Gray","$28","hoodie01"),
        Product("Devslopes Hoodie Red","$27","hoodie02"),
        Product("Devslopes Gray Hoodie","$88","hoodie03"),
        Product("Devslopes Black Hoodie","$29","hoodie04")
    )
    val shirts= listOf(
        Product("Devslopes Shirt Black","$28","shirt01"),
        Product("Devslopes Badge Light Gray","$78","shirt02"),
        Product("Devslopes Logo Shirt Red","$48","shirt03"),
        Product("Devslopes Hustle","$22","shirt04"),
        Product("Devslopes Studios","$18","shirt05")
    )
      

}
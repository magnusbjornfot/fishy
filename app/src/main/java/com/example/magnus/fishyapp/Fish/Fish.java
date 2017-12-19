package com.example.magnus.fishyapp.Fish;

import org.json.JSONObject;

/**
 * vi kanske vill ha testdata i JSON format? Just nu får det hårdkodas :)
 */

/**
 * Created by magnus on 2017-12-19.
 *
 * EN ABSTRAKT KLASS KAN ALDRIG INSTANTIERAS UTAN KRÄVER ETT ARV, DVS FÖRSÖK ALDRIG MED
 *  new Fish() <--- FUNKAR EJ, SE SALMON
 */

public abstract class Fish {

    public String species;
    public String description;
    public String longitude;
    public String latitude;
    public Double length;
    public Double weight; //in kg i assume?
    public Double fultonConstant;
    public Double fultonWeight;

    protected Fish() {

        this.description = "This is sample text for the reason of testing";
        this.longitude = "932993293219321";
        this.latitude = "83281832818932913";
        this.weight = 53.2;
    }

    /**
     * https://en.wikipedia.org/wiki/Standard_weight_in_fish
     * använder denna ^, assuming b = 3
     */

    protected void calculateFultonValue(){
        /**
         * TODO: EXCEPTION DOES NOTHING. IDK WHERE IT OUTPUTS
         */
        try {
                this.fultonWeight = this.fultonConstant * Math.pow(this.length, 3);
        }
        catch (Exception e) {
            System.err.println("Caught Exception: " + e.getMessage() + "DVS FEL I FISH-KLASSEN");
        }
    }

    /**
     * HÄR IMPLEMENTERAS ALLA FUNKTIONER SOM DELAS AV ALLA FISKKLASSER.
     */
}

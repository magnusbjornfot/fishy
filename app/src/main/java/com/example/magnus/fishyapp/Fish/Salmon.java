package com.example.magnus.fishyapp.Fish;

import com.example.magnus.fishyapp.Fish.Fish;

/**
 * Created by magnus on 2017-12-19.
 */

public class Salmon extends Fish {

    public Salmon() {
        super();
        this.fultonConstant = 3.0;
        this.length = 2.0;
        this.species = "Salmon";
        calculateFultonValue();
    }
}

package com.company;

public class Magic extends Hero implements HavingSuperAbility {



    @Override
    public String applySuperAbility(String superAbilityType) {return "Колдует" + superAbilityType;}


}

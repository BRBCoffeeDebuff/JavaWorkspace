package simsource;

public class hitTable {
    private String htColor;
    private double dwMiss;
    private double miss;
    private double hitSuppression;
    private double dodge;
    private double parry;
    private double block;
    private double blockAbsorb;
    private double glancing;
    private double critSuppresion;
    private double spellMiss;

    /***
     * 
     * @param tableColor is either YELLOW Or WHITE depending on attack type
     * @param bossLevel level 80-83 are supported by this sim
     * @param isBehindBoss should be true if you are behind the boss
     * @param isDualWeilding should be ture if you are dual weilding
     */
    public void init(String tableColor, int bossLevel, boolean isBehindBoss, boolean isDualWeilding){
        if (tableColor == "YELLOW"){
            htColor = "YELLOW";
            switch (bossLevel){
                case 80:
                    dwMiss = 0.24;
                    miss = ((isDualWeilding == true)? 0.05 : dwMiss);
                    hitSuppression = 0;
                    dodge = 0.05;
                    parry = ((isBehindBoss == true)? 0 : 0.05);
                    block = ((isBehindBoss == true)? 0 : 0.05);
                    glancing = 0.06;
                    critSuppresion = 0.0;
                    spellMiss = 0.04;
                case 81:
                    dwMiss = 0.245;
                    miss = ((isDualWeilding == true)? 0.055 : dwMiss);
                    hitSuppression = 0;
                    dodge = 0.055;
                    parry = ((isBehindBoss == true)? 0 : 0.055);
                    block = ((isBehindBoss == true)? 0 : 0.05);
                    glancing = 0.12;
                    critSuppresion = 0.01;
                    spellMiss = 0.05;
                case 82:
                    dwMiss = 0.25;
                    miss = ((isDualWeilding == true)? 0.06 : dwMiss);
                    hitSuppression = 0;
                    dodge = 0.06;
                    parry = ((isBehindBoss == true)? 0 : 0.06);
                    block = ((isBehindBoss == true)? 0 : 0.05);
                    glancing = 0.18;
                    critSuppresion = 0.02;
                    spellMiss = 0.06;
                default: // Level 83 boss
                    dwMiss = 0.27;
                    miss = ((isDualWeilding == true)? 0.08 : dwMiss);
                    hitSuppression = 0.01;
                    dodge = 0.065;
                    parry = ((isBehindBoss == true)? 0 : 0.14);
                    block = ((isBehindBoss == true)? 0 : 0.05);
                    glancing = 0.24;
                    critSuppresion = 0.048;
                    spellMiss = 0.17;
            }
        }
        else {
            htColor = "White";
            switch (bossLevel){
                case 80:
                    miss = 0.05;
                    dwMiss = miss;
                    hitSuppression = 0;
                    dodge = 0.05;
                    parry = 0.05;
                    block = 0.05;
                    glancing = 0.06;
                    critSuppresion = 0.0;
                    spellMiss = 0.04;
                case 81:
                    miss = 0.055;
                    dwMiss = miss;
                    hitSuppression = 0;
                    dodge = 0.055;
                    parry = 0.055;
                    block = 0.05;
                    glancing = 0.12;
                    critSuppresion = 0.01;
                    spellMiss = 0.05;
                case 82:
                    miss = 0.06;
                    dwMiss = miss;
                    hitSuppression = 0;
                    dodge = 0.06;
                    parry = 0.06;
                    block = 0.05;
                    glancing = 0.18;
                    critSuppresion = 0.02;
                    spellMiss = 0.06;
                default: // level 83 boss
                    miss = 0.08;
                    dwMiss = miss;
                    hitSuppression = 0.01;
                    dodge = 0.065;
                    parry = 0.14;
                    block = 0.05;
                    glancing = 0.24;
                    critSuppresion = 0.048;
                    spellMiss = 0.17;
            }
        }
    }
    public String getHtColor() {
        return this.htColor;
    }

    public void setHtColor(String htColor) {
        this.htColor = htColor;
    }

    public double getDwMiss() {
        return this.dwMiss;
    }

    public void setDwMiss(double dwMiss) {
        this.dwMiss = dwMiss;
    }

    public double getMiss() {
        return this.miss;
    }

    public void setMiss(double miss) {
        this.miss = miss;
    }

    public double getHitSuppression() {
        return this.hitSuppression;
    }

    public void setHitSuppression(double hitSuppression) {
        this.hitSuppression = hitSuppression;
    }

    public double getDodge() {
        return this.dodge;
    }

    public void setDodge(double dodge) {
        this.dodge = dodge;
    }

    public double getParry() {
        return this.parry;
    }

    public void setParry(double parry) {
        this.parry = parry;
    }

    public double getBlock() {
        return this.block;
    }

    public void setBlock(double block) {
        this.block = block;
    }

    public double getBlockAbsorb() {
        return this.blockAbsorb;
    }

    public void setBlockAbsorb(double blockAbsorb) {
        this.blockAbsorb = blockAbsorb;
    }

    public double getGlancing() {
        return this.glancing;
    }

    public void setGlancing(double glancing) {
        this.glancing = glancing;
    }

    public double getCritSuppresion() {
        return this.critSuppresion;
    }

    public void setCritSuppresion(double critSuppresion) {
        this.critSuppresion = critSuppresion;
    }

    public double getSpellMiss() {
        return this.spellMiss;
    }

    public void setSpellMiss(double spellMiss) {
        this.spellMiss = spellMiss;
    }
    
}

public class Bmi2 {
    private String fristname;
    private String lastname;
    private int bodyHeight;
    private double bodyWeight;
    private char gender;

    public Bmi2(String fristname, String lastname, int bodyHeight, double bodyWeight, char gender) {
        this.fristname = fristname;
        this.lastname = lastname;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
        this.gender = gender;
    }

    public String getFristname() {
        return fristname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public char getGender() {
        return gender;
    }

    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }
    private double round(double value) {
        return Math.round(value * 100) / 100D;
    }

    public double calculateBMI(){
        double bmi = (bodyWeight*1.0)/((bodyHeight*1.0/100)*(bodyHeight*1.0/100));
        return round(bmi);
    }
    public int calculateBMICategory(){
        double bmi = this.calculateBMI();

        switch(gender) {
            case 'W':
                if (bmi < 15.0) {
                    return -2;
                } else if (bmi >= 15.0 && bmi <= 17.4) {
                    return -1;
                } else if (bmi >= 17.5 && bmi <= 23.9) {
                    return 0;
                } else if (bmi >= 24.00 && bmi <= 33.9) {
                    return 1;
                } else if(bmi >=35.0){
                    return 2;
                }
                break;
            case 'M':
                if (bmi < 16.0) {
                    return -2;
                } else if (bmi >= 16.0 && bmi <= 18.4) {
                    return -1;
                } else if (bmi >= 18.5 && bmi <= 24.9) {
                    return 0;
                } else if (bmi >= 25.00 && bmi <= 34.9) {
                    return 1;
                } else if(bmi >=35.0){
                    return 2;
                }
                break;
        }
                return 0;

                }
    public String getBMICategoryName() {
        int cat = calculateBMICategory();
        if(cat == -2){
            return "Sehr starkes Untergewicht";
        }
        else if (cat == -1){
            return "Untergewicht";
        }
        else if (cat ==0){
            return "Normalgewicht";
        }
        else if (cat ==1){
            return "Übergewicht";
        }
        else {
            return "Sehr starkes Übergewicht";
        }


                    }


                }






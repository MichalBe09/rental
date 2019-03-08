package com.company;


    public class RentalOffice {
        String color;
        String type;
        int tireWidth;
        int rentDays;
        double income;


        public RentalOffice (String color, String type, int tireWidth, int rentDays){
            this.color = color;
            this.type = type;
            this.tireWidth = tireWidth;
            this.rentDays = rentDays;
        }

        public double orderBike(){
            double a = rentDays;
            double b;
            double c;
            double d = tireWidth;
            String type1 = type.toLowerCase();
            if (type1.equals("aluminium")){
                b = 2;
            }else if (type1.equals("stalowa")){
                b = 1;
            }else return 0;

            String color1 = color.toLowerCase();
            if (color1.equals("czerwony")){
                c = 500;
            }else if (color1.equals("niebieski")){
                c = 250;
            }else if (color1.equals("zielony")){
                c = 100;
            }else return 0;
            return a*(b*(c+d/3)/20);
        }

        public double totalIncome(){
            double income = orderBike()+orderBike()+orderBike();
            return income;
        }

        public String getFullinfo (){
            return "Roweru o kolorze "+color+", ramie typu "+type+", szerokości opon "+tireWidth+", na "+rentDays+" dni";
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getTireWidth() {
            return tireWidth;
        }

        public void setTireWidth(int tireWidth) {
            this.tireWidth = tireWidth;
        }

        public int getRentDays() {
            return rentDays;
        }

        public void setRentDays(int rentDays) {
            this.rentDays = rentDays;
        }





    }



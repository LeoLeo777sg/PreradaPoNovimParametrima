
    public class Product {
        String productName;
        int barCode;
        double basicPrice;
        double priceAfterTax;
        final double tax=20.0;
        public Product(String productName,int barCode,double basicPrice) {
            this.productName = productName;
            this.barCode = barCode;
            this.basicPrice = basicPrice;
            this.priceAfterTax =priceAfterTax();
        }
        public double priceAfterTax() {
            priceAfterTax=((basicPrice+tax)/100);
            return priceAfterTax;
        }
        public String getInfo(){
            return "Products: "+productName+"\n"+"Basic price of the product is: "
                    +basicPrice+" cents"
                    +",the price after tax is: "+priceAfterTax+" euros"+"\n"
                    +",the barcode for this specific item is: "+barCode;
        }

    }


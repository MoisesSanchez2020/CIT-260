package Week10;

    public class triangle extends GeometricObject {
        //variables
        private double side1 = 1.0;
        private double side2 = 1.0;
        private double side3 = 1.0;
        //default
        public triangle()
        {
        }
        //object
        public triangle(double Side1, double Side2, double Side3, String color, boolean filled)
        {
            super(color,filled);
            this.side1 = Side1;
            this.side2 = Side2;
            this.side3 = Side3;
        }
        //getters
        public double getSide1()
        {
            return side1;
        }
        public double getSide2()
        {
            return side2;
        }
        public double getSide3()
        {
            return side3;
        }
        //setters
        public void setSide1(double side1) {
            this.side1 = side1;
        }
        public void setSide2(double side2) {
            this.side2 = side2;
        }
        public void setSide3(double side3) {
            this.side3 = side3;
        }
        //getArea override from GeometricObject
        @Override
        public double getArea() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
        //getpremitter
        public double getPerimeter()
        {
            return (side1+side2+side3);
        }
        //toString override from GeometricObject
        @Override
        public String toString(){
            return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 +"\n"
                    + super.toString() +"\n";
        }
}

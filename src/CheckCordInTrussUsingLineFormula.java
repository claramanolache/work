public class CheckCordInTrussUsingLineFormula {
    public static boolean in_truss (double x, double y){
        //check right side
        if (x >= 420.035 && x <= 526.226 && y >= 100.316 && y <= 222.934){
            if (below_top_right_triangle(x,y) && above_bottom_right_triangle(x,y) && below_top_right_line(x,y) && above_bottom_right_line(x,y)){
                return true;
            }
        }

        //check left side
        if (x >= 125.024 && x <= 231.215 &&  y <= 222.934 && y >= 100.316){
            if (below_top_left_line(x,y) && above_bottom_left_line(x,y) && above_bottom_left_triangle(x ,y) && below_top_left_triangle(x, y)){
                return true;
            }
        }
        return false;
    }
    public static boolean below_top_left_line (double x, double y){
        return (y-154.47)/(-0.578679661) + 125.024 <= x;
    }
    public static boolean above_bottom_left_line (double x, double y){
        return (y-168.78)/(0.577347065) + 125.024 <= x;
    }
    public static boolean below_top_left_triangle (double x, double y){
        return (y-222.934)/(-.577261357) + 218.822 >= x;
    }
    public static boolean above_bottom_left_triangle (double x, double y){
        return (y-107.47)/(0.577261357) + 231.215 >= x;
    }

    public static boolean below_top_right_triangle (double x, double y){
        return (y-107.47)/(0.577261357) + 231.215 <= x;
    }
    public static boolean below_top_right_line (double x, double y){
        return (y-222.934)/(-0.57734204793) + 432.428 >= x;
    }
    public static boolean above_bottom_right_line (double x, double y){
       return (y-100.316)/(0.577347064969) + 432.428 >= x;
    }
    public static boolean above_bottom_right_triangle (double x, double y){
        return (y-107.47)/(-0.577261357218) + 420.035 <= x;
    }
}

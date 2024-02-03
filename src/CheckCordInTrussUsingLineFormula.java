public class CheckCordInTrussUsingLineFormula {
    public static boolean right_check_Using_lines(double x, double y){
        if (x>125.024 && x<168.78 && 222.934>y && 100.316<y){
            if (below_top_left_line(x,y) && above_bottom_left_line(x,y) && above_bottom_left_triangle(x ,y) && below_top_left_triangle(x, y)){
                return true;
            }
        }
        return false;
    }
    public static boolean left_check_Using_lines(double x, double y){
        if (x > 420.035 && x < 526.226 && y>100.316 && y<222.934){
            if (below_top_right_triangle(x,y) && above_bottom_right_triangle(x,y) && below_top_right_line(x,y) && above_bottom_right_line(x,y)){
                return (true);
            }
        }
        return false;
    }
    public static boolean below_top_left_line (double x, double y){
        double interception_of_line = (y-154.47)/(-0.578679661);
        interception_of_line += 125.024;
        if (interception_of_line<x){
            return true;
        }
        return false;
    }
    public static boolean above_bottom_left_line (double x, double y){
        double interception_of_line = (y-168.78)/(0.577347065);
        interception_of_line += 125.024;
        if (interception_of_line<x){
            return true;
        }
        return false;
    }
    public static boolean below_top_left_triangle (double x, double y){
        double interception_of_line = (y-222.934)/(-.577261357);
        interception_of_line += 218.822;
        if (interception_of_line>x){
            return true;
        }
        return false;
    }
    public static boolean above_bottom_left_triangle (double x, double y){
        double interception_of_line = (y-107.47)/(0.577261357);
        interception_of_line += 231.215;
        if (interception_of_line>x){
            return true;
        }
        return false;
    }

    public static boolean below_top_right_triangle (double x, double y){
        double interception_of_line = (y-107.47)/(0.577261357);
        interception_of_line += 231.215;
        if (interception_of_line<x){
            return true;
        }
        return false;
    }
    public static boolean below_top_right_line (double x, double y){
        double interception_of_line = (y-222.934)/(-0.57734204793);
        interception_of_line += 432.428;
        if (interception_of_line>x){
            return true;
        }
        return false;
    }
    public static boolean above_bottom_right_line (double x, double y){
        double interception_of_line = (y-100.316)/(0.577347064969);
        interception_of_line += 432.428;
        if (interception_of_line>x){
            return true;
        }
        return false;
    }
    public static boolean above_bottom_right_triangle (double x, double y){
        double interception_of_line = (y-107.47)/(-0.577261357218);
        interception_of_line += 420.035;
        if (interception_of_line<x){
            return true;
        }
        return false;
    }
}

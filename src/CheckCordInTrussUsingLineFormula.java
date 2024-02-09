public class CheckCordInTrussUsingLineFormula {
    public static boolean in_truss (double x, double y){
        //check left side
        if (x >= 125.024 && x <= 231.215 &&  y <= 222.934 && y >= 100.316){
            if (below_top_left_line(x,y) && above_bottom_left_line(x,y) && above_bottom_left_triangle(x ,y) && below_top_left_triangle(x, y)){
                return true;
            }
        }

        //check right side
        if (x >= 420.035 && x <= 525.626 && y >= 100.316 && y <= 222.934){
            if (below_top_right_triangle(x,y) && above_bottom_right_triangle(x,y) && below_top_right_line(x,y) && above_bottom_right_line(x,y)){
                return true;
            }
        }
        return false;
    }
    public static boolean robot_in_truss (double x1, double y1,double x2, double y2,double x3, double y3,double x4, double y4){
        return in_truss(x1, y1) || in_truss(x2, y2) || in_truss(x3, y3) || in_truss(x4, y4);
    }
    public static boolean below_top_left_line (double x, double y){
        return (y-168.78)/(54.154/93.798) + 125.024 <= x;
    }
    public static boolean above_bottom_left_line (double x, double y){
        return (y-154.47)/(-54.216/93.69) + 125.024 <= x;
    }
    public static boolean below_top_left_triangle (double x, double y){
        return (y-223.295)/(-7.515/11.826) + 219.389 >= x;
    }
    public static boolean above_bottom_left_triangle (double x, double y){
        return (y-107.47)/(0.577261357) + 231.215 >= x;
    }

    public static boolean below_top_right_triangle (double x, double y){
        return (y-215.78)/(7.154/12.393) + 420.035 <= x;
    }
    public static boolean below_top_right_line (double x, double y){
        return (y-161.625)/(-68.464/117.98) + 538.019 >= x;
    }
    public static boolean above_bottom_right_line (double x, double y){
       return (y-93.161)/(68.464/117.984) + 420.035 >= x;
    }
    public static boolean above_bottom_right_triangle (double x, double y){
        return (y-107.47)/(-0.577261357218) + 420.035 <= x;
    }
}

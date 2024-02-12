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
    public static boolean robot_in_truss (double center_x, double center_y, double side_length, double radi){
        double x1 = rotating_point_x(center_x + side_length/2, center_y + side_length/2, center_x,center_y, radi);
        double x2 = rotating_point_x(center_x - side_length/2, center_y + side_length/2, center_x,center_y, radi);
        double x3 = rotating_point_x(center_x - side_length/2, center_y - side_length/2, center_x,center_y, radi);
        double x4 = rotating_point_x(center_x + side_length/2, center_y - side_length/2, center_x,center_y, radi);

        double y1 = rotating_point_y(center_x + side_length/2, center_y + side_length/2, center_x,center_y, radi);
        double y2 = rotating_point_y(center_x - side_length/2, center_y + side_length/2, center_x,center_y, radi);
        double y3 = rotating_point_y(center_x - side_length/2, center_y - side_length/2, center_x,center_y, radi);
        double y4 = rotating_point_y(center_x + side_length/2, center_y - side_length/2, center_x,center_y, radi);

        return in_truss(x1, y1) || in_truss(x2, y2) || in_truss(x3, y3) || in_truss(x4, y4);
    }
    public static double rotating_point_x (double x, double y, double center_x, double center_y, double rotation){
        return (x - center_x)*Math.cos(rotation) - (y - center_y)*Math.sin(rotation) + center_x;
    }
    public static double rotating_point_y (double x, double y, double center_x, double center_y, double rotation){
        return (x - center_x)*Math.sin(rotation) + (y - center_y)*Math.cos(rotation) + center_y;
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

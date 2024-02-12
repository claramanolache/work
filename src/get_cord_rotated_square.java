public class get_cord_rotated_square {
    public static double og_square (double center_x, double center_y, double side_length, double radi){
        double new_x1 = rotating_point_x(center_x + side_length/2, center_y + side_length/2, center_x,center_y, radi);
        double new_x2 = rotating_point_x(center_x - side_length/2, center_y + side_length/2, center_x,center_y, radi);
        double new_x3 = rotating_point_x(center_x - side_length/2, center_y - side_length/2, center_x,center_y, radi);
        double new_x4 = rotating_point_x(center_x + side_length/2, center_y - side_length/2, center_x,center_y, radi);

        double new_y1 = rotating_point_y(center_x + side_length/2, center_y + side_length/2, center_x,center_y, radi);
        double new_y2 = rotating_point_y(center_x - side_length/2, center_y + side_length/2, center_x,center_y, radi);
        double new_y3 = rotating_point_y(center_x - side_length/2, center_y - side_length/2, center_x,center_y, radi);
        double new_y4 = rotating_point_y(center_x + side_length/2, center_y - side_length/2, center_x,center_y, radi);
        return (0);
    }
    public static double rotating_point_x (double x, double y, double center_x, double center_y, double rotation){
        return (x - center_x)*Math.cos(rotation) - (y - center_y)*Math.sin(rotation) + center_x;
    }
    public static double rotating_point_y (double x, double y, double center_x, double center_y, double rotation){
        return (x - center_x)*Math.sin(rotation) - (y - center_y)*Math.cos(rotation) + center_y;
    }
}

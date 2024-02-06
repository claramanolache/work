import java.lang.Math;
public class CoordinateInTriangle {

    // point is inside point (Z)
    // triangle --> ABC
    public static boolean IsCordInTriangle (double point_x, double point_y, double triangle_pointA_x, double triangle_pointA_y, double triangle_pointB_x, double triangle_pointB_y, double triangle_pointC_x, double triangle_pointC_y){
        //getting areas of all section of triangle + total area to see if is on the inside
        double triangleABZ_area = AreaOfTriangle(point_x, point_y, triangle_pointA_x, triangle_pointA_y, triangle_pointB_x, triangle_pointB_y);
        double triangleBCZ_area = AreaOfTriangle(point_x, point_y, triangle_pointC_x, triangle_pointC_y, triangle_pointB_x, triangle_pointB_y);
        double triangleACZ_area = AreaOfTriangle(point_x, point_y, triangle_pointA_x, triangle_pointA_y, triangle_pointC_x, triangle_pointC_y);
        double big_triangle_area = AreaOfTriangle( triangle_pointA_x, triangle_pointA_y, triangle_pointB_x, triangle_pointB_y, triangle_pointC_x, triangle_pointC_y);
        double sum = triangleACZ_area + triangleABZ_area + triangleBCZ_area;

        //return true if on inside
        if (sum == big_triangle_area){
            return true;
        }
        //checking to see if its on the perimeter
        if (point_on_line(point_x, point_y, triangle_pointA_x, triangle_pointA_y, triangle_pointB_x, triangle_pointB_y)
                || point_on_line(point_x, point_y, triangle_pointA_x, triangle_pointA_y, triangle_pointC_x, triangle_pointC_y)
                || point_on_line(point_x, point_y, triangle_pointB_x, triangle_pointB_y, triangle_pointC_x, triangle_pointC_y)) {
            return true;
        } else{
            return false;
        }

    }
    public static double AreaOfTriangle (double pointA_x, double pointA_y, double pointB_x, double pointB_y, double pointC_x, double pointC_y){
        double area = pointA_x * (pointB_y - pointC_y) + pointB_x * (pointC_y - pointA_y) + pointC_x * (pointA_y - pointB_y);
        area = area/2;
        area = Math.abs(area);
        return(area);
    }

    public static double distance (double x1, double y1, double x2, double y2){
        double dist  = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        dist = Math.sqrt(dist);
        return(dist);
    }
    public static boolean point_on_line (double x, double y, double x1, double y1, double x2, double y2 ){
        //(x, y) is point inside
        // (x1, y1) and (x2, y2) are points on outside
        double sum = distance(x, y, x1, y1) + distance(x, y, x2, y2); //distance of inside from two bounding points
        double total_distance = distance(x1, x2, y1, y2); // outside points distance
        if (sum == total_distance){
            return true;
        } else {
            return false;
        }
    }//IN INCHES///
    public static boolean point_in_left_truss (double x, double y){
        if (IsCordInTriangle(x,y, 231.215, 230.089, 112.631,161.625, 231.215, 93.161)){
            //check middle left
            if(!IsCordInTriangle(x,y, 112.631,161.625,125.024, 154.47,125.024,168.78)){
                //check top triangle
                if(!IsCordInTriangle(x,y,231.215,230.089, 218.822,222.934,231.215, 215.78)){
                    //
                    if(!IsCordInTriangle(x,y, 231.215,107.47, 218.822,100.316, 231.215, 93.161)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean point_in_right_truss (double x, double y){
        return (IsCordInTriangle(x,y, 420.035, 230.089, 538.619,161.625, 420.035, 93.161));
    }

}

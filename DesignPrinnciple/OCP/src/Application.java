public class Application {
    // Returning the total volume of the geometric objects
    public double get_total_volume(Cuboid[] c_geo_objects,
                                   Sphere[] s_geo_objects)
    {
        // Variable used to store total volume
        double vol_sum = 0;

        // Iteratively calculating the volume of each Cuboid
        // and adding it to the total volume

        // Iterating using for each loop to
        // calculate the volume of a cuboid
        for (Cuboid geo_obj : c_geo_objects) {

            vol_sum += geo_obj.length * geo_obj.breadth
                    * geo_obj.height;
        }

        // Iterating using for each loop to
        // calculate the volume of a cuboid
        for (Sphere geo_obj : s_geo_objects) {

            // Iteratively calculating the volume of each
            // Sphere and adding it to the total volume
            vol_sum += (4 / 3) * Math.PI * geo_obj.radius
                    * geo_obj.radius * geo_obj.radius;
        }

        // Returning the to total volume
        return vol_sum;
    }
}

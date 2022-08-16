package triangle;

public class TriangleClassifier {
    public static String getTriangleName(int side1, int side2, int side3) {
        String name = "không phải là tam giác";
        if (side1 < side2 + side3) {
            if (side2 < side3 + side1) {
                if (side3 < side1 + side2) {
                    if (side1 == side2 && side2 == side3) {
                        name = "tam giác đều";
                    } else if (side1 == side2 || side2 == side3)  {
                        name = "tam giác cân";
                    } else {
                        name = "tam giác thường";
                    }
                }
            }
        }
        return name;
    }
}

class circle {

    public void showMessage() {
        System.out.println(
                "Equal chords of a circle subtend equal angles at the centre. /n The radius drawn perpendicular to the chord bisects the chord./n Circles having different radius are similar./n A circle can circumscribe a rectangle, trapezium, triangle, square, kite./n");
    }
}

class child_circle extends circle {

    // Performing overriding
    @Override
    public void showMessage() {
        System.out.println("The circles are said to be congruent if they have equal radii.");
        System.out.println("The diameter of a circle is the longest chord of a circle.");
        System.out.println("Equal chords of a circle subtend equal angles at the centre.");
        System.out.println("The radius drawn perpendicular to the chord bisects the chord.");
        System.out.println("Circles having different radius are similar.");
    }
}

class squar {

    public void showMessage() {
        System.out.println("All four interior angles are equal to 90°");
        System.out.println("All four sides of the square are congruent or equal to each other.");
        System.out.println("The opposite sides of the square are parallel to each other.");
        System.out.println("he diagonals of the square bisect each other at 90°");
        System.out.println("The two diagonals of the square are equal to each other.");
    }
}

class child_squar extends squar {

    // Performing overriding
    @Override
    public void showMessage() {
        System.out.println(
                "A square is a two-dimensional closed shape with 4 equal sides and 4 vertices./n Its opposite sides are parallel to each other./n");
        System.out.println(" We can also think of a square as a rectangle with equal length and breadth.");

        System.out.println("Looking around, you can find many things that resemble the square shape.");
        System.out.println(
                " Common examples of this shape include a chessboard, craft papers, bread slice, photo frame, pizza box, a wall clock, etc.");
    }
}

class rectagle {

    public void showMessage() {
        System.out.println("A rectangle is a quadrilateral.");
        System.out.println("The opposite sides are parallel and equal to each other.");
        System.out.println("Each interior angle is equal to 90 degrees.");
        System.out.println("he sum of all the interior angles is equal to 360 degrees.");
        System.out.println("The diagonals bisect each other.");
        System.out.println("Both the diagonals have the same length.");
    }
}

class child_rectagle extends rectagle {

    // Performing overriding
    @Override
    public void showMessage() {
        System.out.println(
                "Each vertex has angle equal to 90 degrees. /n The opposite sides are equal and parallel./n Diagonal bisect each other.");
    }
}

public class exted {
    public static void main(String[] args) {
        circle c = new child_circle();
        squar s = new child_squar();
        rectagle r = new child_rectagle();
        circle cl = (circle) new child_circle();
        squar l = (squar) new child_squar();
        rectagle rl = (rectagle) new child_rectagle();
        c.showMessage();
        s.showMessage();
        r.showMessage();
        cl.showMessage();
        l.showMessage();
        rl.showMessage();

    }
}

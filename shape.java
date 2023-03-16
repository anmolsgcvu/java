
public class shape {
    public static void main(String[] args) {
        circle c = new child_circle();
        squar s = new child_squar();
        rectagle r = new child_rectagle();
        circle cl = (circle) new child_Circle();
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

package rpm_java;

public class MathUtils {
    public static QuadraticEquationRoots calculateQuadraticEquation(QuadraticEquation education){
        double d = (education.getB()*education.getB())-(4* education.getA()* education.getC());
        if(d<0){
            return new QuadraticEquationRoots(0, 0, 0);
        }
        else if (d==0){
            return new QuadraticEquationRoots((-1*education.getB())/(2* education.getA()),
                    0, 1);
        }
        else {
            return new QuadraticEquationRoots(
                    (-1*education.getB()-Math.sqrt(d))/(2* education.getA()),
                    (-1*education.getB()+Math.sqrt(d))/(2* education.getA()), 2);
        }
    }
}

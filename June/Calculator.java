
package June;


public class Calculator<T extends Number> {
    double add(T a,T b){
    return a.doubleValue()+b.doubleValue();
    }
    double subtract(T a,T b){
    return a.doubleValue()-b.doubleValue();
    }
}

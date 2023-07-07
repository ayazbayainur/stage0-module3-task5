package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        System.out.println((double) toBeDivided / 5);
    }

    public static void main(String[] args){
        var classInstance = new NumberDivider();
        classInstance.divide(19);
    }
}

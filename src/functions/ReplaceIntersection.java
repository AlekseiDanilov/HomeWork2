package functions;

public class ReplaceIntersection {

    public double[] replaceIntersection(double[]... arrays) {
        if (arrays == null) {
            return new double[]{};
        }
        if (arrays.length == 0 || arrays.length == 1) {
            return new double[]{};
        }
        double[] result = replaceIntersectionTwoArrays(arrays[0], arrays[1]);
        for (int i = 0; i < result.length; i++) {
            result = replaceIntersectionTwoArrays(result, arrays[i]);
        }
        return result;
    }

    private double[] replaceIntersectionTwoArrays(double[] arrayA, double[] arrayB) {
        if (minLength(arrayA, arrayB) == 0) {
            return new double[]{};
        }
        int n = minLength(arrayA, arrayB);
        double[] arrayC = new double[n];
        int count = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (contains(arrayB, arrayA[i]) && !contains(arrayC, arrayA[i])) {
                arrayC[count] = arrayA[i];
                count++;
            }
        }
        double[] arrayResult = new double[count];
        for (int i = 0; i < count; i++) {
            arrayResult[i] = arrayC[i];
        }
        return arrayResult;
    }

    private boolean contains(double[] array, double value) {
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - value) < 1e-10) {
                return true;
            }
        }
        return false;
    }

    private int minLength(double[] arrayA, double[] arrayB) {
        if (arrayA == null || arrayB == null) {
            return 0;
        }
        if (arrayA.length < arrayB.length) {
            return arrayA.length;
        }
        return arrayB.length;
    }
}

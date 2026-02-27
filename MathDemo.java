public class MathDemo {

    public static int min(int x, int y) {
        return (x < y) ? x : y;
    }

    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    public static int sum(int[] numbers) {
        int total = 0;
        for (int value : numbers) {
            total += value;
        }
        return total;
    }

    public static float mean(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        return (float) sum(numbers) / numbers.length;
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative not allowed");
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}


//Making these methods static means we can use them without creating a MathDemo object. This is useful for simple math operations because we don’t waste memory on object creation and the methods are quicker to call. Static methods are a good fit here since they don’t rely on any object data. We can just call them directly with the class name, like MathDemo.min(4,7). 
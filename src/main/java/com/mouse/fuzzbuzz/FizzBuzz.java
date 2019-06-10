package com.mouse.fuzzbuzz;

class FizzBuzz {
    String replace(int turn) {
        if (isFizz(turn) && isBuzz(turn)) return "FizzBuzz";
        if (isFizz(turn)) return "Fizz";
        if (isBuzz(turn)) return "Buzz";
        return String.valueOf(turn);
    }

    private boolean isBuzz(int turn) {
        return isDeletableByAndContainN(turn, 5);
    }

    private boolean isFizz(int turn) {
        return isDeletableByAndContainN(turn, 3);
    }

    private boolean isDeletableByAndContainN(int turn, int n) {
        return isDeletableByN(turn, n) || isContainN(turn, n);
    }

    private boolean isContainN(int turn, int n) {
        return turn / 10 == n || turn % 10 == n;
    }

    private boolean isDeletableByN(int turn, int n) {
        return turn % n == 0;
    }
}

package ru.netology.sqr;
public class SqrService {
    public int sqrCalc(int lowerValue, int upperValue) {
        int x=0;
        for (int i = 10; i <= 99; i++) {
            if (i*i>=lowerValue & i*i<=upperValue) {
                x++;
            }
        }
    return x;
    }
}

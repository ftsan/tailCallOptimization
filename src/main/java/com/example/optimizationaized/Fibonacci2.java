package com.example.optimizationaized;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fibonacci2 {

    @Autowired
    TailCallUtil tailCallUtil;
    
    public BigInteger fibonacci(int n) {
        return this.fibonacciTailCall(BigInteger.valueOf(n), ONE, ZERO).call();
    }

    public TailCall<BigInteger> fibonacciTailCall(BigInteger n1, BigInteger n2, BigInteger n3) {
        if (n1.compareTo(ZERO) <= 0) {
            return tailCallUtil.complete(ZERO);
        } else if (n1.compareTo(ONE) == 0) {
            System.out.println("call complete");
            return tailCallUtil.complete(n2);
        }
        return tailCallUtil.nextCall(() -> fibonacciTailCall(n1.subtract(ONE), n2.add(n3), n2));
    }
}

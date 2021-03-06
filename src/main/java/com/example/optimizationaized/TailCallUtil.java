package com.example.optimizationaized;

import org.springframework.stereotype.Component;

@Component
public class TailCallUtil {

    public <T> TailCall<T> nextCall(TailCall<T> function) {
        return function;
    }

    public <T> TailCall<T> complete(T value) {
        return new TailCall<T>() {
            @Override
            public TailCall<T> apply() {
                throw new RuntimeException("Not implemented.");
            }

            @Override
            public boolean isComplete() {
                return true;
            }

            @Override
            public T getResult() {
                return value;
            }
        };
    }
}

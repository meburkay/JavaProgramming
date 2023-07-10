package day53_FunctionalInterface;

@FunctionalInterface
public interface TestInterface<T,S> {

    T apply(S data);
}

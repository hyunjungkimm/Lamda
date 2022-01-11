package lamda.consumer;

@FunctionalInterface
public interface Consumer<T>{
    void accept(T t);
}

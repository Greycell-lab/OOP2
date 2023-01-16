package Aufgabe_2;

public abstract class StringConverter<T> {
    abstract String toString(T obj);
    abstract T fromString(String obj);
}

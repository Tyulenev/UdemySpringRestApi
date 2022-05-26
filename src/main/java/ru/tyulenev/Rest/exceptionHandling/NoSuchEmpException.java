package ru.tyulenev.Rest.exceptionHandling;

public class NoSuchEmpException extends RuntimeException{
    public NoSuchEmpException(String message) {
        super(message);
    }
}

package com.denismiagkov.walletservice.infrastructure.in.servlets.exceptions;

public class IncorrectLoginException extends RuntimeException{
    public IncorrectLoginException() {
        super("Ошибка ввода! Поле 'login' не может быть пустым!");
    }
}
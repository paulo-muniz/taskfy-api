package br.com.paulomuniz.app.core.exceptions;

public class DomainNotFoundException extends RuntimeException {

    public DomainNotFoundException(final String message) {
        super(message);
    }
}

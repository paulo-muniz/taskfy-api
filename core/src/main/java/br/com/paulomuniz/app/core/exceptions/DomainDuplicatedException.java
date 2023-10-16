package br.com.paulomuniz.app.core.exceptions;

public class DomainDuplicatedException extends RuntimeException {

    public DomainDuplicatedException(final String message) {
        super(message);
    }
}

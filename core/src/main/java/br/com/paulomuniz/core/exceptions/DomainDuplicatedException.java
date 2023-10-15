package br.com.paulomuniz.core.exceptions;

public class DomainDuplicatedException extends RuntimeException {

    public DomainDuplicatedException(final String message) {
        super(message);
    }
}

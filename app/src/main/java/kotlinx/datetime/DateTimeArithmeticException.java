package kotlinx.datetime;

import j$.time.DateTimeException;

/* JADX INFO: loaded from: classes3.dex */
public final class DateTimeArithmeticException extends RuntimeException {
    public DateTimeArithmeticException() {
    }

    public DateTimeArithmeticException(DateTimeException dateTimeException) {
        super(dateTimeException);
    }
}

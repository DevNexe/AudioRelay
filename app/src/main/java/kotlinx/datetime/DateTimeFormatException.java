package kotlinx.datetime;

import j$.time.DateTimeException;

/* JADX INFO: loaded from: classes3.dex */
public final class DateTimeFormatException extends IllegalArgumentException {
    public DateTimeFormatException() {
    }

    public DateTimeFormatException(DateTimeException dateTimeException) {
        super(dateTimeException);
    }
}

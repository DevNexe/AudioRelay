package okhttp3.internal.connection;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class RouteException extends RuntimeException {
    public final IOException w;
    public IOException x;

    public RouteException(IOException iOException) {
        super(iOException);
        this.w = iOException;
        this.x = iOException;
    }
}

package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class eq4 extends oj.w {
    public final Socket k;

    public eq4(Socket socket) {
        this.k = socket;
    }

    @Override // oj.w
    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // oj.w
    public final void l() {
        Socket socket = this.k;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!fp1.f0(e)) {
                throw e;
            }
            eu2.a.log(Level.WARNING, ur1.d(socket, "Failed to close timed out socket "), (Throwable) e);
        } catch (Exception e2) {
            eu2.a.log(Level.WARNING, ur1.d(socket, "Failed to close timed out socket "), (Throwable) e2);
        }
    }
}

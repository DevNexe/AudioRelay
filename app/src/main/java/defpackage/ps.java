package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public final class ps {
    public final Socket a;
    public final InputStream b;
    public final OutputStream c;
    public final String d;

    public ps(Socket socket) {
        this.a = socket;
        this.b = socket.getInputStream();
        this.c = socket.getOutputStream();
        this.d = socket.getInetAddress().getHostAddress();
    }
}

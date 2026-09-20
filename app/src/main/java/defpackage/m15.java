package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public final class m15 extends hq4 {
    public final Socket c;
    public final InputStream d;
    public final OutputStream e;

    public m15(Socket socket, InputStream inputStream, OutputStream outputStream, n60.F1 f1) {
        super(f1);
        this.c = socket;
        this.d = inputStream;
        this.e = outputStream;
    }
}

package defpackage;

import com.google.android.gms.internal.ads.zzbeh;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class w36 extends PushbackInputStream {
    public final /* synthetic */ x36 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w36(x36 x36Var, InputStream inputStream) {
        super(inputStream, 1);
        this.w = x36Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        zzbeh.a(this.w.c);
        super.close();
    }
}

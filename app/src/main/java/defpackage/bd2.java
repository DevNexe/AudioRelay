package defpackage;

import java.io.Closeable;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes3.dex */
public final class bd2 implements Closeable {
    public final boolean w;
    public final gg x;
    public final Deflater y;
    public final si0 z;

    public bd2(boolean z) {
        this.w = z;
        gg ggVar = new gg();
        this.x = ggVar;
        Deflater deflater = new Deflater(-1, true);
        this.y = deflater;
        this.z = new si0(ggVar, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.z.close();
    }
}

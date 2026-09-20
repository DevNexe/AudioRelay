package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zp3 implements Closeable {
    public abstract long b();

    public abstract yh c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qf5.d(c());
    }
}

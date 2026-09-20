package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes3.dex */
public interface bm4 extends Closeable, Flushable {
    void V(gg ggVar, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    z75 d();

    void flush();
}

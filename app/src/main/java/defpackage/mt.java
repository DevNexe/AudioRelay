package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class mt implements Closeable, ua0 {
    public final la0 w;

    public mt(la0 la0Var) {
        this.w = la0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AY.j(this.w, null);
    }

    @Override // defpackage.ua0
    public final la0 g() {
        return this.w;
    }
}

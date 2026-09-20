package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class s14 implements dx4 {
    public cf0 w;
    public boolean x;

    @Override // defpackage.dx4
    public final synchronized cx4 U() {
        if (!this.x) {
            c();
            this.x = true;
        }
        throw null;
    }

    public final void b(File file) {
        throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
    }

    public final void c() {
        getDatabaseName();
        throw null;
    }

    @Override // defpackage.dx4, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // defpackage.dx4
    public final String getDatabaseName() {
        throw null;
    }

    @Override // defpackage.dx4
    public final void setWriteAheadLoggingEnabled(boolean z) {
        throw null;
    }
}

package defpackage;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class u61 implements Closeable {
    public final SQLiteProgram w;

    public u61(SQLiteProgram sQLiteProgram) {
        this.w = sQLiteProgram;
    }

    public final void b(int i, byte[] bArr) {
        this.w.bindBlob(i, bArr);
    }

    public final void c(double d, int i) {
        this.w.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.w.close();
    }

    public final void e(int i, long j) {
        this.w.bindLong(i, j);
    }

    public final void f(int i) {
        this.w.bindNull(i);
    }

    public final void g(int i, String str) {
        this.w.bindString(i, str);
    }
}

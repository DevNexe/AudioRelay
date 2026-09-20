package defpackage;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class r52 extends Writer {
    public final StringBuilder x = new StringBuilder(128);
    public final String w = "FragmentManager";

    public final void b() {
        StringBuilder sb = this.x;
        if (sb.length() > 0) {
            Log.d(this.w, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                b();
            } else {
                this.x.append(c);
            }
        }
    }
}

package defpackage;

import java.io.Closeable;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class gd2 implements Closeable {
    public final boolean w;
    public final gg x;
    public final Inflater y;
    public final fk1 z;

    public gd2(boolean z) {
        this.w = z;
        gg ggVar = new gg();
        this.x = ggVar;
        Inflater inflater = new Inflater(true);
        this.y = inflater;
        this.z = new fk1(new aj3(ggVar), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.z.close();
    }
}

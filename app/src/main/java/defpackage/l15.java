package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class l15 {
    public static final long a = fp1.v0("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);
    public static final int b;
    public static final int c;
    public static final long d;
    public static final wj2 e;
    public static final b15 f;
    public static final b15 g;

    static {
        int i = qz4.a;
        if (i < 2) {
            i = 2;
        }
        b = fp1.w0("kotlinx.coroutines.scheduler.core.pool.size", i, 1, 0, 8);
        c = fp1.w0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        d = TimeUnit.SECONDS.toNanos(fp1.v0("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        e = wj2.w;
        f = new b15(0);
        g = new b15(1);
    }
}

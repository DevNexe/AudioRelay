package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class jg0 implements ft {
    public static final jg0 a = new jg0();

    @Override // defpackage.ft
    public final long a() {
        return System.nanoTime();
    }

    @Override // defpackage.ft
    public final long b() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.ft
    public final long c() {
        return SystemClock.elapsedRealtime();
    }
}

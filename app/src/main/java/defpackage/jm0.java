package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class jm0 implements Future<Object> {
    public final vl0 w;

    public jm0(vl0 vl0Var) {
        this.w = vl0Var;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.w.a();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }
}

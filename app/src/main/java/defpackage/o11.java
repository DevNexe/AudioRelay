package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class o11<T, U> extends AtomicInteger implements v11<Object>, mw4 {
    public final sg3<T> w;
    public final AtomicReference<mw4> x = new AtomicReference<>();
    public final AtomicLong y = new AtomicLong();
    public q11.QnHx z;

    public o11(a11 a11Var) {
        this.w = a11Var;
    }

    @Override // defpackage.mw4
    public final void a(long j) {
        qw4.d(this.x, this.y, j);
    }

    @Override // defpackage.gw4
    public final void b() {
        this.z.cancel();
        this.z.E.b();
    }

    @Override // defpackage.mw4
    public final void cancel() {
        qw4.c(this.x);
    }

    @Override // defpackage.v11, defpackage.gw4
    public final void d(mw4 mw4Var) {
        qw4.e(this.x, this.y, mw4Var);
    }

    @Override // defpackage.gw4
    public final void g(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.x.get() != qw4.CANCELLED) {
                this.w.a(this.z);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.gw4
    public final void onError(Throwable th) {
        this.z.cancel();
        this.z.E.onError(th);
    }
}

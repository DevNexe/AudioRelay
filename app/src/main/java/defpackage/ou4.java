package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ou4<T> extends AtomicInteger implements v11<T>, mw4 {
    public volatile boolean B;
    public final gw4<? super T> w;
    public final s x = new s();
    public final AtomicLong y = new AtomicLong();
    public final AtomicReference<mw4> z = new AtomicReference<>();
    public final AtomicBoolean A = new AtomicBoolean();

    public ou4(gw4<? super T> gw4Var) {
        this.w = gw4Var;
    }

    @Override // defpackage.mw4
    public final void a(long j) {
        if (j > 0) {
            qw4.d(this.z, this.y, j);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
    }

    @Override // defpackage.gw4
    public final void b() {
        this.B = true;
        gw4<? super T> gw4Var = this.w;
        s sVar = this.x;
        if (getAndIncrement() == 0) {
            sVar.getClass();
            Throwable thB = uu0.b(sVar);
            if (thB != null) {
                gw4Var.onError(thB);
            } else {
                gw4Var.b();
            }
        }
    }

    @Override // defpackage.mw4
    public final void cancel() {
        if (this.B) {
            return;
        }
        qw4.c(this.z);
    }

    @Override // defpackage.v11, defpackage.gw4
    public final void d(mw4 mw4Var) {
        if (this.A.compareAndSet(false, true)) {
            this.w.d(this);
            qw4.e(this.z, this.y, mw4Var);
        } else {
            mw4Var.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // defpackage.gw4
    public final void g(T t) {
        if (get() == 0 && compareAndSet(0, 1)) {
            gw4<? super T> gw4Var = this.w;
            gw4Var.g(t);
            if (decrementAndGet() != 0) {
                s sVar = this.x;
                sVar.getClass();
                Throwable thB = uu0.b(sVar);
                if (thB != null) {
                    gw4Var.onError(thB);
                } else {
                    gw4Var.b();
                }
            }
        }
    }

    @Override // defpackage.gw4
    public final void onError(Throwable th) {
        this.B = true;
        gw4<? super T> gw4Var = this.w;
        s sVar = this.x;
        sVar.getClass();
        if (!uu0.a(sVar, th)) {
            m14.b(th);
        } else if (getAndIncrement() == 0) {
            gw4Var.onError(uu0.b(sVar));
        }
    }
}

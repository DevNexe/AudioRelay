package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class l75 implements j81<Throwable, sd5> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater z = AtomicIntegerFieldUpdater.newUpdater(l75.class, "_state");
    public final ms1 w;
    public am0 y;
    private volatile /* synthetic */ int _state = 0;
    public final Thread x = Thread.currentThread();

    public l75(ms1 ms1Var) {
        this.w = ms1Var;
    }

    public static void b(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    public final void a() {
        while (true) {
            int i = this._state;
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i);
                        throw null;
                    }
                }
            } else if (z.compareAndSet(this, i, 1)) {
                am0 am0Var = this.y;
                if (am0Var != null) {
                    am0Var.a();
                    return;
                }
                return;
            }
        }
    }

    public final void c() {
        int i;
        this.y = this.w.w(true, true, this);
        do {
            i = this._state;
            if (i != 0) {
                if (i == 2 || i == 3) {
                    return;
                }
                b(i);
                throw null;
            }
        } while (!z.compareAndSet(this, i, 0));
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) {
        int i;
        do {
            i = this._state;
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    b(i);
                    throw null;
                }
            }
            return sd5.a;
        } while (!z.compareAndSet(this, i, 2));
        this.x.interrupt();
        this._state = 3;
        return sd5.a;
    }
}

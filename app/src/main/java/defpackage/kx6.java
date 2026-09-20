package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class kx6 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ AtomicReference x;
    public final /* synthetic */ dy6 y;

    public /* synthetic */ kx6(dy6 dy6Var, AtomicReference atomicReference, int i) {
        this.w = i;
        this.y = dy6Var;
        this.x = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.w) {
            case 0:
                synchronized (this.x) {
                    try {
                        AtomicReference atomicReference = this.x;
                        dq6 dq6Var = this.y.a;
                        atomicReference.set(Boolean.valueOf(dq6Var.g.n(dq6Var.m().j(), lg6.L)));
                        this.x.notify();
                    } catch (Throwable th) {
                        this.x.notify();
                        throw th;
                    }
                }
                return;
            case 1:
                synchronized (this.x) {
                    try {
                        AtomicReference atomicReference2 = this.x;
                        dq6 dq6Var2 = this.y.a;
                        vv5 vv5Var = dq6Var2.g;
                        String strJ = dq6Var2.m().j();
                        jg6 jg6Var = lg6.M;
                        if (strJ == null) {
                            vv5Var.getClass();
                            str = (String) jg6Var.a(null);
                        } else {
                            str = (String) jg6Var.a(vv5Var.c.a(strJ, jg6Var.a));
                        }
                        atomicReference2.set(str);
                        this.x.notify();
                    } catch (Throwable th2) {
                        this.x.notify();
                        throw th2;
                    }
                }
                return;
            default:
                synchronized (this.x) {
                    try {
                        AtomicReference atomicReference3 = this.x;
                        dq6 dq6Var3 = this.y.a;
                        atomicReference3.set(Double.valueOf(dq6Var3.g.g(dq6Var3.m().j(), lg6.P)));
                        this.x.notify();
                    } catch (Throwable th3) {
                        this.x.notify();
                        throw th3;
                    }
                }
                return;
        }
    }
}

package defpackage;

import java.util.ArrayDeque;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class ga7<TResult> {
    public final Object a = new Object();

    @GuardedBy("mLock")
    public ArrayDeque b;

    @GuardedBy("mLock")
    public boolean c;

    public final void a(q97<TResult> q97Var) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(q97Var);
        }
    }

    public final void b(w05<TResult> w05Var) {
        q97 q97Var;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        q97Var = (q97) this.b.poll();
                        if (q97Var == null) {
                            this.c = false;
                            return;
                        }
                    }
                    q97Var.a(w05Var);
                }
            }
        }
    }
}

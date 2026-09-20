package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zt0 implements hw4, tg3 {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public zt0(Executor executor) {
        this.c = executor;
    }

    @Override // defpackage.hw4
    public final synchronized void a() {
        sr5 sr5Var = new Executor() { // from class: sr5
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        };
        r26 r26Var = new au0() { // from class: r26
            @Override // defpackage.au0
            public final void a(xt0 xt0Var) {
                xt0Var.getClass();
                throw null;
            }
        };
        synchronized (this) {
            if (!this.a.containsKey(qe0.class)) {
                this.a.put(qe0.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(qe0.class)).put(r26Var, sr5Var);
        }
    }
}

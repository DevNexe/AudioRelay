package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class i74 {
    public final AtomicLong a = new AtomicLong();
    public final LinkedBlockingQueue<ck4> b = new LinkedBlockingQueue<>();

    public final void a(ck4 ck4Var) {
        if (this.b.add(ck4Var)) {
            this.a.addAndGet(ck4Var.b);
        }
    }
}

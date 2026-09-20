package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class jj3 {
    public final long b;
    public final g15 c;
    public final int a = 5;
    public final ij3 d = new ij3(this, ur1.d(" ConnectionPool", qf5.f));
    public final ConcurrentLinkedQueue<ej3> e = new ConcurrentLinkedQueue<>();

    public jj3(h15 h15Var, TimeUnit timeUnit) {
        this.b = timeUnit.toNanos(5L);
        this.c = h15Var.f();
    }

    public final boolean a(COm6Fixed cOm6, bj3 bj3Var, ArrayList arrayList, boolean z) {
        Iterator<ej3> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            ej3 next = it.next();
            synchronized (next) {
                if (z) {
                    if (!(next.g != null)) {
                    }
                    sd5 sd5Var = sd5.a;
                }
                if (next.h(cOm6, arrayList)) {
                    bj3Var.c(next);
                    return true;
                }
                sd5 sd5Var2 = sd5.a;
            }
        }
    }

    public final int b(ej3 ej3Var, long j) {
        byte[] bArr = qf5.a;
        ArrayList arrayList = ej3Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + ej3Var.b.a.i + " was leaked. Did you forget to close a response body?";
                x43 x43Var = x43.a;
                x43.a.j(((bj3.CQf) reference).a, str);
                arrayList.remove(i);
                ej3Var.j = true;
                if (arrayList.isEmpty()) {
                    ej3Var.q = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}

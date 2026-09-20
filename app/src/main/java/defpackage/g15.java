package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class g15 {
    public final h15 a;
    public final String b;
    public boolean c;
    public v05 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public g15(h15 h15Var, String str) {
        this.a = h15Var;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = qf5.a;
        synchronized (this.a) {
            if (b()) {
                this.a.e(this);
            }
            sd5 sd5Var = sd5.a;
        }
    }

    public final boolean b() {
        v05 v05Var = this.d;
        if (v05Var != null && v05Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size() - 1;
        boolean z = false;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (((v05) arrayList.get(size)).b) {
                    v05 v05Var2 = (v05) arrayList.get(size);
                    h15.CQf cQf = h15.h;
                    if (h15.j.isLoggable(Level.FINE)) {
                        AY.i(v05Var2, this, "canceled");
                    }
                    arrayList.remove(size);
                    z = true;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return z;
    }

    public final void c(v05 v05Var, long j) {
        synchronized (this.a) {
            if (!this.c) {
                if (d(v05Var, j, false)) {
                    this.a.e(this);
                }
                sd5 sd5Var = sd5.a;
            } else if (v05Var.b) {
                h15.h.getClass();
                if (h15.j.isLoggable(Level.FINE)) {
                    AY.i(v05Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                h15.h.getClass();
                if (h15.j.isLoggable(Level.FINE)) {
                    AY.i(v05Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(v05 v05Var, long j, boolean z) {
        g15 g15Var = v05Var.c;
        if (g15Var != this) {
            if (!(g15Var == null)) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            v05Var.c = this;
        }
        long jA = this.a.a.a();
        long j2 = jA + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(v05Var);
        if (iIndexOf != -1) {
            if (v05Var.d <= j2) {
                h15.CQf cQf = h15.h;
                if (h15.j.isLoggable(Level.FINE)) {
                    AY.i(v05Var, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        v05Var.d = j2;
        h15.CQf cQf2 = h15.h;
        if (h15.j.isLoggable(Level.FINE)) {
            AY.i(v05Var, this, z ? ur1.d(AY.w(j2 - jA), "run again after ") : ur1.d(AY.w(j2 - jA), "scheduled after "));
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((v05) it.next()).d - jA > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = arrayList.size();
        }
        arrayList.add(size, v05Var);
        return size == 0;
    }

    public final void e() {
        byte[] bArr = qf5.a;
        synchronized (this.a) {
            this.c = true;
            if (b()) {
                this.a.e(this);
            }
            sd5 sd5Var = sd5.a;
        }
    }

    public final String toString() {
        return this.b;
    }
}

package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class h40 implements vl0, wl0 {
    public hv2<vl0> w;
    public volatile boolean x;

    public static void g(hv2 hv2Var) {
        if (hv2Var == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : hv2Var.d) {
            if (obj instanceof vl0) {
                try {
                    ((vl0) obj).a();
                } catch (Throwable th) {
                    XTd3.w(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw uu0.d((Throwable) arrayList.get(0));
        }
    }

    @Override // defpackage.vl0
    public final void a() {
        if (this.x) {
            return;
        }
        synchronized (this) {
            if (this.x) {
                return;
            }
            this.x = true;
            hv2<vl0> hv2Var = this.w;
            this.w = null;
            g(hv2Var);
        }
    }

    @Override // defpackage.wl0
    public final boolean b(vl0 vl0Var) {
        if (vl0Var == null) {
            throw new NullPointerException("disposable is null");
        }
        if (!this.x) {
            synchronized (this) {
                if (!this.x) {
                    hv2<vl0> hv2Var = this.w;
                    if (hv2Var == null) {
                        hv2Var = new hv2<>();
                        this.w = hv2Var;
                    }
                    hv2Var.a(vl0Var);
                    return true;
                }
            }
        }
        vl0Var.a();
        return false;
    }

    @Override // defpackage.wl0
    public final boolean c(vl0 vl0Var) {
        if (!d(vl0Var)) {
            return false;
        }
        vl0Var.a();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b A[Catch: all -> 0x004f, DONT_GENERATE, TryCatch #0 {, blocks: (B:8:0x000b, B:10:0x000f, B:12:0x0011, B:14:0x0015, B:29:0x004b, B:17:0x002c, B:19:0x0032, B:20:0x0036, B:23:0x003e, B:25:0x0044, B:31:0x004d), top: B:38:0x000b }] */
    @Override // defpackage.wl0
    public final boolean d(vl0 vl0Var) {
        boolean z;
        if (vl0Var == null) {
            throw new NullPointerException("disposables is null");
        }
        if (this.x) {
            return false;
        }
        synchronized (this) {
            if (this.x) {
                return false;
            }
            hv2<vl0> hv2Var = this.w;
            if (hv2Var != null) {
                vl0[] vl0VarArr = hv2Var.d;
                int i = hv2Var.a;
                int iHashCode = vl0Var.hashCode() * (-1640531527);
                int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                vl0 vl0Var2 = vl0VarArr[i2];
                if (vl0Var2 != null) {
                    if (vl0Var2.equals(vl0Var)) {
                        hv2Var.b(i2, i, vl0VarArr);
                    } else {
                        while (true) {
                            i2 = (i2 + 1) & i;
                            vl0 vl0Var3 = vl0VarArr[i2];
                            if (vl0Var3 != null) {
                                if (vl0Var3.equals(vl0Var)) {
                                    hv2Var.b(i2, i, vl0VarArr);
                                }
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                        return true;
                    }
                }
                z = false;
                if (!z) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // defpackage.vl0
    public final boolean e() {
        return this.x;
    }

    public final void f() {
        if (this.x) {
            return;
        }
        synchronized (this) {
            if (this.x) {
                return;
            }
            hv2<vl0> hv2Var = this.w;
            this.w = null;
            g(hv2Var);
        }
    }
}

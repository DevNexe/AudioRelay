package defpackage;

import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnn;
import com.google.android.gms.internal.ads.zzgoz;
import com.google.android.gms.internal.ads.zzgri;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hv6 {
    public abstract int a(Object obj);

    public abstract int b(Object obj);

    public abstract zzgri c(Object obj);

    public abstract zzgri d(Object obj);

    public abstract Object e(Object obj, Object obj2);

    public abstract zzgri f();

    public abstract Object g(Object obj);

    public abstract void h(int i, int i2, Object obj);

    public abstract void i(Object obj, long j, int i);

    public abstract void j(int i, Object obj, Object obj2);

    public abstract void k(Object obj, int i, zzgnf zzgnfVar);

    public abstract void l(Object obj, long j, int i);

    public abstract void m(Object obj);

    public abstract void n(Object obj, Object obj2);

    public abstract void o(Object obj, Object obj2);

    public final boolean p(Object obj, lt6 lt6Var) throws zzgoz {
        int i = lt6Var.b;
        int i2 = i >>> 3;
        int i3 = i & 7;
        zzgnn zzgnnVar = lt6Var.a;
        if (i3 == 0) {
            lt6Var.q(0);
            l(obj, zzgnnVar.zzp(), i2);
            return true;
        }
        if (i3 == 1) {
            lt6Var.q(1);
            i(obj, zzgnnVar.zzo(), i2);
            return true;
        }
        if (i3 == 2) {
            k(obj, i2, lt6Var.u());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzgoz.a();
            }
            lt6Var.q(5);
            h(i2, zzgnnVar.zzg(), obj);
            return true;
        }
        zzgri zzgriVarF = f();
        int i4 = (i2 << 3) | 4;
        while (lt6Var.t() != Integer.MAX_VALUE && p(zzgriVarF, lt6Var)) {
        }
        if (i4 != lt6Var.b) {
            throw new zzgoz("Protocol message end-group tag did not match expected tag.");
        }
        g(zzgriVarF);
        j(i2, obj, zzgriVarF);
        return true;
    }

    public abstract void q();

    public abstract void r(Object obj, ot6 ot6Var);
}

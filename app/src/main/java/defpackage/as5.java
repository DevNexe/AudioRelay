package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class as5 extends hd6 {
    public final dq6 a;
    public final dy6 b;

    public as5(dq6 dq6Var) {
        oa3.h(dq6Var);
        this.a = dq6Var;
        dy6 dy6Var = dq6Var.p;
        dq6.g(dy6Var);
        this.b = dy6Var;
    }

    @Override // defpackage.fy6
    public final List a(String str, String str2) {
        dy6 dy6Var = this.b;
        dq6 dq6Var = dy6Var.a;
        ro6 ro6Var = dq6Var.j;
        dq6.h(ro6Var);
        boolean zO = ro6Var.o();
        bi6 bi6Var = dq6Var.i;
        if (zO) {
            dq6.h(bi6Var);
            bi6Var.f.b("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (sy4.d()) {
            dq6.h(bi6Var);
            bi6Var.f.b("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        ro6 ro6Var2 = dq6Var.j;
        dq6.h(ro6Var2);
        ro6Var2.j(atomicReference, 5000L, "get conditional user properties", new ix6(dy6Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return m37.o(list);
        }
        dq6.h(bi6Var);
        bi6Var.f.c(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // defpackage.fy6
    public final void b(Bundle bundle, String str, String str2) {
        dy6 dy6Var = this.a.p;
        dq6.g(dy6Var);
        dy6Var.i(bundle, str, str2);
    }

    @Override // defpackage.fy6
    public final Map c(String str, String str2, boolean z) {
        dy6 dy6Var = this.b;
        dq6 dq6Var = dy6Var.a;
        ro6 ro6Var = dq6Var.j;
        dq6.h(ro6Var);
        boolean zO = ro6Var.o();
        bi6 bi6Var = dq6Var.i;
        if (zO) {
            dq6.h(bi6Var);
            bi6Var.f.b("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (sy4.d()) {
            dq6.h(bi6Var);
            bi6Var.f.b("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        ro6 ro6Var2 = dq6Var.j;
        dq6.h(ro6Var2);
        ro6Var2.j(atomicReference, 5000L, "get user properties", new mx6(dy6Var, atomicReference, str, str2, z));
        List<d37> list = (List) atomicReference.get();
        if (list == null) {
            dq6.h(bi6Var);
            bi6Var.f.c(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.emptyMap();
        }
        Bt7j bt7j = new Bt7j(list.size());
        for (d37 d37Var : list) {
            Object objB = d37Var.b();
            if (objB != null) {
                bt7j.put(d37Var.x, objB);
            }
        }
        return bt7j;
    }

    @Override // defpackage.fy6
    public final void d(Bundle bundle) {
        dy6 dy6Var = this.b;
        dy6Var.a.n.getClass();
        dy6Var.p(bundle, System.currentTimeMillis());
    }

    @Override // defpackage.fy6
    public final void e(Bundle bundle, String str, String str2) {
        dy6 dy6Var = this.b;
        dy6Var.a.n.getClass();
        dy6Var.k(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // defpackage.fy6
    public final int zza(String str) {
        dy6 dy6Var = this.b;
        dy6Var.getClass();
        oa3.e(str);
        dy6Var.a.getClass();
        return 25;
    }

    @Override // defpackage.fy6
    public final long zzb() {
        m37 m37Var = this.a.l;
        dq6.f(m37Var);
        return m37Var.g0();
    }

    @Override // defpackage.fy6
    public final String zzh() {
        return this.b.x();
    }

    @Override // defpackage.fy6
    public final String zzi() {
        dz6 dz6Var = this.b.a.o;
        dq6.g(dz6Var);
        qy6 qy6Var = dz6Var.c;
        if (qy6Var != null) {
            return qy6Var.b;
        }
        return null;
    }

    @Override // defpackage.fy6
    public final String zzj() {
        dz6 dz6Var = this.b.a.o;
        dq6.g(dz6Var);
        qy6 qy6Var = dz6Var.c;
        if (qy6Var != null) {
            return qy6Var.a;
        }
        return null;
    }

    @Override // defpackage.fy6
    public final String zzk() {
        return this.b.x();
    }

    @Override // defpackage.fy6
    public final void zzp(String str) {
        dq6 dq6Var = this.a;
        id6 id6VarJ = dq6Var.j();
        dq6Var.n.getClass();
        id6VarJ.f(str, SystemClock.elapsedRealtime());
    }

    @Override // defpackage.fy6
    public final void zzr(String str) {
        dq6 dq6Var = this.a;
        id6 id6VarJ = dq6Var.j();
        dq6Var.n.getClass();
        id6VarJ.g(str, SystemClock.elapsedRealtime());
    }
}

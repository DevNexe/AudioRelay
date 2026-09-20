package com.google.android.gms.internal.measurement;

import defpackage.at6;
import defpackage.l07;
import defpackage.m47;
import defpackage.n47;
import defpackage.q37;
import defpackage.r07;
import defpackage.y37;
import defpackage.z37;

/* JADX INFO: loaded from: classes3.dex */
public final class z2n implements y37 {
    public final q37 a;
    public final m47 b;
    public final boolean c;
    public final r07 d;

    public z2n(m47 m47Var, r07 r07Var, q37 q37Var) {
        this.b = m47Var;
        this.c = r07Var.c(q37Var);
        this.d = r07Var;
        this.a = q37Var;
    }

    @Override // defpackage.y37
    public final boolean a(Object obj) {
        this.d.a(obj);
        throw null;
    }

    @Override // defpackage.y37
    public final void b(Object obj, Object obj2) {
        Class cls = z37.a;
        m47 m47Var = this.b;
        m47Var.h(obj, m47Var.d(m47Var.c(obj), m47Var.c(obj2)));
        if (this.c) {
            this.d.a(obj2);
            throw null;
        }
    }

    @Override // defpackage.y37
    public final boolean c(Object obj, Object obj2) {
        m47 m47Var = this.b;
        if (!m47Var.c(obj).equals(m47Var.c(obj2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        r07 r07Var = this.d;
        r07Var.a(obj);
        r07Var.a(obj2);
        throw null;
    }

    @Override // defpackage.y37
    public final void d(Object obj, byte[] bArr, int i, int i2, at6 at6Var) {
        vDR vdr = (vDR) obj;
        if (vdr.zzc == n47.f) {
            vdr.zzc = n47.b();
        }
        throw null;
    }

    @Override // defpackage.y37
    public final void e(Object obj, l07 l07Var) {
        this.d.a(obj);
        throw null;
    }

    @Override // defpackage.y37
    public final int zza(Object obj) {
        m47 m47Var = this.b;
        int iB = m47Var.b(m47Var.c(obj));
        if (!this.c) {
            return iB;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // defpackage.y37
    public final int zzb(Object obj) {
        int iHashCode = this.b.c(obj).hashCode();
        if (!this.c) {
            return iHashCode;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // defpackage.y37
    public final Object zze() {
        return this.a.d().o();
    }

    @Override // defpackage.y37
    public final void zzf(Object obj) {
        this.b.g(obj);
        this.d.b(obj);
    }
}

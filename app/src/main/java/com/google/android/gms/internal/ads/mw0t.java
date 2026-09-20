package com.google.android.gms.internal.ads;

import defpackage.at6;
import defpackage.hv6;
import defpackage.lt6;
import defpackage.ot6;
import defpackage.st6;
import defpackage.wu6;
import defpackage.xu6;

/* JADX INFO: loaded from: classes3.dex */
public final class mw0t implements wu6 {
    public final zzgpx a;
    public final hv6 b;
    public final boolean c;
    public final st6 d;

    public mw0t(hv6 hv6Var, st6 st6Var, zzgpx zzgpxVar) {
        this.b = hv6Var;
        this.c = st6Var.h(zzgpxVar);
        this.d = st6Var;
        this.a = zzgpxVar;
    }

    @Override // defpackage.wu6
    public final boolean a(Object obj) {
        this.d.a(obj);
        throw null;
    }

    @Override // defpackage.wu6
    public final void b(Object obj, Object obj2) {
        Class cls = xu6.a;
        hv6 hv6Var = this.b;
        hv6Var.o(obj, hv6Var.e(hv6Var.d(obj), hv6Var.d(obj2)));
        if (this.c) {
            this.d.a(obj2);
            throw null;
        }
    }

    @Override // defpackage.wu6
    public final boolean c(Object obj, Object obj2) {
        hv6 hv6Var = this.b;
        if (!hv6Var.d(obj).equals(hv6Var.d(obj2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        st6 st6Var = this.d;
        st6Var.a(obj);
        st6Var.a(obj2);
        throw null;
    }

    @Override // defpackage.wu6
    public final void d(Object obj, ot6 ot6Var) {
        this.d.a(obj);
        throw null;
    }

    @Override // defpackage.wu6
    public final void e(Object obj, byte[] bArr, int i, int i2, at6 at6Var) {
        zzgon zzgonVar = (zzgon) obj;
        if (zzgonVar.zzc == zzgri.zzc()) {
            zzgonVar.zzc = zzgri.a();
        }
        throw null;
    }

    @Override // defpackage.wu6
    public final void f(Object obj, lt6 lt6Var, zzgnz zzgnzVar) {
        boolean zP;
        int i;
        int i2;
        hv6 hv6Var = this.b;
        zzgri zzgriVarC = hv6Var.c(obj);
        st6 st6Var = this.d;
        st6Var.b(obj);
        while (lt6Var.t() != Integer.MAX_VALUE) {
            try {
                int i3 = lt6Var.b;
                boolean zZzE = false;
                zzgnn zzgnnVar = lt6Var.a;
                zzgpx zzgpxVar = this.a;
                if (i3 != 11) {
                    if ((i3 & 7) != 2) {
                        if (!zzgnnVar.zzC() && (i = lt6Var.b) != lt6Var.c) {
                            zZzE = zzgnnVar.zzE(i);
                        }
                        zP = zZzE;
                    } else if (st6Var.c(zzgnzVar, zzgpxVar, i3 >>> 3) != null) {
                        st6Var.f();
                    } else {
                        zP = hv6Var.p(zzgriVarC, lt6Var);
                    }
                    if (!zP) {
                        hv6Var.n(obj, zzgriVarC);
                        return;
                    }
                } else {
                    zzgol zzgolVarC = null;
                    zzgnf zzgnfVarU = null;
                    int iZzn = 0;
                    while (lt6Var.t() != Integer.MAX_VALUE) {
                        int i4 = lt6Var.b;
                        if (i4 == 16) {
                            lt6Var.q(0);
                            iZzn = zzgnnVar.zzn();
                            zzgolVarC = st6Var.c(zzgnzVar, zzgpxVar, iZzn);
                        } else if (i4 != 26) {
                            if (!((zzgnnVar.zzC() || (i2 = lt6Var.b) == lt6Var.c) ? false : zzgnnVar.zzE(i2))) {
                                break;
                            }
                        } else if (zzgolVarC != null) {
                            st6Var.f();
                        } else {
                            zzgnfVarU = lt6Var.u();
                        }
                    }
                    if (lt6Var.b != 12) {
                        throw new zzgoz("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzgnfVarU != null) {
                        if (zzgolVarC != null) {
                            st6Var.g();
                        } else {
                            hv6Var.k(zzgriVarC, iZzn, zzgnfVarU);
                        }
                    }
                }
            } catch (Throwable th) {
                hv6Var.n(obj, zzgriVarC);
                throw th;
            }
        }
        hv6Var.n(obj, zzgriVarC);
    }

    @Override // defpackage.wu6
    public final int zza(Object obj) {
        hv6 hv6Var = this.b;
        int iB = hv6Var.b(hv6Var.d(obj));
        if (!this.c) {
            return iB;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // defpackage.wu6
    public final int zzb(Object obj) {
        int iHashCode = this.b.d(obj).hashCode();
        if (!this.c) {
            return iHashCode;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // defpackage.wu6
    public final Object zze() {
        return this.a.zzaL().zzan();
    }

    @Override // defpackage.wu6
    public final void zzf(Object obj) {
        this.b.m(obj);
        this.d.e(obj);
    }
}

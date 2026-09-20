package com.google.android.gms.internal.ads;

import defpackage.hv6;
import defpackage.ot6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class DzVS extends hv6 {
    @Override // defpackage.hv6
    public final /* synthetic */ int a(Object obj) {
        return ((zzgri) obj).zza();
    }

    @Override // defpackage.hv6
    public final /* synthetic */ int b(Object obj) {
        return ((zzgri) obj).zzb();
    }

    @Override // defpackage.hv6
    public final /* bridge */ /* synthetic */ zzgri c(Object obj) {
        zzgon zzgonVar = (zzgon) obj;
        zzgri zzgriVar = zzgonVar.zzc;
        if (zzgriVar != zzgri.zzc()) {
            return zzgriVar;
        }
        zzgri zzgriVarA = zzgri.a();
        zzgonVar.zzc = zzgriVarA;
        return zzgriVarA;
    }

    @Override // defpackage.hv6
    public final /* synthetic */ zzgri d(Object obj) {
        return ((zzgon) obj).zzc;
    }

    @Override // defpackage.hv6
    public final Object e(Object obj, Object obj2) {
        zzgri zzgriVar = (zzgri) obj2;
        if (zzgriVar.equals(zzgri.zzc())) {
            return obj;
        }
        zzgri zzgriVar2 = (zzgri) obj;
        int i = zzgriVar2.a + zzgriVar.a;
        int[] iArrCopyOf = Arrays.copyOf(zzgriVar2.b, i);
        System.arraycopy(zzgriVar.b, 0, iArrCopyOf, zzgriVar2.a, zzgriVar.a);
        Object[] objArrCopyOf = Arrays.copyOf(zzgriVar2.c, i);
        System.arraycopy(zzgriVar.c, 0, objArrCopyOf, zzgriVar2.a, zzgriVar.a);
        return new zzgri(i, iArrCopyOf, objArrCopyOf, true);
    }

    @Override // defpackage.hv6
    public final /* synthetic */ zzgri f() {
        return zzgri.a();
    }

    @Override // defpackage.hv6
    public final /* synthetic */ Object g(Object obj) {
        ((zzgri) obj).zzf();
        return obj;
    }

    @Override // defpackage.hv6
    public final /* bridge */ /* synthetic */ void h(int i, int i2, Object obj) {
        ((zzgri) obj).b((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // defpackage.hv6
    public final /* bridge */ /* synthetic */ void i(Object obj, long j, int i) {
        ((zzgri) obj).b((i << 3) | 1, Long.valueOf(j));
    }

    @Override // defpackage.hv6
    public final /* bridge */ /* synthetic */ void j(int i, Object obj, Object obj2) {
        ((zzgri) obj).b((i << 3) | 3, obj2);
    }

    @Override // defpackage.hv6
    public final /* bridge */ /* synthetic */ void k(Object obj, int i, zzgnf zzgnfVar) {
        ((zzgri) obj).b((i << 3) | 2, zzgnfVar);
    }

    @Override // defpackage.hv6
    public final /* bridge */ /* synthetic */ void l(Object obj, long j, int i) {
        ((zzgri) obj).b(i << 3, Long.valueOf(j));
    }

    @Override // defpackage.hv6
    public final void m(Object obj) {
        ((zzgon) obj).zzc.zzf();
    }

    @Override // defpackage.hv6
    public final /* synthetic */ void n(Object obj, Object obj2) {
        ((zzgon) obj).zzc = (zzgri) obj2;
    }

    @Override // defpackage.hv6
    public final /* synthetic */ void o(Object obj, Object obj2) {
        ((zzgon) obj).zzc = (zzgri) obj2;
    }

    @Override // defpackage.hv6
    public final void q() {
    }

    @Override // defpackage.hv6
    public final /* synthetic */ void r(Object obj, ot6 ot6Var) {
        ((zzgri) obj).zzi(ot6Var);
    }
}

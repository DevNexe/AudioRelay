package com.google.android.gms.internal.measurement;

import defpackage.a07;
import defpackage.j07;
import defpackage.l07;
import defpackage.m47;
import defpackage.n47;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class tN extends m47 {
    @Override // defpackage.m47
    public final /* synthetic */ int a(Object obj) {
        return ((n47) obj).a();
    }

    @Override // defpackage.m47
    public final int b(Object obj) {
        n47 n47Var = (n47) obj;
        int i = n47Var.d;
        if (i != -1) {
            return i;
        }
        int iE = 0;
        for (int i2 = 0; i2 < n47Var.a; i2++) {
            int i3 = n47Var.b[i2];
            a07 a07Var = (a07) n47Var.c[i2];
            int iE2 = j07.e(8);
            int iC = a07Var.c();
            iE += j07.e(iC) + iC + j07.e(24) + j07.e(i3 >>> 3) + j07.e(16) + iE2 + iE2;
        }
        n47Var.d = iE;
        return iE;
    }

    @Override // defpackage.m47
    public final /* synthetic */ n47 c(Object obj) {
        return ((vDR) obj).zzc;
    }

    @Override // defpackage.m47
    public final Object d(Object obj, Object obj2) {
        n47 n47Var = (n47) obj2;
        if (n47Var.equals(n47.f)) {
            return obj;
        }
        n47 n47Var2 = (n47) obj;
        int i = n47Var2.a + n47Var.a;
        int[] iArrCopyOf = Arrays.copyOf(n47Var2.b, i);
        System.arraycopy(n47Var.b, 0, iArrCopyOf, n47Var2.a, n47Var.a);
        Object[] objArrCopyOf = Arrays.copyOf(n47Var2.c, i);
        System.arraycopy(n47Var.c, 0, objArrCopyOf, n47Var2.a, n47Var.a);
        return new n47(i, iArrCopyOf, objArrCopyOf, true);
    }

    @Override // defpackage.m47
    public final /* synthetic */ n47 e() {
        return n47.b();
    }

    @Override // defpackage.m47
    public final /* bridge */ /* synthetic */ void f(Object obj, long j, int i) {
        ((n47) obj).c(i << 3, Long.valueOf(j));
    }

    @Override // defpackage.m47
    public final void g(Object obj) {
        ((vDR) obj).zzc.e = false;
    }

    @Override // defpackage.m47
    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((vDR) obj).zzc = (n47) obj2;
    }

    @Override // defpackage.m47
    public final /* synthetic */ void i(Object obj, l07 l07Var) {
        ((n47) obj).d(l07Var);
    }
}

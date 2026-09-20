package com.google.android.gms.internal.measurement;

import defpackage.d27;
import defpackage.lq6;
import defpackage.r37;
import defpackage.w37;
import defpackage.x37;

/* JADX INFO: loaded from: classes3.dex */
public final class ck32 extends vDR implements r37 {
    private static final ck32 zza;
    private d27 zze = w37.z;

    static {
        ck32 ck32Var = new ck32();
        zza = ck32Var;
        vDR.m(ck32.class, ck32Var);
    }

    public static lq6 r() {
        return (lq6) zza.n();
    }

    public static /* synthetic */ void v(ck32 ck32Var, SjP sjP) {
        d27 d27Var = ck32Var.zze;
        if (!d27Var.zzc()) {
            ck32Var.zze = vDR.k(d27Var);
        }
        ck32Var.zze.add(sjP);
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", SjP.class});
        }
        if (i2 == 3) {
            return new ck32();
        }
        if (i2 == 4) {
            return new lq6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final SjP t() {
        return (SjP) this.zze.get(0);
    }

    public final d27 u() {
        return this.zze;
    }
}

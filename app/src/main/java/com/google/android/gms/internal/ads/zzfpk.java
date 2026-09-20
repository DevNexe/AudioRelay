package com.google.android.gms.internal.ads;

import defpackage.ku2;
import defpackage.w05;
import defpackage.yl6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfpk {
    public static zzfyx zza(w05 w05Var) {
        final yl6 yl6Var = new yl6(w05Var);
        w05Var.b(zzfze.zzb(), new ku2() { // from class: com.google.android.gms.internal.ads.zzfpi
            @Override // defpackage.ku2
            public final void onComplete(w05 w05Var2) {
                yl6 yl6Var2 = yl6Var;
                if (w05Var2.l()) {
                    yl6Var2.cancel(false);
                    return;
                }
                if (w05Var2.n()) {
                    yl6Var2.zzd(w05Var2.k());
                    return;
                }
                Exception excJ = w05Var2.j();
                if (excJ == null) {
                    throw new IllegalStateException();
                }
                yl6Var2.zze(excJ);
            }
        });
        return yl6Var;
    }
}

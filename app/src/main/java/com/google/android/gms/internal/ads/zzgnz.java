package com.google.android.gms.internal.ads;

import defpackage.qt6;
import defpackage.wt6;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgnz {
    public static volatile zzgnz b;
    public static volatile zzgnz c;
    public static final zzgnz d = new zzgnz(0);
    public final Map a;

    public zzgnz() {
        this.a = new HashMap();
    }

    public static zzgnz zza() {
        zzgnz zzgnzVar = b;
        if (zzgnzVar == null) {
            synchronized (zzgnz.class) {
                zzgnzVar = b;
                if (zzgnzVar == null) {
                    zzgnzVar = d;
                    b = zzgnzVar;
                }
            }
        }
        return zzgnzVar;
    }

    public static zzgnz zzb() {
        zzgnz zzgnzVar = c;
        if (zzgnzVar != null) {
            return zzgnzVar;
        }
        synchronized (zzgnz.class) {
            zzgnz zzgnzVar2 = c;
            if (zzgnzVar2 != null) {
                return zzgnzVar2;
            }
            zzgnz zzgnzVarB = wt6.b();
            c = zzgnzVarB;
            return zzgnzVarB;
        }
    }

    public final zzgol zzc(zzgpx zzgpxVar, int i) {
        return (zzgol) this.a.get(new qt6(zzgpxVar, i));
    }

    public zzgnz(int i) {
        this.a = Collections.emptyMap();
    }
}

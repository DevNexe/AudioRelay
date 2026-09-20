package defpackage;

import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class n06 implements ez5 {
    @Override // defpackage.ez5
    public final ez5 c(String str, ma5 ma5Var, ArrayList arrayList) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof n06;
    }

    @Override // defpackage.ez5
    public final ez5 zzd() {
        return ez5.o;
    }

    @Override // defpackage.ez5
    public final Boolean zzg() {
        return Boolean.FALSE;
    }

    @Override // defpackage.ez5
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.ez5
    public final String zzi() {
        return AdError.UNDEFINED_DOMAIN;
    }

    @Override // defpackage.ez5
    public final Iterator zzl() {
        return null;
    }
}

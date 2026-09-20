package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class oy5 implements ez5 {
    @Override // defpackage.ez5
    public final ez5 c(String str, ma5 ma5Var, ArrayList arrayList) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof oy5;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // defpackage.ez5
    public final ez5 zzd() {
        return ez5.p;
    }

    @Override // defpackage.ez5
    public final Boolean zzg() {
        return Boolean.FALSE;
    }

    @Override // defpackage.ez5
    public final Double zzh() {
        return Double.valueOf(0.0d);
    }

    @Override // defpackage.ez5
    public final String zzi() {
        return "null";
    }

    @Override // defpackage.ez5
    public final Iterator zzl() {
        return null;
    }
}

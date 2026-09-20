package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class av5 implements ez5 {
    public final boolean w;

    public av5(Boolean bool) {
        this.w = bool == null ? false : bool.booleanValue();
    }

    @Override // defpackage.ez5
    public final ez5 c(String str, ma5 ma5Var, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.w;
        if (zEquals) {
            return new f06(Boolean.toString(z));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(z), str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof av5) && this.w == ((av5) obj).w;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.w).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.w);
    }

    @Override // defpackage.ez5
    public final ez5 zzd() {
        return new av5(Boolean.valueOf(this.w));
    }

    @Override // defpackage.ez5
    public final Boolean zzg() {
        return Boolean.valueOf(this.w);
    }

    @Override // defpackage.ez5
    public final Double zzh() {
        return Double.valueOf(true != this.w ? 0.0d : 1.0d);
    }

    @Override // defpackage.ez5
    public final String zzi() {
        return Boolean.toString(this.w);
    }

    @Override // defpackage.ez5
    public final Iterator zzl() {
        return null;
    }
}

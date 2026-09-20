package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class uv5 implements ez5 {
    public final ez5 w;
    public final String x;

    public uv5() {
        throw null;
    }

    public uv5(String str) {
        this.w = ez5.o;
        this.x = str;
    }

    public uv5(String str, ez5 ez5Var) {
        this.w = ez5Var;
        this.x = str;
    }

    @Override // defpackage.ez5
    public final ez5 c(String str, ma5 ma5Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uv5)) {
            return false;
        }
        uv5 uv5Var = (uv5) obj;
        return this.x.equals(uv5Var.x) && this.w.equals(uv5Var.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + (this.x.hashCode() * 31);
    }

    @Override // defpackage.ez5
    public final ez5 zzd() {
        return new uv5(this.x, this.w.zzd());
    }

    @Override // defpackage.ez5
    public final Boolean zzg() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // defpackage.ez5
    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // defpackage.ez5
    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // defpackage.ez5
    public final Iterator zzl() {
        return null;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class mz5 implements ez5 {
    public final String w;
    public final ArrayList x;

    public mz5(String str, ArrayList arrayList) {
        this.w = str;
        ArrayList arrayList2 = new ArrayList();
        this.x = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // defpackage.ez5
    public final ez5 c(String str, ma5 ma5Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz5)) {
            return false;
        }
        mz5 mz5Var = (mz5) obj;
        String str = this.w;
        if (str == null ? mz5Var.w == null : str.equals(mz5Var.w)) {
            return this.x.equals(mz5Var.x);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.w;
        return this.x.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // defpackage.ez5
    public final ez5 zzd() {
        return this;
    }

    @Override // defpackage.ez5
    public final Boolean zzg() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // defpackage.ez5
    public final Double zzh() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // defpackage.ez5
    public final String zzi() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // defpackage.ez5
    public final Iterator zzl() {
        return null;
    }
}

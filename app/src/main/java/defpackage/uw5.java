package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uw5 implements ez5, by5 {
    public final String w;
    public final HashMap x = new HashMap();

    public uw5(String str) {
        this.w = str;
    }

    @Override // defpackage.by5
    public final boolean a(String str) {
        return this.x.containsKey(str);
    }

    @Override // defpackage.by5
    public final void b(String str, ez5 ez5Var) {
        HashMap map = this.x;
        if (ez5Var == null) {
            map.remove(str);
        } else {
            map.put(str, ez5Var);
        }
    }

    @Override // defpackage.ez5
    public final ez5 c(String str, ma5 ma5Var, ArrayList arrayList) {
        return "toString".equals(str) ? new f06(this.w) : Th.R(this, new f06(str), ma5Var, arrayList);
    }

    public abstract ez5 d(ma5 ma5Var, List list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw5)) {
            return false;
        }
        uw5 uw5Var = (uw5) obj;
        String str = this.w;
        if (str != null) {
            return str.equals(uw5Var.w);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.w;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.ez5
    public ez5 zzd() {
        return this;
    }

    @Override // defpackage.by5
    public final ez5 zzf(String str) {
        HashMap map = this.x;
        return map.containsKey(str) ? (ez5) map.get(str) : ez5.o;
    }

    @Override // defpackage.ez5
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // defpackage.ez5
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.ez5
    public final String zzi() {
        return this.w;
    }

    @Override // defpackage.ez5
    public final Iterator zzl() {
        return new sx5(this.x.keySet().iterator());
    }
}

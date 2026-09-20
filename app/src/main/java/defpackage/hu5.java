package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class hu5 implements Iterable, ez5, by5 {
    public final TreeMap w;
    public final TreeMap x;

    public hu5() {
        this.w = new TreeMap();
        this.x = new TreeMap();
    }

    @Override // defpackage.by5
    public final boolean a(String str) {
        return "length".equals(str) || this.x.containsKey(str);
    }

    @Override // defpackage.by5
    public final void b(String str, ez5 ez5Var) {
        TreeMap treeMap = this.x;
        if (ez5Var == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, ez5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:326:0x0742  */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0837, code lost:
    
        if (defpackage.ac.q(r27, r29, (defpackage.az5) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).d() == d()) goto L361;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [gw5] */
    /* JADX WARN: Type inference failed for: r0v103, types: [ez5] */
    /* JADX WARN: Type inference failed for: r0v105, types: [ez5] */
    /* JADX WARN: Type inference failed for: r0v119, types: [hu5] */
    /* JADX WARN: Type inference failed for: r0v127, types: [ez5] */
    /* JADX WARN: Type inference failed for: r0v148, types: [hu5] */
    /* JADX WARN: Type inference failed for: r0v150, types: [f06] */
    /* JADX WARN: Type inference failed for: r0v151 */
    /* JADX WARN: Type inference failed for: r0v153, types: [gw5] */
    /* JADX WARN: Type inference failed for: r0v24, types: [hu5] */
    /* JADX WARN: Type inference failed for: r0v36, types: [gw5] */
    /* JADX WARN: Type inference failed for: r0v37, types: [gw5] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ez5] */
    /* JADX WARN: Type inference failed for: r0v44, types: [gw5] */
    /* JADX WARN: Type inference failed for: r0v51, types: [f06] */
    /* JADX WARN: Type inference failed for: r0v56, types: [f06] */
    /* JADX WARN: Type inference failed for: r0v68, types: [gw5] */
    /* JADX WARN: Type inference failed for: r0v71, types: [gw5] */
    /* JADX WARN: Type inference failed for: r0v94, types: [hu5] */
    /* JADX WARN: Type inference failed for: r0v95, types: [hu5] */
    /* JADX WARN: Type inference failed for: r1v137, types: [ez5] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.lang.Object, java.lang.String] */
    @Override // defpackage.ez5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ez5 c(java.lang.String r28, defpackage.ma5 r29, java.util.ArrayList r30) {
        /*
            Method dump skipped, instruction units count: 2342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu5.c(java.lang.String, ma5, java.util.ArrayList):ez5");
    }

    public final int d() {
        TreeMap treeMap = this.w;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final ez5 e(int i) {
        ez5 ez5Var;
        if (i < d()) {
            return (!r(i) || (ez5Var = (ez5) this.w.get(Integer.valueOf(i))) == null) ? ez5.o : ez5Var;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hu5)) {
            return false;
        }
        hu5 hu5Var = (hu5) obj;
        if (d() != hu5Var.d()) {
            return false;
        }
        TreeMap treeMap = this.w;
        if (treeMap.isEmpty()) {
            return hu5Var.w.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!e(iIntValue).equals(hu5Var.e(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    public final String f(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.w.isEmpty()) {
            for (int i = 0; i < d(); i++) {
                ez5 ez5VarE = e(i);
                sb.append(str);
                if (!(ez5VarE instanceof n06) && !(ez5VarE instanceof oy5)) {
                    sb.append(ez5VarE.zzi());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final Iterator g() {
        return this.w.keySet().iterator();
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList(d());
        for (int i = 0; i < d(); i++) {
            arrayList.add(e(i));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.w.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new st5(this);
    }

    public final void m(int i) {
        TreeMap treeMap = this.w;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            treeMap.put(numValueOf, ez5.o);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            ez5 ez5Var = (ez5) treeMap.get(numValueOf2);
            if (ez5Var != null) {
                treeMap.put(Integer.valueOf(i - 1), ez5Var);
                treeMap.remove(numValueOf2);
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void p(int i, ez5 ez5Var) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(GM.a("Out of bounds index: ", i));
        }
        TreeMap treeMap = this.w;
        if (ez5Var == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), ez5Var);
        }
    }

    public final boolean r(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.w;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        throw new IndexOutOfBoundsException(GM.a("Out of bounds index: ", i));
    }

    public final String toString() {
        return f(",");
    }

    @Override // defpackage.ez5
    public final ez5 zzd() {
        hu5 hu5Var = new hu5();
        for (Map.Entry entry : this.w.entrySet()) {
            boolean z = entry.getValue() instanceof by5;
            TreeMap treeMap = hu5Var.w;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (ez5) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((ez5) entry.getValue()).zzd());
            }
        }
        return hu5Var;
    }

    @Override // defpackage.by5
    public final ez5 zzf(String str) {
        ez5 ez5Var;
        if ("length".equals(str)) {
            return new gw5(Double.valueOf(d()));
        }
        return (!a(str) || (ez5Var = (ez5) this.x.get(str)) == null) ? ez5.o : ez5Var;
    }

    @Override // defpackage.ez5
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // defpackage.ez5
    public final Double zzh() {
        TreeMap treeMap = this.w;
        if (treeMap.size() == 1) {
            return e(0).zzh();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // defpackage.ez5
    public final String zzi() {
        return f(",");
    }

    @Override // defpackage.ez5
    public final Iterator zzl() {
        return new dt5(this.w.keySet().iterator(), this.x.keySet().iterator());
    }

    public hu5(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                p(i, (ez5) list.get(i));
            }
        }
    }
}

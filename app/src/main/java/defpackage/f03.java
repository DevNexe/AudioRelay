package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f03 {
    public final List<aw1> a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final HashMap<Integer, ya1> e;
    public final ry4 f;

    public f03(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Invalid start index".toString());
        }
        this.d = new ArrayList();
        HashMap<Integer, ya1> map = new HashMap<>();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            aw1 aw1Var = this.a.get(i3);
            Integer numValueOf = Integer.valueOf(aw1Var.c);
            int i4 = aw1Var.d;
            map.put(numValueOf, new ya1(i3, i2, i4));
            i2 += i4;
        }
        this.e = map;
        this.f = new ry4(new e03(this));
    }

    public final int a(aw1 aw1Var) {
        ya1 ya1Var = this.e.get(Integer.valueOf(aw1Var.c));
        if (ya1Var != null) {
            return ya1Var.b;
        }
        return -1;
    }

    public final boolean b(int i, int i2) {
        int i3;
        HashMap<Integer, ya1> map = this.e;
        ya1 ya1Var = map.get(Integer.valueOf(i));
        if (ya1Var == null) {
            return false;
        }
        int i4 = ya1Var.b;
        int i5 = i2 - ya1Var.c;
        ya1Var.c = i2;
        if (i5 == 0) {
            return true;
        }
        for (ya1 ya1Var2 : map.values()) {
            if (ya1Var2.b >= i4 && !ur1.a(ya1Var2, ya1Var) && (i3 = ya1Var2.b + i5) >= 0) {
                ya1Var2.b = i3;
            }
        }
        return true;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oOd {
    public static final Z7jl a = new Z7jl("", null, 6);

    public static final ArrayList a(int i, int i2, List list) {
        if (!(i <= i2)) {
            throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            Z7jl.CQf cQf = (Z7jl.CQf) obj;
            if (b(i, i2, cQf.b, cQf.c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Z7jl.CQf cQf2 = (Z7jl.CQf) arrayList.get(i4);
            arrayList2.add(new Z7jl.CQf(cQf2.a, Math.max(i, cQf2.b) - i, Math.min(i2, cQf2.c) - i, cQf2.d));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:29:0x0037  */
    public static final boolean b(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        if (Math.max(i, i3) < Math.min(i2, i4)) {
            return true;
        }
        if (i > i3 || i4 > i2) {
            z = false;
        } else {
            if (i2 == i4) {
                if ((i3 == i4) != (i == i2)) {
                    z = false;
                }
            }
            z = true;
        }
        if (z) {
            return true;
        }
        if (i3 > i || i2 > i4) {
            z2 = false;
        } else {
            if (i4 == i2) {
                if ((i == i2) != (i3 == i4)) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }
}

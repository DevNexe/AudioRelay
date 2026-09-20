package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class le3 {
    public final List a = new ArrayList();

    public /* synthetic */ le3() {
    }

    public final void a(int i) {
        List list = this.a;
        if ((!list.isEmpty()) && (((Number) list.get(0)).intValue() == i || ((Number) list.get(list.size() - 1)).intValue() == i)) {
            return;
        }
        int size = list.size();
        list.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int iIntValue = ((Number) list.get(i2)).intValue();
            if (i <= iIntValue) {
                break;
            }
            list.set(size, Integer.valueOf(iIntValue));
            size = i2;
        }
        list.set(size, Integer.valueOf(i));
    }

    public final void b() {
        this.a.add(uz2.CQf.c);
    }

    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new uz2.F1(f, f2, f3, f4, f5, f6));
    }

    public final void d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new uz2.FJCM(f, f2, f3, f4, f5, f6));
    }

    public final void e(float f) {
        this.a.add(new uz2.LPt8Fixed(f));
    }

    public final void f(float f) {
        this.a.add(new uz2.PRnFixed(f));
    }

    public final void g(float f, float f2) {
        this.a.add(new uz2.NUlFixed(f, f2));
    }

    public final void h(float f, float f2) {
        this.a.add(new uz2.y(f, f2));
    }

    public final void i(float f, float f2) {
        this.a.add(new uz2.YKK(f, f2));
    }

    public final void j(float f, float f2, float f3, float f4) {
        this.a.add(new uz2.T23(f, f2, f3, f4));
    }

    public final void k(float f, float f2, float f3, float f4) {
        this.a.add(new uz2.LPt6Fixed(f, f2, f3, f4));
    }

    public final int l() {
        int iIntValue;
        List list = this.a;
        if (!(list.size() > 0)) {
            e40.c("Set is empty".toString());
            throw null;
        }
        int iIntValue2 = ((Number) list.get(0)).intValue();
        while ((!list.isEmpty()) && ((Number) list.get(0)).intValue() == iIntValue2) {
            list.set(0, wu.N0(list));
            list.remove(list.size() - 1);
            int size = list.size();
            int size2 = list.size() >>> 1;
            int i = 0;
            while (i < size2) {
                int iIntValue3 = ((Number) list.get(i)).intValue();
                int i2 = (i + 1) * 2;
                int i3 = i2 - 1;
                int iIntValue4 = ((Number) list.get(i3)).intValue();
                if (i2 < size && (iIntValue = ((Number) list.get(i2)).intValue()) > iIntValue4) {
                    if (iIntValue <= iIntValue3) {
                        break;
                    }
                    list.set(i, Integer.valueOf(iIntValue));
                    list.set(i2, Integer.valueOf(iIntValue3));
                    i = i2;
                } else {
                    if (iIntValue4 <= iIntValue3) {
                        break;
                    }
                    list.set(i, Integer.valueOf(iIntValue4));
                    list.set(i3, Integer.valueOf(iIntValue3));
                    i = i3;
                }
            }
        }
        return iIntValue2;
    }

    public final void m(float f) {
        this.a.add(new uz2.LPt9Fixed(f));
    }

    public final void n(float f) {
        this.a.add(new uz2.ta(f));
    }

    public /* synthetic */ le3(int i) {
    }
}

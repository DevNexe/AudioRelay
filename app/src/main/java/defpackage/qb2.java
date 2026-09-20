package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qb2 {
    public static int a(rb2 rb2Var, rr1 rr1Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new eh0((zq1) list.get(i2), 2, 2));
        }
        return rb2Var.a(new xr1(rr1Var, rr1Var.getLayoutDirection()), arrayList, FWT.n(i, 0, 13)).getHeight();
    }

    public static int b(rb2 rb2Var, rr1 rr1Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new eh0((zq1) list.get(i2), 2, 1));
        }
        return rb2Var.a(new xr1(rr1Var, rr1Var.getLayoutDirection()), arrayList, FWT.n(0, i, 7)).getWidth();
    }

    public static int c(rb2 rb2Var, rr1 rr1Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new eh0((zq1) list.get(i2), 1, 2));
        }
        return rb2Var.a(new xr1(rr1Var, rr1Var.getLayoutDirection()), arrayList, FWT.n(i, 0, 13)).getHeight();
    }

    public static int d(rb2 rb2Var, rr1 rr1Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new eh0((zq1) list.get(i2), 1, 1));
        }
        return rb2Var.a(new xr1(rr1Var, rr1Var.getLayoutDirection()), arrayList, FWT.n(0, i, 7)).getWidth();
    }
}

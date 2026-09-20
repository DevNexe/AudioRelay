package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lh2 implements az2 {
    public final Z7jl a;
    public final List<Z7jl.CQf<e43>> b;
    public final oz1 c = qLd.h(3, new CQf());
    public final oz1 d = qLd.h(3, new QnHx());
    public final ArrayList e;

    public static final class CQf extends cx1 implements h81<Float> {
        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final Float invoke() {
            Object obj;
            az2 az2Var;
            ArrayList arrayList = lh2.this.e;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = arrayList.get(0);
                float fB = ((zy2) obj2).a.b();
                int iJ = ps0.J(arrayList);
                int i = 1;
                if (1 <= iJ) {
                    while (true) {
                        Object obj3 = arrayList.get(i);
                        float fB2 = ((zy2) obj3).a.b();
                        if (Float.compare(fB, fB2) < 0) {
                            obj2 = obj3;
                            fB = fB2;
                        }
                        if (i == iJ) {
                            break;
                        }
                        i++;
                    }
                }
                obj = obj2;
            }
            zy2 zy2Var = (zy2) obj;
            return Float.valueOf((zy2Var == null || (az2Var = zy2Var.a) == null) ? 0.0f : az2Var.b());
        }
    }

    public static final class QnHx extends cx1 implements h81<Float> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final Float invoke() {
            Object obj;
            az2 az2Var;
            ArrayList arrayList = lh2.this.e;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = arrayList.get(0);
                float fC = ((zy2) obj2).a.c();
                int iJ = ps0.J(arrayList);
                int i = 1;
                if (1 <= iJ) {
                    while (true) {
                        Object obj3 = arrayList.get(i);
                        float fC2 = ((zy2) obj3).a.c();
                        if (Float.compare(fC, fC2) < 0) {
                            obj2 = obj3;
                            fC = fC2;
                        }
                        if (i == iJ) {
                            break;
                        }
                        i++;
                    }
                }
                obj = obj2;
            }
            zy2 zy2Var = (zy2) obj;
            return Float.valueOf((zy2Var == null || (az2Var = zy2Var.a) == null) ? 0.0f : az2Var.c());
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ab A[PHI: r13
  0x00ab: PHI (r13v11 java.util.List) = (r13v2 java.util.List), (r13v3 java.util.List) binds: [B:21:0x00a9, B:26:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public lh2(Z7jl z7jl, w55 w55Var, List<Z7jl.CQf<e43>> list, ij0 ij0Var, e41.QnHx qnHx) {
        bz2 bz2Var;
        ArrayList arrayList;
        List list2;
        int i;
        Z7jl z7jl2 = z7jl;
        w55 w55Var2 = w55Var;
        this.a = z7jl2;
        this.b = list;
        Z7jl z7jl3 = oOd.a;
        int length = z7jl2.w.length();
        ArrayList arrayList2 = new ArrayList();
        List<Z7jl.CQf<bz2>> list3 = z7jl2.y;
        int size = list3.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            bz2Var = w55Var2.b;
            if (i2 >= size) {
                break;
            }
            Z7jl.CQf<bz2> cQf = list3.get(i2);
            bz2 bz2Var2 = cQf.a;
            int i4 = cQf.b;
            if (i4 != i3) {
                arrayList2.add(new Z7jl.CQf(i3, i4, bz2Var));
            }
            bz2 bz2VarA = bz2Var.a(bz2Var2);
            int i5 = cQf.c;
            arrayList2.add(new Z7jl.CQf(i4, i5, bz2VarA));
            i2++;
            i3 = i5;
        }
        if (i3 != length) {
            arrayList2.add(new Z7jl.CQf(i3, length, bz2Var));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new Z7jl.CQf(0, 0, bz2Var));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i6 = 0;
        while (i6 < size2) {
            Z7jl.CQf cQf2 = (Z7jl.CQf) arrayList2.get(i6);
            int i7 = cQf2.b;
            String str = z7jl2.w;
            int i8 = cQf2.c;
            String strSubstring = i7 != i8 ? str.substring(i7, i8) : "";
            List list4 = cs0.w;
            if (i7 == i8) {
                arrayList = arrayList2;
                list2 = list4;
            } else {
                list4 = z7jl2.x;
                if (i7 != 0 || i8 < str.length()) {
                    ArrayList arrayList4 = new ArrayList(list4.size());
                    int size3 = list4.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        Object obj = list4.get(i9);
                        Z7jl.CQf cQf3 = (Z7jl.CQf) obj;
                        ArrayList arrayList5 = arrayList2;
                        if (oOd.b(i7, i8, cQf3.b, cQf3.c)) {
                            arrayList4.add(obj);
                        }
                        i9++;
                        arrayList2 = arrayList5;
                    }
                    arrayList = arrayList2;
                    ArrayList arrayList6 = new ArrayList(arrayList4.size());
                    int i10 = 0;
                    for (int size4 = arrayList4.size(); i10 < size4; size4 = size4) {
                        Z7jl.CQf cQf4 = (Z7jl.CQf) arrayList4.get(i10);
                        arrayList6.add(new Z7jl.CQf(AY.o(cQf4.b, i7, i8) - i7, AY.o(cQf4.c, i7, i8) - i7, cQf4.a));
                        i10++;
                    }
                    list2 = arrayList6;
                } else {
                    arrayList = arrayList2;
                    list2 = list4;
                }
            }
            bz2 bz2Var3 = (bz2) cQf2.a;
            w55 w55Var3 = new w55(w55Var2.a, bz2Var.a(bz2Var3.b == null ? new bz2(bz2Var3.a, bz2Var.b, bz2Var3.c, bz2Var3.d, bz2Var3.e, bz2Var3.f) : bz2Var3));
            List<Z7jl.CQf<e43>> list5 = this.b;
            ArrayList arrayList7 = new ArrayList(list5.size());
            int size5 = list5.size();
            int i11 = 0;
            while (true) {
                i = cQf2.b;
                if (i11 >= size5) {
                    break;
                }
                Z7jl.CQf<e43> cQf5 = list5.get(i11);
                List<Z7jl.CQf<e43>> list6 = list5;
                Z7jl.CQf<e43> cQf6 = cQf5;
                if (oOd.b(i, i8, cQf6.b, cQf6.c)) {
                    arrayList7.add(cQf5);
                }
                i11++;
                list5 = list6;
            }
            ArrayList arrayList8 = new ArrayList(arrayList7.size());
            int i12 = 0;
            for (int size6 = arrayList7.size(); i12 < size6; size6 = size6) {
                Z7jl.CQf cQf7 = (Z7jl.CQf) arrayList7.get(i12);
                int i13 = cQf7.b;
                int i14 = cQf7.c;
                if (!(i <= i13 && i14 <= i8)) {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                }
                arrayList8.add(new Z7jl.CQf(i13 - i, i14 - i, cQf7.a));
                i12++;
            }
            arrayList3.add(new zy2(new h(w55Var3, qnHx, ij0Var, strSubstring, list2, arrayList8), i, i8));
            i6++;
            z7jl2 = z7jl;
            w55Var2 = w55Var;
            arrayList2 = arrayList;
        }
        this.e = arrayList3;
    }

    @Override // defpackage.az2
    public final boolean a() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((zy2) arrayList.get(i)).a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.az2
    public final float b() {
        return ((Number) this.c.getValue()).floatValue();
    }

    @Override // defpackage.az2
    public final float c() {
        return ((Number) this.d.getValue()).floatValue();
    }
}

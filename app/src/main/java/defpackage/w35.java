package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class w35 implements rb2 {
    public final boolean a;
    public final float b;
    public final ay2 c;

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ b43 B;
        public final /* synthetic */ b43 C;
        public final /* synthetic */ b43 D;
        public final /* synthetic */ b43 E;
        public final /* synthetic */ w35 F;
        public final /* synthetic */ int G;
        public final /* synthetic */ int H;
        public final /* synthetic */ vb2 I;
        public final /* synthetic */ b43 w;
        public final /* synthetic */ int x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(b43 b43Var, int i, int i2, int i3, int i4, b43 b43Var2, b43 b43Var3, b43 b43Var4, b43 b43Var5, w35 w35Var, int i5, int i6, vb2 vb2Var) {
            super(1);
            this.w = b43Var;
            this.x = i;
            this.y = i2;
            this.z = i3;
            this.A = i4;
            this.B = b43Var2;
            this.C = b43Var3;
            this.D = b43Var4;
            this.E = b43Var5;
            this.F = w35Var;
            this.G = i5;
            this.H = i6;
            this.I = vb2Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            int iC;
            int iC2;
            b43.QnHx qnHx2 = qnHx;
            b43 b43Var = this.B;
            vb2 vb2Var = this.I;
            b43 b43Var2 = this.E;
            b43 b43Var3 = this.D;
            b43 b43Var4 = this.C;
            int i = this.A;
            int i2 = this.z;
            w35 w35Var = this.F;
            b43 b43Var5 = this.w;
            if (b43Var5 != null) {
                int i3 = this.x - this.y;
                if (i3 < 0) {
                    i3 = 0;
                }
                boolean z = w35Var.a;
                int i4 = this.H + this.G;
                float density = vb2Var.getDensity();
                float f = s35.a;
                if (b43Var3 != null) {
                    b43.QnHx.f(qnHx2, b43Var3, 0, sy4.c((1 + 0.0f) * ((i - b43Var3.x) / 2.0f)));
                }
                if (b43Var2 != null) {
                    b43.QnHx.f(qnHx2, b43Var2, i2 - b43Var2.w, sy4.c((1 + 0.0f) * ((i - b43Var2.x) / 2.0f)));
                }
                if (z) {
                    iC2 = sy4.c((1 + 0.0f) * ((i - b43Var5.x) / 2.0f));
                } else {
                    iC2 = sy4.c(e35.b * density);
                }
                b43.QnHx.f(qnHx2, b43Var5, e35.e(b43Var3), iC2 - sy4.c((iC2 - i3) * w35Var.b));
                b43.QnHx.f(qnHx2, b43Var, e35.e(b43Var3), i4);
                if (b43Var4 != null) {
                    b43.QnHx.f(qnHx2, b43Var4, e35.e(b43Var3), i4);
                }
            } else {
                boolean z2 = w35Var.a;
                float density2 = vb2Var.getDensity();
                float f2 = s35.a;
                int iC3 = sy4.c(w35Var.c.d() * density2);
                if (b43Var3 != null) {
                    b43.QnHx.f(qnHx2, b43Var3, 0, sy4.c((1 + 0.0f) * ((i - b43Var3.x) / 2.0f)));
                }
                if (b43Var2 != null) {
                    b43.QnHx.f(qnHx2, b43Var2, i2 - b43Var2.w, sy4.c((1 + 0.0f) * ((i - b43Var2.x) / 2.0f)));
                }
                if (z2) {
                    iC = sy4.c((1 + 0.0f) * ((i - b43Var.x) / 2.0f));
                } else {
                    iC = iC3;
                }
                b43.QnHx.f(qnHx2, b43Var, e35.e(b43Var3), iC);
                if (b43Var4 != null) {
                    if (z2) {
                        iC3 = sy4.c((1 + 0.0f) * ((i - b43Var4.x) / 2.0f));
                    }
                    b43.QnHx.f(qnHx2, b43Var4, e35.e(b43Var3), iC3);
                }
            }
            return sd5.a;
        }
    }

    public w35(boolean z, float f, ay2 ay2Var) {
        this.a = z;
        this.b = f;
        this.c = ay2Var;
    }

    @Override // defpackage.rb2
    public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
        Object next;
        Object next2;
        Object next3;
        int iJ;
        Object next4;
        w35 w35Var = this;
        ay2 ay2Var = w35Var.c;
        int iP0 = vb2Var.p0(ay2Var.d());
        int iP1 = vb2Var.p0(ay2Var.a());
        int iP2 = vb2Var.p0(s35.c);
        long jA = g70.a(j, 0, 0, 0, 0, 10);
        List<? extends ob2> list2 = list;
        Iterator<T> it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ur1.a(fp1.X((ob2) next), "Leading"));
        ob2 ob2Var = (ob2) next;
        b43 b43VarY = ob2Var != null ? ob2Var.y(jA) : null;
        int iE = e35.e(b43VarY) + 0;
        Iterator<T> it2 = list2.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!ur1.a(fp1.X((ob2) next2), "Trailing"));
        ob2 ob2Var2 = (ob2) next2;
        b43 b43VarY2 = ob2Var2 != null ? ob2Var2.y(FWT.F(-iE, 0, jA)) : null;
        int iE2 = e35.e(b43VarY2) + iE;
        int i = -iP1;
        int i2 = -iE2;
        long jF = FWT.F(i2, i, jA);
        Iterator<T> it3 = list2.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!ur1.a(fp1.X((ob2) next3), "Label"));
        ob2 ob2Var3 = (ob2) next3;
        b43 b43VarY3 = ob2Var3 != null ? ob2Var3.y(jF) : null;
        if (b43VarY3 != null) {
            iJ = b43VarY3.J(hnK.b);
            if (iJ == Integer.MIN_VALUE) {
                iJ = b43VarY3.x;
            }
        } else {
            iJ = 0;
        }
        int iMax = Math.max(iJ, iP0);
        long jF2 = FWT.F(i2, b43VarY3 != null ? (i - iP2) - iMax : (-iP0) - iP1, g70.a(j, 0, 0, 0, 0, 11));
        for (ob2 ob2Var4 : list2) {
            if (ur1.a(fp1.X(ob2Var4), "TextField")) {
                b43 b43VarY4 = ob2Var4.y(jF2);
                long jA2 = g70.a(jF2, 0, 0, 0, 0, 14);
                Iterator<T> it4 = list2.iterator();
                do {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                } while (!ur1.a(fp1.X((ob2) next4), "Hint"));
                ob2 ob2Var5 = (ob2) next4;
                b43 b43VarY5 = ob2Var5 != null ? ob2Var5.y(jA2) : null;
                int iMax2 = Math.max(Math.max(b43VarY4.w, Math.max(e35.e(b43VarY3), e35.e(b43VarY5))) + e35.e(b43VarY) + e35.e(b43VarY2), g70.j(j));
                int iC = s35.c(b43VarY4.x, b43VarY3 != null, iMax, e35.d(b43VarY), e35.d(b43VarY2), e35.d(b43VarY5), j, vb2Var.getDensity(), w35Var.c);
                return vb2Var.K(iMax2, iC, ds0.w, new QnHx(b43VarY3, iP0, iJ, iMax2, iC, b43VarY4, b43VarY5, b43VarY, b43VarY2, this, iMax, iP2, vb2Var));
            }
            w35Var = this;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.rb2
    public final int b(yy1.byN byn, List list, int i) {
        return f(byn, list, i, x35.w);
    }

    @Override // defpackage.rb2
    public final int c(yy1.byN byn, List list, int i) {
        return g(list, i, y35.w);
    }

    @Override // defpackage.rb2
    public final int d(yy1.byN byn, List list, int i) {
        return g(list, i, v35.w);
    }

    @Override // defpackage.rb2
    public final int e(yy1.byN byn, List list, int i) {
        return f(byn, list, i, u35.w);
    }

    public final int f(yy1.byN byn, List list, int i, x81 x81Var) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        List list2 = list;
        for (Object obj2 : list2) {
            if (ur1.a(e35.c((zq1) obj2), "TextField")) {
                int iIntValue = ((Number) x81Var.invoke(obj2, Integer.valueOf(i))).intValue();
                Iterator it = list2.iterator();
                do {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!ur1.a(e35.c((zq1) next), "Label"));
                zq1 zq1Var = (zq1) next;
                int iIntValue2 = zq1Var != null ? ((Number) x81Var.invoke(zq1Var, Integer.valueOf(i))).intValue() : 0;
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!ur1.a(e35.c((zq1) next2), "Trailing"));
                zq1 zq1Var2 = (zq1) next2;
                int iIntValue3 = zq1Var2 != null ? ((Number) x81Var.invoke(zq1Var2, Integer.valueOf(i))).intValue() : 0;
                Iterator it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!ur1.a(e35.c((zq1) next3), "Leading"));
                zq1 zq1Var3 = (zq1) next3;
                int iIntValue4 = zq1Var3 != null ? ((Number) x81Var.invoke(zq1Var3, Integer.valueOf(i))).intValue() : 0;
                for (Object obj3 : list2) {
                    if (ur1.a(e35.c((zq1) obj3), "Hint")) {
                        obj = obj3;
                        break;
                    }
                }
                zq1 zq1Var4 = (zq1) obj;
                return s35.c(iIntValue, iIntValue2 > 0, iIntValue2, iIntValue4, iIntValue3, zq1Var4 != null ? ((Number) x81Var.invoke(zq1Var4, Integer.valueOf(i))).intValue() : 0, e35.a, byn.getDensity(), this.c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int g(List<? extends zq1> list, int i, x81<? super zq1, ? super Integer, Integer> x81Var) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        List<? extends zq1> list2 = list;
        for (Object obj2 : list2) {
            if (ur1.a(e35.c((zq1) obj2), "TextField")) {
                int iIntValue = x81Var.invoke(obj2, Integer.valueOf(i)).intValue();
                Iterator<T> it = list2.iterator();
                do {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!ur1.a(e35.c((zq1) next), "Label"));
                zq1 zq1Var = (zq1) next;
                int iIntValue2 = zq1Var != null ? x81Var.invoke(zq1Var, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!ur1.a(e35.c((zq1) next2), "Trailing"));
                zq1 zq1Var2 = (zq1) next2;
                int iIntValue3 = zq1Var2 != null ? x81Var.invoke(zq1Var2, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!ur1.a(e35.c((zq1) next3), "Leading"));
                zq1 zq1Var3 = (zq1) next3;
                int iIntValue4 = zq1Var3 != null ? x81Var.invoke(zq1Var3, Integer.valueOf(i)).intValue() : 0;
                for (Object obj3 : list2) {
                    if (ur1.a(e35.c((zq1) obj3), "Hint")) {
                        obj = obj3;
                        break;
                    }
                }
                zq1 zq1Var4 = (zq1) obj;
                int iIntValue5 = zq1Var4 != null ? x81Var.invoke(zq1Var4, Integer.valueOf(i)).intValue() : 0;
                long j = e35.a;
                float f = s35.a;
                return Math.max(Math.max(iIntValue, Math.max(iIntValue2, iIntValue5)) + iIntValue4 + iIntValue3, g70.j(j));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

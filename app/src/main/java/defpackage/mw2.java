package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class mw2 implements rb2 {
    public final j81<cm4, sd5> a;
    public final boolean b;
    public final float c;
    public final ay2 d;

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ b43 A;
        public final /* synthetic */ b43 B;
        public final /* synthetic */ b43 C;
        public final /* synthetic */ b43 D;
        public final /* synthetic */ mw2 E;
        public final /* synthetic */ vb2 F;
        public final /* synthetic */ int w;
        public final /* synthetic */ int x;
        public final /* synthetic */ b43 y;
        public final /* synthetic */ b43 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i, int i2, b43 b43Var, b43 b43Var2, b43 b43Var3, b43 b43Var4, b43 b43Var5, b43 b43Var6, mw2 mw2Var, vb2 vb2Var) {
            super(1);
            this.w = i;
            this.x = i2;
            this.y = b43Var;
            this.z = b43Var2;
            this.A = b43Var3;
            this.B = b43Var4;
            this.C = b43Var5;
            this.D = b43Var6;
            this.E = mw2Var;
            this.F = vb2Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            int iC;
            int iC2;
            b43.QnHx qnHx2 = qnHx;
            mw2 mw2Var = this.E;
            float f = mw2Var.c;
            vb2 vb2Var = this.F;
            float density = vb2Var.getDensity();
            jy1 layoutDirection = vb2Var.getLayoutDirection();
            float f2 = iw2.a;
            ay2 ay2Var = mw2Var.d;
            int iC3 = sy4.c(ay2Var.d() * density);
            int iC4 = sy4.c(ps0.q(ay2Var, layoutDirection) * density);
            float f3 = e35.c * density;
            int i = this.w;
            b43 b43Var = this.y;
            if (b43Var != null) {
                b43.QnHx.f(qnHx2, b43Var, 0, sy4.c((1 + 0.0f) * ((i - b43Var.x) / 2.0f)));
            }
            b43 b43Var2 = this.z;
            if (b43Var2 != null) {
                b43.QnHx.f(qnHx2, b43Var2, this.x - b43Var2.w, sy4.c((1 + 0.0f) * ((i - b43Var2.x) / 2.0f)));
            }
            boolean z = mw2Var.b;
            b43 b43Var3 = this.B;
            if (b43Var3 != null) {
                if (z) {
                    iC2 = sy4.c((1 + 0.0f) * ((i - b43Var3.x) / 2.0f));
                } else {
                    iC2 = iC3;
                }
                float f4 = 1 - f;
                b43.QnHx.f(qnHx2, b43Var3, sy4.c(b43Var == null ? 0.0f : (e35.e(b43Var) - f3) * f4) + iC4, sy4.c((iC2 * f4) - ((b43Var3.x / 2) * f)));
            }
            b43 b43Var4 = this.A;
            if (z) {
                iC = sy4.c((1 + 0.0f) * ((i - b43Var4.x) / 2.0f));
            } else {
                iC = iC3;
            }
            b43.QnHx.f(qnHx2, b43Var4, e35.e(b43Var), Math.max(iC, e35.d(b43Var3) / 2));
            b43 b43Var5 = this.C;
            if (b43Var5 != null) {
                if (z) {
                    iC3 = sy4.c((1 + 0.0f) * ((i - b43Var5.x) / 2.0f));
                }
                b43.QnHx.f(qnHx2, b43Var5, e35.e(b43Var), iC3);
            }
            b43.QnHx.d(this.D, mp1.b, 0.0f);
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mw2(j81<? super cm4, sd5> j81Var, boolean z, float f, ay2 ay2Var) {
        this.a = j81Var;
        this.b = z;
        this.c = f;
        this.d = ay2Var;
    }

    @Override // defpackage.rb2
    public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        ay2 ay2Var = this.d;
        int iP0 = vb2Var.p0(ay2Var.a());
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
        int i = -(e35.e(b43VarY2) + iE);
        int i2 = -iP0;
        long jF = FWT.F((i - vb2Var.p0(ay2Var.b(vb2Var.getLayoutDirection()))) - vb2Var.p0(ay2Var.c(vb2Var.getLayoutDirection())), i2, jA);
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
            this.a.invoke(new cm4(ps0.e(b43VarY3.w, b43VarY3.x)));
        }
        long jA2 = g70.a(FWT.F(i, i2 - Math.max(e35.d(b43VarY3) / 2, vb2Var.p0(ay2Var.d())), j), 0, 0, 0, 0, 11);
        for (ob2 ob2Var4 : list2) {
            if (ur1.a(fp1.X(ob2Var4), "TextField")) {
                b43 b43VarY4 = ob2Var4.y(jA2);
                long jA3 = g70.a(jA2, 0, 0, 0, 0, 14);
                Iterator<T> it4 = list2.iterator();
                do {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                } while (!ur1.a(fp1.X((ob2) next4), "Hint"));
                ob2 ob2Var5 = (ob2) next4;
                b43 b43VarY5 = ob2Var5 != null ? ob2Var5.y(jA3) : null;
                int iE2 = e35.e(b43VarY);
                int iE3 = e35.e(b43VarY2);
                int i3 = b43VarY4.w;
                int iE4 = e35.e(b43VarY3);
                int iE5 = e35.e(b43VarY5);
                float f = iw2.a;
                int iMax = Math.max(Math.max(i3, Math.max(iE4, iE5)) + iE2 + iE3, g70.j(j));
                int iC = iw2.c(e35.d(b43VarY), e35.d(b43VarY2), b43VarY4.x, e35.d(b43VarY3), e35.d(b43VarY5), j, vb2Var.getDensity(), this.d);
                for (ob2 ob2Var6 : list2) {
                    if (ur1.a(fp1.X(ob2Var6), "border")) {
                        return vb2Var.K(iMax, iC, ds0.w, new QnHx(iC, iMax, b43VarY, b43VarY2, b43VarY4, b43VarY3, b43VarY5, ob2Var6.y(FWT.m(iMax != Integer.MAX_VALUE ? iMax : 0, iMax, iC != Integer.MAX_VALUE ? iC : 0, iC)), this, vb2Var));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.rb2
    public final int b(yy1.byN byn, List list, int i) {
        return f(byn, list, i, nw2.w);
    }

    @Override // defpackage.rb2
    public final int c(yy1.byN byn, List list, int i) {
        return g(list, i, ow2.w);
    }

    @Override // defpackage.rb2
    public final int d(yy1.byN byn, List list, int i) {
        return g(list, i, lw2.w);
    }

    @Override // defpackage.rb2
    public final int e(yy1.byN byn, List list, int i) {
        return f(byn, list, i, kw2.w);
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
                return iw2.c(iIntValue4, iIntValue3, iIntValue, iIntValue2, zq1Var4 != null ? ((Number) x81Var.invoke(zq1Var4, Integer.valueOf(i))).intValue() : 0, e35.a, byn.getDensity(), this.d);
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
                float f = iw2.a;
                return Math.max(Math.max(iIntValue, Math.max(iIntValue2, iIntValue5)) + iIntValue4 + iIntValue3, g70.j(j));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

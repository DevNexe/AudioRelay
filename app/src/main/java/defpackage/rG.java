package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class rG {
    public static final y a = y.w;

    public static final class CQf extends cx1 implements h81<yy1> {
        public final /* synthetic */ m24 A;
        public final /* synthetic */ String B;
        public final /* synthetic */ kl3<zi5<T>> C;
        public final /* synthetic */ Context w;
        public final /* synthetic */ l40 x;
        public final /* synthetic */ mm2 y;
        public final /* synthetic */ j81<Context, T> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(Context context, l40 l40Var, mm2 mm2Var, j81<? super Context, ? extends T> j81Var, m24 m24Var, String str, kl3<zi5<T>> kl3Var) {
            super(0);
            this.w = context;
            this.x = l40Var;
            this.y = mm2Var;
            this.z = j81Var;
            this.A = m24Var;
            this.B = str;
            this.C = kl3Var;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, X05, zi5] */
        @Override // defpackage.h81
        public final yy1 invoke() {
            View typedView$ui_release;
            ?? zi5Var = new zi5(this.w, this.x, this.y);
            zi5Var.setFactory(this.z);
            m24 m24Var = this.A;
            Object objD = m24Var != null ? m24Var.d(this.B) : null;
            SparseArray<Parcelable> sparseArray = objD instanceof SparseArray ? (SparseArray) objD : null;
            if (sparseArray != null && (typedView$ui_release = zi5Var.getTypedView$ui_release()) != null) {
                typedView$ui_release.restoreHierarchyState(sparseArray);
            }
            this.C.a = zi5Var;
            return zi5Var.getLayoutNode();
        }
    }

    public static final class EQ extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ j81<Context, T> w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ j81<T, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public EQ(j81<? super Context, ? extends T> j81Var, pg2 pg2Var, j81<? super T, sd5> j81Var2, int i, int i2) {
            super(2);
            this.w = j81Var;
            this.x = pg2Var;
            this.y = j81Var2;
            this.z = i;
            this.A = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            rG.a(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<yy1, pg2, sd5> {
        public final /* synthetic */ kl3<zi5<T>> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(kl3<zi5<T>> kl3Var) {
            super(2);
            this.w = kl3Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final sd5 invoke(yy1 yy1Var, pg2 pg2Var) {
            ((zi5) this.w.a).setModifier(pg2Var);
            return sd5.a;
        }
    }

    public static final class FJCM extends cx1 implements j81<o94, sd5> {
        public static final FJCM w = new FJCM();

        public FJCM() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(o94 o94Var) {
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<yy1, ij0, sd5> {
        public final /* synthetic */ kl3<zi5<T>> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(kl3<zi5<T>> kl3Var) {
            super(2);
            this.w = kl3Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final sd5 invoke(yy1 yy1Var, ij0 ij0Var) {
            ((zi5) this.w.a).setDensity(ij0Var);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<yy1, d32, sd5> {
        public final /* synthetic */ kl3<zi5<T>> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(kl3<zi5<T>> kl3Var) {
            super(2);
            this.w = kl3Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final sd5 invoke(yy1 yy1Var, d32 d32Var) {
            ((zi5) this.w.a).setLifecycleOwner(d32Var);
            return sd5.a;
        }
    }

    public static final class PRnFixed implements lm2 {
        @Override // defpackage.lm2
        public final Object a(long j, long j2, z80 z80Var) {
            return new mh5(mh5.b);
        }

        @Override // defpackage.lm2
        public final long b(int i, long j) {
            return kt2.b;
        }

        @Override // defpackage.lm2
        public final long d(int i, long j, long j2) {
            return kt2.b;
        }

        @Override // defpackage.lm2
        public final Object e(long j, z80 z80Var) {
            return new mh5(mh5.b);
        }
    }

    public static final class QnHx extends cx1 implements h81<yy1> {
        public final /* synthetic */ h81 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(CQf cQf) {
            super(0);
            this.w = cQf;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yy1] */
        @Override // defpackage.h81
        public final yy1 invoke() {
            return this.w.invoke();
        }
    }

    public static final class T23 extends cx1 implements x81<yy1, jy1, sd5> {
        public final /* synthetic */ kl3<zi5<T>> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T23(kl3<zi5<T>> kl3Var) {
            super(2);
            this.w = kl3Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final sd5 invoke(yy1 yy1Var, jy1 jy1Var) {
            int i;
            zi5 zi5Var = (zi5) this.w.a;
            int iOrdinal = jy1Var.ordinal();
            if (iOrdinal != 0) {
                i = 1;
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i = 0;
            }
            zi5Var.setLayoutDirection(i);
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements x81<yy1, b34, sd5> {
        public final /* synthetic */ kl3<zi5<T>> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(kl3<zi5<T>> kl3Var) {
            super(2);
            this.w = kl3Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final sd5 invoke(yy1 yy1Var, b34 b34Var) {
            ((zi5) this.w.a).setSavedStateRegistryOwner(b34Var);
            return sd5.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class auxFixed<T> extends cx1 implements x81<yy1, j81<? super T, ? extends sd5>, sd5> {
        public final /* synthetic */ kl3<zi5<T>> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public auxFixed(kl3<zi5<T>> kl3Var) {
            super(2);
            this.w = kl3Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(yy1 yy1Var, Object obj) {
            this.w.a.setUpdateBlock((j81) obj);
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ m24 w;
        public final /* synthetic */ String x;
        public final /* synthetic */ kl3<zi5<T>> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public byN(m24 m24Var, String str, kl3<zi5<T>> kl3Var) {
            super(1);
            this.w = m24Var;
            this.x = str;
            this.y = kl3Var;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            return new oUE(this.w.b(this.x, new Olf(this.y)));
        }
    }

    public static final class y extends cx1 implements j81<View, sd5> {
        public static final y w = new y();

        public y() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(View view) {
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x0105  */
    /* JADX WARN: Code duplicated, block: B:59:0x0146  */
    /* JADX WARN: Code duplicated, block: B:61:0x014d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0156  */
    /* JADX WARN: Code duplicated, block: B:65:0x0197  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final <T extends View> void a(j81<? super Context, ? extends T> j81Var, pg2 pg2Var, j81<? super T, sd5> j81Var2, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        int i4;
        j81<? super T, sd5> j81Var3;
        int i5;
        pg2.QnHx qnHx;
        pg2 pg2Var3;
        j81<? super T, sd5> j81Var4;
        Object objB0;
        g30.QnHx.C0132QnHx c0132QnHx;
        Object objB1;
        pg2 pg2VarC;
        ij0 ij0Var;
        jy1 jy1Var;
        m24 m24Var;
        String strValueOf;
        Object objB2;
        kl3 kl3Var;
        d32 d32Var;
        b34 b34Var;
        CQf cQf;
        pg2 pg2Var4;
        pg2 pg2Var5;
        j81<? super T, sd5> j81Var5;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-1783766393);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(j81Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                pg2Var2 = pg2Var;
                i3 |= j30VarQ.I(pg2Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    j81Var3 = j81Var2;
                    if (j30VarQ.I(j81Var3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 731) == 146 || !j30VarQ.t()) {
                    qnHx = pg2.QnHx.w;
                    if (i6 != 0) {
                        pg2Var3 = qnHx;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        j81Var4 = a;
                    } else {
                        j81Var4 = j81Var3;
                    }
                    Context context = (Context) j30VarQ.E(Ll.b);
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = new PRnFixed();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    PRnFixed pRn = (PRnFixed) objB0;
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    if (objB1 == c0132QnHx) {
                        objB1 = new mm2();
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    mm2 mm2Var = (mm2) objB1;
                    pg2VarC = f30.c(j30VarQ, c94.a(pg2Var3.y(f30.a(qnHx, wo1.a, new nm2(pRn, mm2Var))), true, FJCM.w));
                    ij0Var = (ij0) j30VarQ.E(r40.e);
                    jy1Var = (jy1) j30VarQ.E(r40.k);
                    l40 l40VarR0 = fp1.r0(j30VarQ);
                    m24Var = (m24) j30VarQ.E(o24.a);
                    strValueOf = String.valueOf(j30VarQ.L);
                    j30VarQ.e(-492369756);
                    objB2 = j30VarQ.b0();
                    if (objB2 == c0132QnHx) {
                        objB2 = new kl3();
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    kl3Var = (kl3) objB2;
                    d32Var = (d32) j30VarQ.E(Ll.d);
                    b34Var = (b34) j30VarQ.E(Ll.e);
                    pg2Var4 = pg2Var3;
                    cQf = new CQf(context, l40VarR0, mm2Var, j81Var, m24Var, strValueOf, kl3Var);
                    j30VarQ.e(1886828752);
                    if (!(j30VarQ.a instanceof id5)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.v0();
                    if (j30VarQ.K) {
                        j30VarQ.l(new QnHx(cQf));
                    } else {
                        j30VarQ.A();
                    }
                    hH.u(j30VarQ, pg2VarC, new F1(kl3Var));
                    hH.u(j30VarQ, ij0Var, new LPt8Fixed(kl3Var));
                    hH.u(j30VarQ, d32Var, new NUlFixed(kl3Var));
                    hH.u(j30VarQ, b34Var, new YKK(kl3Var));
                    hH.u(j30VarQ, j81Var4, new auxFixed(kl3Var));
                    hH.u(j30VarQ, jy1Var, new T23(kl3Var));
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    if (m24Var != null) {
                        wq0.b(m24Var, strValueOf, new byN(m24Var, strValueOf, kl3Var), j30VarQ);
                    }
                    pg2Var5 = pg2Var4;
                    j81Var5 = j81Var4;
                } else {
                    j30VarQ.x();
                    pg2Var5 = pg2Var2;
                    j81Var5 = j81Var3;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new EQ(j81Var, pg2Var5, j81Var5, i, i2);
            }
            i3 |= 384;
            j81Var3 = j81Var2;
            if ((i3 & 731) == 146) {
                qnHx = pg2.QnHx.w;
                if (i6 != 0) {
                    pg2Var3 = qnHx;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    j81Var4 = a;
                } else {
                    j81Var4 = j81Var3;
                }
                Context context2 = (Context) j30VarQ.E(Ll.b);
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = new PRnFixed();
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                PRnFixed pRn2 = (PRnFixed) objB0;
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                if (objB1 == c0132QnHx) {
                    objB1 = new mm2();
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                mm2 mm2Var2 = (mm2) objB1;
                pg2VarC = f30.c(j30VarQ, c94.a(pg2Var3.y(f30.a(qnHx, wo1.a, new nm2(pRn2, mm2Var2))), true, FJCM.w));
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                l40 l40VarR1 = fp1.r0(j30VarQ);
                m24Var = (m24) j30VarQ.E(o24.a);
                strValueOf = String.valueOf(j30VarQ.L);
                j30VarQ.e(-492369756);
                objB2 = j30VarQ.b0();
                if (objB2 == c0132QnHx) {
                    objB2 = new kl3();
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                kl3Var = (kl3) objB2;
                d32Var = (d32) j30VarQ.E(Ll.d);
                b34Var = (b34) j30VarQ.E(Ll.e);
                pg2Var4 = pg2Var3;
                cQf = new CQf(context2, l40VarR1, mm2Var2, j81Var, m24Var, strValueOf, kl3Var);
                j30VarQ.e(1886828752);
                if (!(j30VarQ.a instanceof id5)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.v0();
                if (j30VarQ.K) {
                    j30VarQ.l(new QnHx(cQf));
                } else {
                    j30VarQ.A();
                }
                hH.u(j30VarQ, pg2VarC, new F1(kl3Var));
                hH.u(j30VarQ, ij0Var, new LPt8Fixed(kl3Var));
                hH.u(j30VarQ, d32Var, new NUlFixed(kl3Var));
                hH.u(j30VarQ, b34Var, new YKK(kl3Var));
                hH.u(j30VarQ, j81Var4, new auxFixed(kl3Var));
                hH.u(j30VarQ, jy1Var, new T23(kl3Var));
                j30VarQ.R(true);
                j30VarQ.R(false);
                if (m24Var != null) {
                    wq0.b(m24Var, strValueOf, new byN(m24Var, strValueOf, kl3Var), j30VarQ);
                }
                pg2Var5 = pg2Var4;
                j81Var5 = j81Var4;
            } else {
                qnHx = pg2.QnHx.w;
                if (i6 != 0) {
                    pg2Var3 = qnHx;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    j81Var4 = a;
                } else {
                    j81Var4 = j81Var3;
                }
                Context context3 = (Context) j30VarQ.E(Ll.b);
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = new PRnFixed();
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                PRnFixed pRn3 = (PRnFixed) objB0;
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                if (objB1 == c0132QnHx) {
                    objB1 = new mm2();
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                mm2 mm2Var3 = (mm2) objB1;
                pg2VarC = f30.c(j30VarQ, c94.a(pg2Var3.y(f30.a(qnHx, wo1.a, new nm2(pRn3, mm2Var3))), true, FJCM.w));
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                l40 l40VarR2 = fp1.r0(j30VarQ);
                m24Var = (m24) j30VarQ.E(o24.a);
                strValueOf = String.valueOf(j30VarQ.L);
                j30VarQ.e(-492369756);
                objB2 = j30VarQ.b0();
                if (objB2 == c0132QnHx) {
                    objB2 = new kl3();
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                kl3Var = (kl3) objB2;
                d32Var = (d32) j30VarQ.E(Ll.d);
                b34Var = (b34) j30VarQ.E(Ll.e);
                pg2Var4 = pg2Var3;
                cQf = new CQf(context3, l40VarR2, mm2Var3, j81Var, m24Var, strValueOf, kl3Var);
                j30VarQ.e(1886828752);
                if (!(j30VarQ.a instanceof id5)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.v0();
                if (j30VarQ.K) {
                    j30VarQ.l(new QnHx(cQf));
                } else {
                    j30VarQ.A();
                }
                hH.u(j30VarQ, pg2VarC, new F1(kl3Var));
                hH.u(j30VarQ, ij0Var, new LPt8Fixed(kl3Var));
                hH.u(j30VarQ, d32Var, new NUlFixed(kl3Var));
                hH.u(j30VarQ, b34Var, new YKK(kl3Var));
                hH.u(j30VarQ, j81Var4, new auxFixed(kl3Var));
                hH.u(j30VarQ, jy1Var, new T23(kl3Var));
                j30VarQ.R(true);
                j30VarQ.R(false);
                if (m24Var != null) {
                    wq0.b(m24Var, strValueOf, new byN(m24Var, strValueOf, kl3Var), j30VarQ);
                }
                pg2Var5 = pg2Var4;
                j81Var5 = j81Var4;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new EQ(j81Var, pg2Var5, j81Var5, i, i2);
        }
        i3 |= 48;
        pg2Var2 = pg2Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                j81Var3 = j81Var2;
                if (j30VarQ.I(j81Var3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 731) == 146) {
                qnHx = pg2.QnHx.w;
                if (i6 != 0) {
                    pg2Var3 = qnHx;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    j81Var4 = a;
                } else {
                    j81Var4 = j81Var3;
                }
                Context context4 = (Context) j30VarQ.E(Ll.b);
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = new PRnFixed();
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                PRnFixed pRn4 = (PRnFixed) objB0;
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                if (objB1 == c0132QnHx) {
                    objB1 = new mm2();
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                mm2 mm2Var4 = (mm2) objB1;
                pg2VarC = f30.c(j30VarQ, c94.a(pg2Var3.y(f30.a(qnHx, wo1.a, new nm2(pRn4, mm2Var4))), true, FJCM.w));
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                l40 l40VarR3 = fp1.r0(j30VarQ);
                m24Var = (m24) j30VarQ.E(o24.a);
                strValueOf = String.valueOf(j30VarQ.L);
                j30VarQ.e(-492369756);
                objB2 = j30VarQ.b0();
                if (objB2 == c0132QnHx) {
                    objB2 = new kl3();
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                kl3Var = (kl3) objB2;
                d32Var = (d32) j30VarQ.E(Ll.d);
                b34Var = (b34) j30VarQ.E(Ll.e);
                pg2Var4 = pg2Var3;
                cQf = new CQf(context4, l40VarR3, mm2Var4, j81Var, m24Var, strValueOf, kl3Var);
                j30VarQ.e(1886828752);
                if (!(j30VarQ.a instanceof id5)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.v0();
                if (j30VarQ.K) {
                    j30VarQ.l(new QnHx(cQf));
                } else {
                    j30VarQ.A();
                }
                hH.u(j30VarQ, pg2VarC, new F1(kl3Var));
                hH.u(j30VarQ, ij0Var, new LPt8Fixed(kl3Var));
                hH.u(j30VarQ, d32Var, new NUlFixed(kl3Var));
                hH.u(j30VarQ, b34Var, new YKK(kl3Var));
                hH.u(j30VarQ, j81Var4, new auxFixed(kl3Var));
                hH.u(j30VarQ, jy1Var, new T23(kl3Var));
                j30VarQ.R(true);
                j30VarQ.R(false);
                if (m24Var != null) {
                    wq0.b(m24Var, strValueOf, new byN(m24Var, strValueOf, kl3Var), j30VarQ);
                }
                pg2Var5 = pg2Var4;
                j81Var5 = j81Var4;
            } else {
                qnHx = pg2.QnHx.w;
                if (i6 != 0) {
                    pg2Var3 = qnHx;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    j81Var4 = a;
                } else {
                    j81Var4 = j81Var3;
                }
                Context context5 = (Context) j30VarQ.E(Ll.b);
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = new PRnFixed();
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                PRnFixed pRn5 = (PRnFixed) objB0;
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                if (objB1 == c0132QnHx) {
                    objB1 = new mm2();
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                mm2 mm2Var5 = (mm2) objB1;
                pg2VarC = f30.c(j30VarQ, c94.a(pg2Var3.y(f30.a(qnHx, wo1.a, new nm2(pRn5, mm2Var5))), true, FJCM.w));
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                l40 l40VarR4 = fp1.r0(j30VarQ);
                m24Var = (m24) j30VarQ.E(o24.a);
                strValueOf = String.valueOf(j30VarQ.L);
                j30VarQ.e(-492369756);
                objB2 = j30VarQ.b0();
                if (objB2 == c0132QnHx) {
                    objB2 = new kl3();
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                kl3Var = (kl3) objB2;
                d32Var = (d32) j30VarQ.E(Ll.d);
                b34Var = (b34) j30VarQ.E(Ll.e);
                pg2Var4 = pg2Var3;
                cQf = new CQf(context5, l40VarR4, mm2Var5, j81Var, m24Var, strValueOf, kl3Var);
                j30VarQ.e(1886828752);
                if (!(j30VarQ.a instanceof id5)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.v0();
                if (j30VarQ.K) {
                    j30VarQ.l(new QnHx(cQf));
                } else {
                    j30VarQ.A();
                }
                hH.u(j30VarQ, pg2VarC, new F1(kl3Var));
                hH.u(j30VarQ, ij0Var, new LPt8Fixed(kl3Var));
                hH.u(j30VarQ, d32Var, new NUlFixed(kl3Var));
                hH.u(j30VarQ, b34Var, new YKK(kl3Var));
                hH.u(j30VarQ, j81Var4, new auxFixed(kl3Var));
                hH.u(j30VarQ, jy1Var, new T23(kl3Var));
                j30VarQ.R(true);
                j30VarQ.R(false);
                if (m24Var != null) {
                    wq0.b(m24Var, strValueOf, new byN(m24Var, strValueOf, kl3Var), j30VarQ);
                }
                pg2Var5 = pg2Var4;
                j81Var5 = j81Var4;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new EQ(j81Var, pg2Var5, j81Var5, i, i2);
        }
        i3 |= 384;
        j81Var3 = j81Var2;
        if ((i3 & 731) == 146) {
            qnHx = pg2.QnHx.w;
            if (i6 != 0) {
                pg2Var3 = qnHx;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i4 != 0) {
                j81Var4 = a;
            } else {
                j81Var4 = j81Var3;
            }
            Context context6 = (Context) j30VarQ.E(Ll.b);
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = new PRnFixed();
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            PRnFixed pRn6 = (PRnFixed) objB0;
            j30VarQ.e(-492369756);
            objB1 = j30VarQ.b0();
            if (objB1 == c0132QnHx) {
                objB1 = new mm2();
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            mm2 mm2Var6 = (mm2) objB1;
            pg2VarC = f30.c(j30VarQ, c94.a(pg2Var3.y(f30.a(qnHx, wo1.a, new nm2(pRn6, mm2Var6))), true, FJCM.w));
            ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1Var = (jy1) j30VarQ.E(r40.k);
            l40 l40VarR5 = fp1.r0(j30VarQ);
            m24Var = (m24) j30VarQ.E(o24.a);
            strValueOf = String.valueOf(j30VarQ.L);
            j30VarQ.e(-492369756);
            objB2 = j30VarQ.b0();
            if (objB2 == c0132QnHx) {
                objB2 = new kl3();
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            kl3Var = (kl3) objB2;
            d32Var = (d32) j30VarQ.E(Ll.d);
            b34Var = (b34) j30VarQ.E(Ll.e);
            pg2Var4 = pg2Var3;
            cQf = new CQf(context6, l40VarR5, mm2Var6, j81Var, m24Var, strValueOf, kl3Var);
            j30VarQ.e(1886828752);
            if (!(j30VarQ.a instanceof id5)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.v0();
            if (j30VarQ.K) {
                j30VarQ.l(new QnHx(cQf));
            } else {
                j30VarQ.A();
            }
            hH.u(j30VarQ, pg2VarC, new F1(kl3Var));
            hH.u(j30VarQ, ij0Var, new LPt8Fixed(kl3Var));
            hH.u(j30VarQ, d32Var, new NUlFixed(kl3Var));
            hH.u(j30VarQ, b34Var, new YKK(kl3Var));
            hH.u(j30VarQ, j81Var4, new auxFixed(kl3Var));
            hH.u(j30VarQ, jy1Var, new T23(kl3Var));
            j30VarQ.R(true);
            j30VarQ.R(false);
            if (m24Var != null) {
                wq0.b(m24Var, strValueOf, new byN(m24Var, strValueOf, kl3Var), j30VarQ);
            }
            pg2Var5 = pg2Var4;
            j81Var5 = j81Var4;
        } else {
            qnHx = pg2.QnHx.w;
            if (i6 != 0) {
                pg2Var3 = qnHx;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i4 != 0) {
                j81Var4 = a;
            } else {
                j81Var4 = j81Var3;
            }
            Context context7 = (Context) j30VarQ.E(Ll.b);
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = new PRnFixed();
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            PRnFixed pRn7 = (PRnFixed) objB0;
            j30VarQ.e(-492369756);
            objB1 = j30VarQ.b0();
            if (objB1 == c0132QnHx) {
                objB1 = new mm2();
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            mm2 mm2Var7 = (mm2) objB1;
            pg2VarC = f30.c(j30VarQ, c94.a(pg2Var3.y(f30.a(qnHx, wo1.a, new nm2(pRn7, mm2Var7))), true, FJCM.w));
            ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1Var = (jy1) j30VarQ.E(r40.k);
            l40 l40VarR6 = fp1.r0(j30VarQ);
            m24Var = (m24) j30VarQ.E(o24.a);
            strValueOf = String.valueOf(j30VarQ.L);
            j30VarQ.e(-492369756);
            objB2 = j30VarQ.b0();
            if (objB2 == c0132QnHx) {
                objB2 = new kl3();
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            kl3Var = (kl3) objB2;
            d32Var = (d32) j30VarQ.E(Ll.d);
            b34Var = (b34) j30VarQ.E(Ll.e);
            pg2Var4 = pg2Var3;
            cQf = new CQf(context7, l40VarR6, mm2Var7, j81Var, m24Var, strValueOf, kl3Var);
            j30VarQ.e(1886828752);
            if (!(j30VarQ.a instanceof id5)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.v0();
            if (j30VarQ.K) {
                j30VarQ.l(new QnHx(cQf));
            } else {
                j30VarQ.A();
            }
            hH.u(j30VarQ, pg2VarC, new F1(kl3Var));
            hH.u(j30VarQ, ij0Var, new LPt8Fixed(kl3Var));
            hH.u(j30VarQ, d32Var, new NUlFixed(kl3Var));
            hH.u(j30VarQ, b34Var, new YKK(kl3Var));
            hH.u(j30VarQ, j81Var4, new auxFixed(kl3Var));
            hH.u(j30VarQ, jy1Var, new T23(kl3Var));
            j30VarQ.R(true);
            j30VarQ.R(false);
            if (m24Var != null) {
                wq0.b(m24Var, strValueOf, new byN(m24Var, strValueOf, kl3Var), j30VarQ);
            }
            pg2Var5 = pg2Var4;
            j81Var5 = j81Var4;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new EQ(j81Var, pg2Var5, j81Var5, i, i2);
    }
}

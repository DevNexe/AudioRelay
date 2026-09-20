package defpackage;

import com.google.android.gms.ads.AdRequest;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pc0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class CQf<T> extends cx1 implements j81<T, T> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final T invoke(T t) {
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class F1<T> extends cx1 implements j81<T, Boolean> {
        public final /* synthetic */ t95<T> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(t95<T> t95Var) {
            super(1);
            this.w = t95Var;
        }

        @Override // defpackage.j81
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(!ur1.a(obj, this.w.d()));
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ y81<T, g30, Integer, sd5> A;
        public final /* synthetic */ t95<T> w;
        public final /* synthetic */ int x;
        public final /* synthetic */ lx0<Float> y;
        public final /* synthetic */ T z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(t95<T> t95Var, int i, lx0<Float> lx0Var, T t, y81<? super T, ? super g30, ? super Integer, sd5> y81Var) {
            super(2);
            this.w = t95Var;
            this.x = i;
            this.y = lx0Var;
            this.z = t;
            this.A = y81Var;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                sc0 sc0Var = new sc0(this.y);
                int i = this.x;
                int i2 = i & 14;
                g30Var2.e(-1338768149);
                qb5 qb5Var = mg5.a;
                int i3 = i2 & 14;
                int i4 = i2 << 3;
                int i5 = (i4 & 57344) | i3 | (i4 & 896) | (i4 & 7168);
                g30Var2.e(-142660079);
                t95<T> t95Var = this.w;
                Object objB = t95Var.b();
                g30Var2.e(-438678252);
                T t = this.z;
                float f = ur1.a(objB, t) ? 1.0f : 0.0f;
                g30Var2.G();
                Float fValueOf = Float.valueOf(f);
                Object objD = t95Var.d();
                g30Var2.e(-438678252);
                float f2 = ur1.a(objD, t) ? 1.0f : 0.0f;
                g30Var2.G();
                t95.LPt8Fixed lPt8B = da5.b(t95Var, fValueOf, Float.valueOf(f2), sc0Var.invoke(t95Var.c(), g30Var2, Integer.valueOf((i5 >> 3) & 112)), qb5Var, "FloatAnimation", g30Var2);
                g30Var2.G();
                g30Var2.G();
                g30Var2.e(1157296644);
                boolean zI = g30Var2.I(lPt8B);
                Object objF = g30Var2.f();
                if (zI || objF == g30.QnHx.a) {
                    objF = new rc0(lPt8B);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                wo1.QnHx qnHx = wo1.a;
                cb cbVar = new cb((j81) objF);
                g30Var2.e(-1990474327);
                rb2 rb2VarC = fe.c(One.QnHx.a, false, g30Var2);
                g30Var2.e(1376089335);
                ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                jy1 jy1Var = (jy1) g30Var2.E(r40.k);
                a30.e.getClass();
                yy1.QnHx qnHx2 = a30.QnHx.b;
                sz szVarJ = S12N.j(cbVar);
                if (!(g30Var2.v() instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                g30Var2.s();
                if (g30Var2.m()) {
                    g30Var2.l(qnHx2);
                } else {
                    g30Var2.A();
                }
                g30Var2.u();
                hH.u(g30Var2, rb2VarC, a30.QnHx.e);
                hH.u(g30Var2, ij0Var, a30.QnHx.d);
                hH.u(g30Var2, jy1Var, a30.QnHx.f);
                g30Var2.h();
                qc0.c(0, szVarJ, new mm4(g30Var2), g30Var2, 2058660585, -1253629305);
                g30Var2.e(-222715758);
                this.A.invoke(t, g30Var2, Integer.valueOf((i >> 9) & 112));
                g30Var2.G();
                g30Var2.G();
                g30Var2.G();
                g30Var2.H();
                g30Var2.G();
                g30Var2.G();
            }
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ y81<T, g30, Integer, sd5> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;
        public final /* synthetic */ t95<T> w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ lx0<Float> y;
        public final /* synthetic */ j81<T, Object> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NUlFixed(t95<T> t95Var, pg2 pg2Var, lx0<Float> lx0Var, j81<? super T, ? extends Object> j81Var, y81<? super T, ? super g30, ? super Integer, sd5> y81Var, int i, int i2) {
            super(2);
            this.w = t95Var;
            this.x = pg2Var;
            this.y = lx0Var;
            this.z = j81Var;
            this.A = y81Var;
            this.B = i;
            this.C = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            pc0.a(this.w, this.x, this.y, this.z, this.A, g30Var, this.B | 1, this.C);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ T w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ lx0<Float> y;
        public final /* synthetic */ y81<T, g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(T t, pg2 pg2Var, lx0<Float> lx0Var, y81<? super T, ? super g30, ? super Integer, sd5> y81Var, int i, int i2) {
            super(2);
            this.w = t;
            this.x = pg2Var;
            this.y = lx0Var;
            this.z = y81Var;
            this.A = i;
            this.B = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            pc0.b(this.w, this.x, this.y, this.z, g30Var, this.A | 1, this.B);
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0200  */
    /* JADX WARN: Code duplicated, block: B:103:0x0207  */
    /* JADX WARN: Code duplicated, block: B:104:0x020b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0249  */
    /* JADX WARN: Code duplicated, block: B:111:0x0255  */
    /* JADX WARN: Code duplicated, block: B:113:0x0267  */
    /* JADX WARN: Code duplicated, block: B:117:0x0272  */
    /* JADX WARN: Code duplicated, block: B:119:0x0279  */
    /* JADX WARN: Code duplicated, block: B:122:0x0291  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:133:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0178 A[EDGE_INSN: B:134:0x0178->B:93:0x0178 BREAK  A[LOOP:0: B:86:0x0153->B:91:0x0174], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x0108  */
    /* JADX WARN: Code duplicated, block: B:80:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x012e  */
    /* JADX WARN: Code duplicated, block: B:85:0x014e  */
    /* JADX WARN: Code duplicated, block: B:88:0x015d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0174 A[LOOP:0: B:86:0x0153->B:91:0x0174, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x017a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0182  */
    /* JADX WARN: Code duplicated, block: B:98:0x0194 A[LOOP:1: B:97:0x0192->B:98:0x0194, LOOP_END] */
    public static final <T> void a(t95<T> t95Var, pg2 pg2Var, lx0<Float> lx0Var, j81<? super T, ? extends Object> j81Var, y81<? super T, ? super g30, ? super Integer, sd5> y81Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        int i4;
        int i5;
        j81<? super T, ? extends Object> j81Var2;
        int i6;
        int i7;
        int i8;
        pg2 pg2Var3;
        lx0<Float> lx0VarE;
        Object objB0;
        g30.QnHx.C0132QnHx c0132QnHx;
        Object obj;
        wp4 wp4Var;
        Object objB1;
        Map map;
        int i9;
        rb2 rb2VarC;
        ij0 ij0Var;
        jy1 jy1Var;
        yy1.QnHx qnHx;
        sz szVarJ;
        int i10;
        int size;
        int i11;
        x81 x81Var;
        boolean z;
        j81<? super T, ? extends Object> j81Var3;
        pg2 pg2Var4;
        lx0<Float> lx0Var2;
        ListIterator<T> listIterator;
        int i12;
        ps4 ps4Var;
        int size2;
        int i13;
        boolean zI;
        Object objB2;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(679005231);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(t95Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 1;
        if (i14 == 0) {
            if ((i & 112) == 0) {
                pg2Var2 = pg2Var;
                i3 |= j30VarQ.I(pg2Var2) ? 32 : 16;
            }
            i4 = i2 & 2;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 7168) == 0) {
                    j81Var2 = j81Var;
                    if (j30VarQ.I(j81Var2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i2 & 8) != 0) {
                    if ((57344 & i) == 0) {
                        if (j30VarQ.I(y81Var)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i3;
                    if (i4 != 2 && (46811 & i8) == 9362 && j30VarQ.t()) {
                        j30VarQ.x();
                        pg2Var4 = pg2Var2;
                        j81Var3 = j81Var2;
                        lx0Var2 = lx0Var;
                    } else {
                        if (i14 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i4 != 0) {
                            lx0VarE = hH.E(0, 0, null, 7);
                        } else {
                            lx0VarE = lx0Var;
                        }
                        if (i5 != 0) {
                            j81Var2 = CQf.w;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        obj = objB0;
                        if (objB0 == c0132QnHx) {
                            wp4 wp4Var2 = new wp4();
                            wp4Var2.add(t95Var.b());
                            sd5 sd5Var = sd5.a;
                            j30VarQ.F0(wp4Var2);
                            obj = wp4Var2;
                        }
                        j30VarQ.R(false);
                        wp4Var = (wp4) obj;
                        j30VarQ.e(-492369756);
                        objB1 = j30VarQ.b0();
                        if (objB1 == c0132QnHx) {
                            objB1 = new LinkedHashMap();
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        map = (Map) objB1;
                        j30VarQ.e(-1621449801);
                        if (ur1.a(t95Var.b(), t95Var.d()) && (wp4Var.size() != 1 || !ur1.a(wp4Var.get(0), t95Var.d()))) {
                            j30VarQ.e(1157296644);
                            zI = j30VarQ.I(t95Var);
                            objB2 = j30VarQ.b0();
                            if (zI || objB2 == c0132QnHx) {
                                objB2 = new F1(t95Var);
                                j30VarQ.F0(objB2);
                            }
                            j30VarQ.R(false);
                            su.z0((j81) objB2, wp4Var);
                            map.clear();
                        }
                        j30VarQ.R(false);
                        if (!map.containsKey(t95Var.d())) {
                            listIterator = wp4Var.listIterator();
                            i12 = 0;
                            while (true) {
                                ps4Var = (ps4) listIterator;
                                if (!ps4Var.hasNext()) {
                                    i12 = -1;
                                    break;
                                } else if (ur1.a(j81Var2.invoke((Object) ps4Var.next()), j81Var2.invoke(t95Var.d()))) {
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                            if (i12 == -1) {
                                wp4Var.add(t95Var.d());
                            } else {
                                wp4Var.set(i12, t95Var.d());
                            }
                            map.clear();
                            i13 = 0;
                            for (size2 = wp4Var.size(); i13 < size2; size2 = size2) {
                                Object obj2 = wp4Var.get(i13);
                                map.put(obj2, X.m(j30VarQ, -1426421288, new LPt8Fixed(t95Var, i8, lx0VarE, obj2, y81Var)));
                                i13++;
                            }
                        }
                        i9 = (i8 >> 3) & 14;
                        j30VarQ.e(-1990474327);
                        rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                        j30VarQ.e(1376089335);
                        ij0Var = (ij0) j30VarQ.E(r40.e);
                        jy1Var = (jy1) j30VarQ.E(r40.k);
                        a30.e.getClass();
                        qnHx = a30.QnHx.b;
                        szVarJ = S12N.j(pg2Var3);
                        i10 = (((i9 << 3) & 112) << 9) & 7168;
                        if (!(j30VarQ.a instanceof jE)) {
                            fp1.c0();
                            throw null;
                        }
                        j30VarQ.s();
                        if (j30VarQ.K) {
                            j30VarQ.l(qnHx);
                        } else {
                            j30VarQ.A();
                        }
                        j30VarQ.x = false;
                        hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                        hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                        hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                        j30VarQ.h();
                        szVarJ.invoke(new mm4(j30VarQ), j30VarQ, Integer.valueOf((i10 >> 3) & 112));
                        j30VarQ.e(2058660585);
                        j30VarQ.e(-1253629305);
                        if (((((i10 >> 9) & 14) & 11) ^ 2) == 0 || !j30VarQ.t()) {
                            j30VarQ.e(1930908853);
                            if (((((i9 >> 6) & 112) | 6) & 81) == 16 || !j30VarQ.t()) {
                                size = wp4Var.size();
                                for (i11 = 0; i11 < size; i11++) {
                                    Object obj3 = wp4Var.get(i11);
                                    j30VarQ.r(-450541954, j81Var2.invoke(obj3));
                                    x81Var = (x81) map.get(obj3);
                                    if (x81Var != null) {
                                        x81Var.invoke(j30VarQ, 0);
                                        sd5 sd5Var2 = sd5.a;
                                    }
                                    j30VarQ.R(false);
                                }
                            } else {
                                j30VarQ.x();
                            }
                            z = false;
                            j30VarQ.R(false);
                        } else {
                            j30VarQ.x();
                            z = false;
                        }
                        O.g(j30VarQ, z, z, true, z);
                        j30VarQ.R(z);
                        j81Var3 = j81Var2;
                        pg2Var4 = pg2Var3;
                        lx0Var2 = lx0VarE;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new NUlFixed(t95Var, pg2Var4, lx0Var2, j81Var3, y81Var, i, i2);
                }
                i3 |= 24576;
                i8 = i3;
                if (i4 != 2) {
                    if (i14 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        lx0VarE = hH.E(0, 0, null, 7);
                    } else {
                        lx0VarE = lx0Var;
                    }
                    if (i5 != 0) {
                        j81Var2 = CQf.w;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    obj = objB0;
                    if (objB0 == c0132QnHx) {
                        wp4 wp4Var3 = new wp4();
                        wp4Var3.add(t95Var.b());
                        sd5 sd5Var3 = sd5.a;
                        j30VarQ.F0(wp4Var3);
                        obj = wp4Var3;
                    }
                    j30VarQ.R(false);
                    wp4Var = (wp4) obj;
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    if (objB1 == c0132QnHx) {
                        objB1 = new LinkedHashMap();
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    map = (Map) objB1;
                    j30VarQ.e(-1621449801);
                    if (ur1.a(t95Var.b(), t95Var.d())) {
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(t95Var);
                        objB2 = j30VarQ.b0();
                        if (zI) {
                            objB2 = new F1(t95Var);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new F1(t95Var);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        su.z0((j81) objB2, wp4Var);
                        map.clear();
                    }
                    j30VarQ.R(false);
                    if (!map.containsKey(t95Var.d())) {
                        listIterator = wp4Var.listIterator();
                        i12 = 0;
                        while (true) {
                            ps4Var = (ps4) listIterator;
                            if (!ps4Var.hasNext()) {
                                i12 = -1;
                                break;
                            } else {
                                if (ur1.a(j81Var2.invoke((Object) ps4Var.next()), j81Var2.invoke(t95Var.d()))) {
                                    break;
                                    break;
                                }
                                i12++;
                            }
                        }
                        if (i12 == -1) {
                            wp4Var.add(t95Var.d());
                        } else {
                            wp4Var.set(i12, t95Var.d());
                        }
                        map.clear();
                        i13 = 0;
                        while (i13 < size2) {
                            Object obj4 = wp4Var.get(i13);
                            map.put(obj4, X.m(j30VarQ, -1426421288, new LPt8Fixed(t95Var, i8, lx0VarE, obj4, y81Var)));
                            i13++;
                        }
                    }
                    i9 = (i8 >> 3) & 14;
                    j30VarQ.e(-1990474327);
                    rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                    j30VarQ.e(1376089335);
                    ij0Var = (ij0) j30VarQ.E(r40.e);
                    jy1Var = (jy1) j30VarQ.E(r40.k);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2Var3);
                    i10 = (((i9 << 3) & 112) << 9) & 7168;
                    if (!(j30VarQ.a instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                    hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                    hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                    j30VarQ.h();
                    szVarJ.invoke(new mm4(j30VarQ), j30VarQ, Integer.valueOf((i10 >> 3) & 112));
                    j30VarQ.e(2058660585);
                    j30VarQ.e(-1253629305);
                    if (((((i10 >> 9) & 14) & 11) ^ 2) == 0) {
                        j30VarQ.e(1930908853);
                        if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj5 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj5));
                                x81Var = (x81) map.get(obj5);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var4 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        } else {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj6 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj6));
                                x81Var = (x81) map.get(obj6);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var5 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        }
                        z = false;
                        j30VarQ.R(false);
                    } else {
                        j30VarQ.e(1930908853);
                        if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj7 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj7));
                                x81Var = (x81) map.get(obj7);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var6 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        } else {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj8 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj8));
                                x81Var = (x81) map.get(obj8);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var7 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        }
                        z = false;
                        j30VarQ.R(false);
                    }
                    O.g(j30VarQ, z, z, true, z);
                    j30VarQ.R(z);
                    j81Var3 = j81Var2;
                    pg2Var4 = pg2Var3;
                    lx0Var2 = lx0VarE;
                } else {
                    if (i14 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        lx0VarE = hH.E(0, 0, null, 7);
                    } else {
                        lx0VarE = lx0Var;
                    }
                    if (i5 != 0) {
                        j81Var2 = CQf.w;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    obj = objB0;
                    if (objB0 == c0132QnHx) {
                        wp4 wp4Var4 = new wp4();
                        wp4Var4.add(t95Var.b());
                        sd5 sd5Var8 = sd5.a;
                        j30VarQ.F0(wp4Var4);
                        obj = wp4Var4;
                    }
                    j30VarQ.R(false);
                    wp4Var = (wp4) obj;
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    if (objB1 == c0132QnHx) {
                        objB1 = new LinkedHashMap();
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    map = (Map) objB1;
                    j30VarQ.e(-1621449801);
                    if (ur1.a(t95Var.b(), t95Var.d())) {
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(t95Var);
                        objB2 = j30VarQ.b0();
                        if (zI) {
                            objB2 = new F1(t95Var);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new F1(t95Var);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        su.z0((j81) objB2, wp4Var);
                        map.clear();
                    }
                    j30VarQ.R(false);
                    if (!map.containsKey(t95Var.d())) {
                        listIterator = wp4Var.listIterator();
                        i12 = 0;
                        while (true) {
                            ps4Var = (ps4) listIterator;
                            if (!ps4Var.hasNext()) {
                                i12 = -1;
                                break;
                            } else {
                                if (ur1.a(j81Var2.invoke((Object) ps4Var.next()), j81Var2.invoke(t95Var.d()))) {
                                    break;
                                    break;
                                }
                                i12++;
                            }
                        }
                        if (i12 == -1) {
                            wp4Var.add(t95Var.d());
                        } else {
                            wp4Var.set(i12, t95Var.d());
                        }
                        map.clear();
                        i13 = 0;
                        while (i13 < size2) {
                            Object obj9 = wp4Var.get(i13);
                            map.put(obj9, X.m(j30VarQ, -1426421288, new LPt8Fixed(t95Var, i8, lx0VarE, obj9, y81Var)));
                            i13++;
                        }
                    }
                    i9 = (i8 >> 3) & 14;
                    j30VarQ.e(-1990474327);
                    rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                    j30VarQ.e(1376089335);
                    ij0Var = (ij0) j30VarQ.E(r40.e);
                    jy1Var = (jy1) j30VarQ.E(r40.k);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2Var3);
                    i10 = (((i9 << 3) & 112) << 9) & 7168;
                    if (!(j30VarQ.a instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                    hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                    hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                    j30VarQ.h();
                    szVarJ.invoke(new mm4(j30VarQ), j30VarQ, Integer.valueOf((i10 >> 3) & 112));
                    j30VarQ.e(2058660585);
                    j30VarQ.e(-1253629305);
                    if (((((i10 >> 9) & 14) & 11) ^ 2) == 0) {
                        j30VarQ.e(1930908853);
                        if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj10 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj10));
                                x81Var = (x81) map.get(obj10);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var9 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        } else {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj11 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj11));
                                x81Var = (x81) map.get(obj11);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var10 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        }
                        z = false;
                        j30VarQ.R(false);
                    } else {
                        j30VarQ.e(1930908853);
                        if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj12 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj12));
                                x81Var = (x81) map.get(obj12);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var11 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        } else {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj13 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj13));
                                x81Var = (x81) map.get(obj13);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var12 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        }
                        z = false;
                        j30VarQ.R(false);
                    }
                    O.g(j30VarQ, z, z, true, z);
                    j30VarQ.R(z);
                    j81Var3 = j81Var2;
                    pg2Var4 = pg2Var3;
                    lx0Var2 = lx0VarE;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new NUlFixed(t95Var, pg2Var4, lx0Var2, j81Var3, y81Var, i, i2);
            }
            i3 |= 3072;
            j81Var2 = j81Var;
            if ((i2 & 8) != 0) {
                if ((57344 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if (i4 != 2) {
                    if (i14 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        lx0VarE = hH.E(0, 0, null, 7);
                    } else {
                        lx0VarE = lx0Var;
                    }
                    if (i5 != 0) {
                        j81Var2 = CQf.w;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    obj = objB0;
                    if (objB0 == c0132QnHx) {
                        wp4 wp4Var5 = new wp4();
                        wp4Var5.add(t95Var.b());
                        sd5 sd5Var13 = sd5.a;
                        j30VarQ.F0(wp4Var5);
                        obj = wp4Var5;
                    }
                    j30VarQ.R(false);
                    wp4Var = (wp4) obj;
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    if (objB1 == c0132QnHx) {
                        objB1 = new LinkedHashMap();
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    map = (Map) objB1;
                    j30VarQ.e(-1621449801);
                    if (ur1.a(t95Var.b(), t95Var.d())) {
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(t95Var);
                        objB2 = j30VarQ.b0();
                        if (zI) {
                            objB2 = new F1(t95Var);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new F1(t95Var);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        su.z0((j81) objB2, wp4Var);
                        map.clear();
                    }
                    j30VarQ.R(false);
                    if (!map.containsKey(t95Var.d())) {
                        listIterator = wp4Var.listIterator();
                        i12 = 0;
                        while (true) {
                            ps4Var = (ps4) listIterator;
                            if (!ps4Var.hasNext()) {
                                i12 = -1;
                                break;
                            } else {
                                if (ur1.a(j81Var2.invoke((Object) ps4Var.next()), j81Var2.invoke(t95Var.d()))) {
                                    break;
                                    break;
                                }
                                i12++;
                            }
                        }
                        if (i12 == -1) {
                            wp4Var.add(t95Var.d());
                        } else {
                            wp4Var.set(i12, t95Var.d());
                        }
                        map.clear();
                        i13 = 0;
                        while (i13 < size2) {
                            Object obj14 = wp4Var.get(i13);
                            map.put(obj14, X.m(j30VarQ, -1426421288, new LPt8Fixed(t95Var, i8, lx0VarE, obj14, y81Var)));
                            i13++;
                        }
                    }
                    i9 = (i8 >> 3) & 14;
                    j30VarQ.e(-1990474327);
                    rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                    j30VarQ.e(1376089335);
                    ij0Var = (ij0) j30VarQ.E(r40.e);
                    jy1Var = (jy1) j30VarQ.E(r40.k);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2Var3);
                    i10 = (((i9 << 3) & 112) << 9) & 7168;
                    if (!(j30VarQ.a instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                    hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                    hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                    j30VarQ.h();
                    szVarJ.invoke(new mm4(j30VarQ), j30VarQ, Integer.valueOf((i10 >> 3) & 112));
                    j30VarQ.e(2058660585);
                    j30VarQ.e(-1253629305);
                    if (((((i10 >> 9) & 14) & 11) ^ 2) == 0) {
                        j30VarQ.e(1930908853);
                        if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj15 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj15));
                                x81Var = (x81) map.get(obj15);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var14 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        } else {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj16 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj16));
                                x81Var = (x81) map.get(obj16);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var15 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        }
                        z = false;
                        j30VarQ.R(false);
                    } else {
                        j30VarQ.e(1930908853);
                        if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj17 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj17));
                                x81Var = (x81) map.get(obj17);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var16 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        } else {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj18 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj18));
                                x81Var = (x81) map.get(obj18);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var17 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        }
                        z = false;
                        j30VarQ.R(false);
                    }
                    O.g(j30VarQ, z, z, true, z);
                    j30VarQ.R(z);
                    j81Var3 = j81Var2;
                    pg2Var4 = pg2Var3;
                    lx0Var2 = lx0VarE;
                } else {
                    if (i14 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        lx0VarE = hH.E(0, 0, null, 7);
                    } else {
                        lx0VarE = lx0Var;
                    }
                    if (i5 != 0) {
                        j81Var2 = CQf.w;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    obj = objB0;
                    if (objB0 == c0132QnHx) {
                        wp4 wp4Var6 = new wp4();
                        wp4Var6.add(t95Var.b());
                        sd5 sd5Var18 = sd5.a;
                        j30VarQ.F0(wp4Var6);
                        obj = wp4Var6;
                    }
                    j30VarQ.R(false);
                    wp4Var = (wp4) obj;
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    if (objB1 == c0132QnHx) {
                        objB1 = new LinkedHashMap();
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    map = (Map) objB1;
                    j30VarQ.e(-1621449801);
                    if (ur1.a(t95Var.b(), t95Var.d())) {
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(t95Var);
                        objB2 = j30VarQ.b0();
                        if (zI) {
                            objB2 = new F1(t95Var);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new F1(t95Var);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        su.z0((j81) objB2, wp4Var);
                        map.clear();
                    }
                    j30VarQ.R(false);
                    if (!map.containsKey(t95Var.d())) {
                        listIterator = wp4Var.listIterator();
                        i12 = 0;
                        while (true) {
                            ps4Var = (ps4) listIterator;
                            if (!ps4Var.hasNext()) {
                                i12 = -1;
                                break;
                            } else {
                                if (ur1.a(j81Var2.invoke((Object) ps4Var.next()), j81Var2.invoke(t95Var.d()))) {
                                    break;
                                    break;
                                }
                                i12++;
                            }
                        }
                        if (i12 == -1) {
                            wp4Var.add(t95Var.d());
                        } else {
                            wp4Var.set(i12, t95Var.d());
                        }
                        map.clear();
                        i13 = 0;
                        while (i13 < size2) {
                            Object obj19 = wp4Var.get(i13);
                            map.put(obj19, X.m(j30VarQ, -1426421288, new LPt8Fixed(t95Var, i8, lx0VarE, obj19, y81Var)));
                            i13++;
                        }
                    }
                    i9 = (i8 >> 3) & 14;
                    j30VarQ.e(-1990474327);
                    rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                    j30VarQ.e(1376089335);
                    ij0Var = (ij0) j30VarQ.E(r40.e);
                    jy1Var = (jy1) j30VarQ.E(r40.k);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2Var3);
                    i10 = (((i9 << 3) & 112) << 9) & 7168;
                    if (!(j30VarQ.a instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                    hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                    hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                    j30VarQ.h();
                    szVarJ.invoke(new mm4(j30VarQ), j30VarQ, Integer.valueOf((i10 >> 3) & 112));
                    j30VarQ.e(2058660585);
                    j30VarQ.e(-1253629305);
                    if (((((i10 >> 9) & 14) & 11) ^ 2) == 0) {
                        j30VarQ.e(1930908853);
                        if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj110 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj110));
                                x81Var = (x81) map.get(obj110);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var19 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        } else {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj111 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj111));
                                x81Var = (x81) map.get(obj111);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var110 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        }
                        z = false;
                        j30VarQ.R(false);
                    } else {
                        j30VarQ.e(1930908853);
                        if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj112 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj112));
                                x81Var = (x81) map.get(obj112);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var111 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        } else {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj113 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj113));
                                x81Var = (x81) map.get(obj113);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var112 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        }
                        z = false;
                        j30VarQ.R(false);
                    }
                    O.g(j30VarQ, z, z, true, z);
                    j30VarQ.R(z);
                    j81Var3 = j81Var2;
                    pg2Var4 = pg2Var3;
                    lx0Var2 = lx0VarE;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new NUlFixed(t95Var, pg2Var4, lx0Var2, j81Var3, y81Var, i, i2);
            }
            i3 |= 24576;
            i8 = i3;
            if (i4 != 2) {
                if (i14 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    lx0VarE = hH.E(0, 0, null, 7);
                } else {
                    lx0VarE = lx0Var;
                }
                if (i5 != 0) {
                    j81Var2 = CQf.w;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                obj = objB0;
                if (objB0 == c0132QnHx) {
                    wp4 wp4Var7 = new wp4();
                    wp4Var7.add(t95Var.b());
                    sd5 sd5Var113 = sd5.a;
                    j30VarQ.F0(wp4Var7);
                    obj = wp4Var7;
                }
                j30VarQ.R(false);
                wp4Var = (wp4) obj;
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                if (objB1 == c0132QnHx) {
                    objB1 = new LinkedHashMap();
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                map = (Map) objB1;
                j30VarQ.e(-1621449801);
                if (ur1.a(t95Var.b(), t95Var.d())) {
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(t95Var);
                    objB2 = j30VarQ.b0();
                    if (zI) {
                        objB2 = new F1(t95Var);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new F1(t95Var);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    su.z0((j81) objB2, wp4Var);
                    map.clear();
                }
                j30VarQ.R(false);
                if (!map.containsKey(t95Var.d())) {
                    listIterator = wp4Var.listIterator();
                    i12 = 0;
                    while (true) {
                        ps4Var = (ps4) listIterator;
                        if (!ps4Var.hasNext()) {
                            i12 = -1;
                            break;
                        } else {
                            if (ur1.a(j81Var2.invoke((Object) ps4Var.next()), j81Var2.invoke(t95Var.d()))) {
                                break;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (i12 == -1) {
                        wp4Var.add(t95Var.d());
                    } else {
                        wp4Var.set(i12, t95Var.d());
                    }
                    map.clear();
                    i13 = 0;
                    while (i13 < size2) {
                        Object obj114 = wp4Var.get(i13);
                        map.put(obj114, X.m(j30VarQ, -1426421288, new LPt8Fixed(t95Var, i8, lx0VarE, obj114, y81Var)));
                        i13++;
                    }
                }
                i9 = (i8 >> 3) & 14;
                j30VarQ.e(-1990474327);
                rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                j30VarQ.e(1376089335);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2Var3);
                i10 = (((i9 << 3) & 112) << 9) & 7168;
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                j30VarQ.h();
                szVarJ.invoke(new mm4(j30VarQ), j30VarQ, Integer.valueOf((i10 >> 3) & 112));
                j30VarQ.e(2058660585);
                j30VarQ.e(-1253629305);
                if (((((i10 >> 9) & 14) & 11) ^ 2) == 0) {
                    j30VarQ.e(1930908853);
                    if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj115 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj115));
                            x81Var = (x81) map.get(obj115);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var114 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    } else {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj116 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj116));
                            x81Var = (x81) map.get(obj116);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var115 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    }
                    z = false;
                    j30VarQ.R(false);
                } else {
                    j30VarQ.e(1930908853);
                    if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj117 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj117));
                            x81Var = (x81) map.get(obj117);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var116 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    } else {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj118 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj118));
                            x81Var = (x81) map.get(obj118);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var117 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    }
                    z = false;
                    j30VarQ.R(false);
                }
                O.g(j30VarQ, z, z, true, z);
                j30VarQ.R(z);
                j81Var3 = j81Var2;
                pg2Var4 = pg2Var3;
                lx0Var2 = lx0VarE;
            } else {
                if (i14 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    lx0VarE = hH.E(0, 0, null, 7);
                } else {
                    lx0VarE = lx0Var;
                }
                if (i5 != 0) {
                    j81Var2 = CQf.w;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                obj = objB0;
                if (objB0 == c0132QnHx) {
                    wp4 wp4Var8 = new wp4();
                    wp4Var8.add(t95Var.b());
                    sd5 sd5Var118 = sd5.a;
                    j30VarQ.F0(wp4Var8);
                    obj = wp4Var8;
                }
                j30VarQ.R(false);
                wp4Var = (wp4) obj;
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                if (objB1 == c0132QnHx) {
                    objB1 = new LinkedHashMap();
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                map = (Map) objB1;
                j30VarQ.e(-1621449801);
                if (ur1.a(t95Var.b(), t95Var.d())) {
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(t95Var);
                    objB2 = j30VarQ.b0();
                    if (zI) {
                        objB2 = new F1(t95Var);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new F1(t95Var);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    su.z0((j81) objB2, wp4Var);
                    map.clear();
                }
                j30VarQ.R(false);
                if (!map.containsKey(t95Var.d())) {
                    listIterator = wp4Var.listIterator();
                    i12 = 0;
                    while (true) {
                        ps4Var = (ps4) listIterator;
                        if (!ps4Var.hasNext()) {
                            i12 = -1;
                            break;
                        } else {
                            if (ur1.a(j81Var2.invoke((Object) ps4Var.next()), j81Var2.invoke(t95Var.d()))) {
                                break;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (i12 == -1) {
                        wp4Var.add(t95Var.d());
                    } else {
                        wp4Var.set(i12, t95Var.d());
                    }
                    map.clear();
                    i13 = 0;
                    while (i13 < size2) {
                        Object obj119 = wp4Var.get(i13);
                        map.put(obj119, X.m(j30VarQ, -1426421288, new LPt8Fixed(t95Var, i8, lx0VarE, obj119, y81Var)));
                        i13++;
                    }
                }
                i9 = (i8 >> 3) & 14;
                j30VarQ.e(-1990474327);
                rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                j30VarQ.e(1376089335);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2Var3);
                i10 = (((i9 << 3) & 112) << 9) & 7168;
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                j30VarQ.h();
                szVarJ.invoke(new mm4(j30VarQ), j30VarQ, Integer.valueOf((i10 >> 3) & 112));
                j30VarQ.e(2058660585);
                j30VarQ.e(-1253629305);
                if (((((i10 >> 9) & 14) & 11) ^ 2) == 0) {
                    j30VarQ.e(1930908853);
                    if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj1110 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj1110));
                            x81Var = (x81) map.get(obj1110);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var119 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    } else {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj1111 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj1111));
                            x81Var = (x81) map.get(obj1111);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var1110 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    }
                    z = false;
                    j30VarQ.R(false);
                } else {
                    j30VarQ.e(1930908853);
                    if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj1112 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj1112));
                            x81Var = (x81) map.get(obj1112);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var1111 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    } else {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj1113 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj1113));
                            x81Var = (x81) map.get(obj1113);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var1112 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    }
                    z = false;
                    j30VarQ.R(false);
                }
                O.g(j30VarQ, z, z, true, z);
                j30VarQ.R(z);
                j81Var3 = j81Var2;
                pg2Var4 = pg2Var3;
                lx0Var2 = lx0VarE;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new NUlFixed(t95Var, pg2Var4, lx0Var2, j81Var3, y81Var, i, i2);
        }
        i3 |= 48;
        pg2Var2 = pg2Var;
        i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 128;
        }
        i5 = i2 & 4;
        if (i5 != 0) {
            if ((i & 7168) == 0) {
                j81Var2 = j81Var;
                if (j30VarQ.I(j81Var2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i2 & 8) != 0) {
                if ((57344 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if (i4 != 2) {
                    if (i14 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        lx0VarE = hH.E(0, 0, null, 7);
                    } else {
                        lx0VarE = lx0Var;
                    }
                    if (i5 != 0) {
                        j81Var2 = CQf.w;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    obj = objB0;
                    if (objB0 == c0132QnHx) {
                        wp4 wp4Var9 = new wp4();
                        wp4Var9.add(t95Var.b());
                        sd5 sd5Var1113 = sd5.a;
                        j30VarQ.F0(wp4Var9);
                        obj = wp4Var9;
                    }
                    j30VarQ.R(false);
                    wp4Var = (wp4) obj;
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    if (objB1 == c0132QnHx) {
                        objB1 = new LinkedHashMap();
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    map = (Map) objB1;
                    j30VarQ.e(-1621449801);
                    if (ur1.a(t95Var.b(), t95Var.d())) {
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(t95Var);
                        objB2 = j30VarQ.b0();
                        if (zI) {
                            objB2 = new F1(t95Var);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new F1(t95Var);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        su.z0((j81) objB2, wp4Var);
                        map.clear();
                    }
                    j30VarQ.R(false);
                    if (!map.containsKey(t95Var.d())) {
                        listIterator = wp4Var.listIterator();
                        i12 = 0;
                        while (true) {
                            ps4Var = (ps4) listIterator;
                            if (!ps4Var.hasNext()) {
                                i12 = -1;
                                break;
                            } else {
                                if (ur1.a(j81Var2.invoke((Object) ps4Var.next()), j81Var2.invoke(t95Var.d()))) {
                                    break;
                                    break;
                                }
                                i12++;
                            }
                        }
                        if (i12 == -1) {
                            wp4Var.add(t95Var.d());
                        } else {
                            wp4Var.set(i12, t95Var.d());
                        }
                        map.clear();
                        i13 = 0;
                        while (i13 < size2) {
                            Object obj1114 = wp4Var.get(i13);
                            map.put(obj1114, X.m(j30VarQ, -1426421288, new LPt8Fixed(t95Var, i8, lx0VarE, obj1114, y81Var)));
                            i13++;
                        }
                    }
                    i9 = (i8 >> 3) & 14;
                    j30VarQ.e(-1990474327);
                    rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                    j30VarQ.e(1376089335);
                    ij0Var = (ij0) j30VarQ.E(r40.e);
                    jy1Var = (jy1) j30VarQ.E(r40.k);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2Var3);
                    i10 = (((i9 << 3) & 112) << 9) & 7168;
                    if (!(j30VarQ.a instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                    hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                    hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                    j30VarQ.h();
                    szVarJ.invoke(new mm4(j30VarQ), j30VarQ, Integer.valueOf((i10 >> 3) & 112));
                    j30VarQ.e(2058660585);
                    j30VarQ.e(-1253629305);
                    if (((((i10 >> 9) & 14) & 11) ^ 2) == 0) {
                        j30VarQ.e(1930908853);
                        if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj1115 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj1115));
                                x81Var = (x81) map.get(obj1115);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var1114 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        } else {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj1116 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj1116));
                                x81Var = (x81) map.get(obj1116);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var1115 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        }
                        z = false;
                        j30VarQ.R(false);
                    } else {
                        j30VarQ.e(1930908853);
                        if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj1117 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj1117));
                                x81Var = (x81) map.get(obj1117);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var1116 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        } else {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj1118 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj1118));
                                x81Var = (x81) map.get(obj1118);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var1117 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        }
                        z = false;
                        j30VarQ.R(false);
                    }
                    O.g(j30VarQ, z, z, true, z);
                    j30VarQ.R(z);
                    j81Var3 = j81Var2;
                    pg2Var4 = pg2Var3;
                    lx0Var2 = lx0VarE;
                } else {
                    if (i14 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        lx0VarE = hH.E(0, 0, null, 7);
                    } else {
                        lx0VarE = lx0Var;
                    }
                    if (i5 != 0) {
                        j81Var2 = CQf.w;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    obj = objB0;
                    if (objB0 == c0132QnHx) {
                        wp4 wp4Var10 = new wp4();
                        wp4Var10.add(t95Var.b());
                        sd5 sd5Var1118 = sd5.a;
                        j30VarQ.F0(wp4Var10);
                        obj = wp4Var10;
                    }
                    j30VarQ.R(false);
                    wp4Var = (wp4) obj;
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    if (objB1 == c0132QnHx) {
                        objB1 = new LinkedHashMap();
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    map = (Map) objB1;
                    j30VarQ.e(-1621449801);
                    if (ur1.a(t95Var.b(), t95Var.d())) {
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(t95Var);
                        objB2 = j30VarQ.b0();
                        if (zI) {
                            objB2 = new F1(t95Var);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new F1(t95Var);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        su.z0((j81) objB2, wp4Var);
                        map.clear();
                    }
                    j30VarQ.R(false);
                    if (!map.containsKey(t95Var.d())) {
                        listIterator = wp4Var.listIterator();
                        i12 = 0;
                        while (true) {
                            ps4Var = (ps4) listIterator;
                            if (!ps4Var.hasNext()) {
                                i12 = -1;
                                break;
                            } else {
                                if (ur1.a(j81Var2.invoke((Object) ps4Var.next()), j81Var2.invoke(t95Var.d()))) {
                                    break;
                                    break;
                                }
                                i12++;
                            }
                        }
                        if (i12 == -1) {
                            wp4Var.add(t95Var.d());
                        } else {
                            wp4Var.set(i12, t95Var.d());
                        }
                        map.clear();
                        i13 = 0;
                        while (i13 < size2) {
                            Object obj1119 = wp4Var.get(i13);
                            map.put(obj1119, X.m(j30VarQ, -1426421288, new LPt8Fixed(t95Var, i8, lx0VarE, obj1119, y81Var)));
                            i13++;
                        }
                    }
                    i9 = (i8 >> 3) & 14;
                    j30VarQ.e(-1990474327);
                    rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                    j30VarQ.e(1376089335);
                    ij0Var = (ij0) j30VarQ.E(r40.e);
                    jy1Var = (jy1) j30VarQ.E(r40.k);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2Var3);
                    i10 = (((i9 << 3) & 112) << 9) & 7168;
                    if (!(j30VarQ.a instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                    hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                    hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                    j30VarQ.h();
                    szVarJ.invoke(new mm4(j30VarQ), j30VarQ, Integer.valueOf((i10 >> 3) & 112));
                    j30VarQ.e(2058660585);
                    j30VarQ.e(-1253629305);
                    if (((((i10 >> 9) & 14) & 11) ^ 2) == 0) {
                        j30VarQ.e(1930908853);
                        if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj11110 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj11110));
                                x81Var = (x81) map.get(obj11110);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var1119 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        } else {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj11111 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj11111));
                                x81Var = (x81) map.get(obj11111);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var11110 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        }
                        z = false;
                        j30VarQ.R(false);
                    } else {
                        j30VarQ.e(1930908853);
                        if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj11112 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj11112));
                                x81Var = (x81) map.get(obj11112);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var11111 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        } else {
                            size = wp4Var.size();
                            while (i11 < size) {
                                Object obj11113 = wp4Var.get(i11);
                                j30VarQ.r(-450541954, j81Var2.invoke(obj11113));
                                x81Var = (x81) map.get(obj11113);
                                if (x81Var != null) {
                                    x81Var.invoke(j30VarQ, 0);
                                    sd5 sd5Var11112 = sd5.a;
                                }
                                j30VarQ.R(false);
                            }
                        }
                        z = false;
                        j30VarQ.R(false);
                    }
                    O.g(j30VarQ, z, z, true, z);
                    j30VarQ.R(z);
                    j81Var3 = j81Var2;
                    pg2Var4 = pg2Var3;
                    lx0Var2 = lx0VarE;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new NUlFixed(t95Var, pg2Var4, lx0Var2, j81Var3, y81Var, i, i2);
            }
            i3 |= 24576;
            i8 = i3;
            if (i4 != 2) {
                if (i14 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    lx0VarE = hH.E(0, 0, null, 7);
                } else {
                    lx0VarE = lx0Var;
                }
                if (i5 != 0) {
                    j81Var2 = CQf.w;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                obj = objB0;
                if (objB0 == c0132QnHx) {
                    wp4 wp4Var11 = new wp4();
                    wp4Var11.add(t95Var.b());
                    sd5 sd5Var11113 = sd5.a;
                    j30VarQ.F0(wp4Var11);
                    obj = wp4Var11;
                }
                j30VarQ.R(false);
                wp4Var = (wp4) obj;
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                if (objB1 == c0132QnHx) {
                    objB1 = new LinkedHashMap();
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                map = (Map) objB1;
                j30VarQ.e(-1621449801);
                if (ur1.a(t95Var.b(), t95Var.d())) {
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(t95Var);
                    objB2 = j30VarQ.b0();
                    if (zI) {
                        objB2 = new F1(t95Var);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new F1(t95Var);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    su.z0((j81) objB2, wp4Var);
                    map.clear();
                }
                j30VarQ.R(false);
                if (!map.containsKey(t95Var.d())) {
                    listIterator = wp4Var.listIterator();
                    i12 = 0;
                    while (true) {
                        ps4Var = (ps4) listIterator;
                        if (!ps4Var.hasNext()) {
                            i12 = -1;
                            break;
                        } else {
                            if (ur1.a(j81Var2.invoke((Object) ps4Var.next()), j81Var2.invoke(t95Var.d()))) {
                                break;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (i12 == -1) {
                        wp4Var.add(t95Var.d());
                    } else {
                        wp4Var.set(i12, t95Var.d());
                    }
                    map.clear();
                    i13 = 0;
                    while (i13 < size2) {
                        Object obj11114 = wp4Var.get(i13);
                        map.put(obj11114, X.m(j30VarQ, -1426421288, new LPt8Fixed(t95Var, i8, lx0VarE, obj11114, y81Var)));
                        i13++;
                    }
                }
                i9 = (i8 >> 3) & 14;
                j30VarQ.e(-1990474327);
                rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                j30VarQ.e(1376089335);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2Var3);
                i10 = (((i9 << 3) & 112) << 9) & 7168;
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                j30VarQ.h();
                szVarJ.invoke(new mm4(j30VarQ), j30VarQ, Integer.valueOf((i10 >> 3) & 112));
                j30VarQ.e(2058660585);
                j30VarQ.e(-1253629305);
                if (((((i10 >> 9) & 14) & 11) ^ 2) == 0) {
                    j30VarQ.e(1930908853);
                    if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj11115 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj11115));
                            x81Var = (x81) map.get(obj11115);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var11114 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    } else {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj11116 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj11116));
                            x81Var = (x81) map.get(obj11116);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var11115 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    }
                    z = false;
                    j30VarQ.R(false);
                } else {
                    j30VarQ.e(1930908853);
                    if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj11117 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj11117));
                            x81Var = (x81) map.get(obj11117);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var11116 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    } else {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj11118 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj11118));
                            x81Var = (x81) map.get(obj11118);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var11117 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    }
                    z = false;
                    j30VarQ.R(false);
                }
                O.g(j30VarQ, z, z, true, z);
                j30VarQ.R(z);
                j81Var3 = j81Var2;
                pg2Var4 = pg2Var3;
                lx0Var2 = lx0VarE;
            } else {
                if (i14 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    lx0VarE = hH.E(0, 0, null, 7);
                } else {
                    lx0VarE = lx0Var;
                }
                if (i5 != 0) {
                    j81Var2 = CQf.w;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                obj = objB0;
                if (objB0 == c0132QnHx) {
                    wp4 wp4Var12 = new wp4();
                    wp4Var12.add(t95Var.b());
                    sd5 sd5Var11118 = sd5.a;
                    j30VarQ.F0(wp4Var12);
                    obj = wp4Var12;
                }
                j30VarQ.R(false);
                wp4Var = (wp4) obj;
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                if (objB1 == c0132QnHx) {
                    objB1 = new LinkedHashMap();
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                map = (Map) objB1;
                j30VarQ.e(-1621449801);
                if (ur1.a(t95Var.b(), t95Var.d())) {
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(t95Var);
                    objB2 = j30VarQ.b0();
                    if (zI) {
                        objB2 = new F1(t95Var);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new F1(t95Var);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    su.z0((j81) objB2, wp4Var);
                    map.clear();
                }
                j30VarQ.R(false);
                if (!map.containsKey(t95Var.d())) {
                    listIterator = wp4Var.listIterator();
                    i12 = 0;
                    while (true) {
                        ps4Var = (ps4) listIterator;
                        if (!ps4Var.hasNext()) {
                            i12 = -1;
                            break;
                        } else {
                            if (ur1.a(j81Var2.invoke((Object) ps4Var.next()), j81Var2.invoke(t95Var.d()))) {
                                break;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (i12 == -1) {
                        wp4Var.add(t95Var.d());
                    } else {
                        wp4Var.set(i12, t95Var.d());
                    }
                    map.clear();
                    i13 = 0;
                    while (i13 < size2) {
                        Object obj11119 = wp4Var.get(i13);
                        map.put(obj11119, X.m(j30VarQ, -1426421288, new LPt8Fixed(t95Var, i8, lx0VarE, obj11119, y81Var)));
                        i13++;
                    }
                }
                i9 = (i8 >> 3) & 14;
                j30VarQ.e(-1990474327);
                rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                j30VarQ.e(1376089335);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2Var3);
                i10 = (((i9 << 3) & 112) << 9) & 7168;
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                j30VarQ.h();
                szVarJ.invoke(new mm4(j30VarQ), j30VarQ, Integer.valueOf((i10 >> 3) & 112));
                j30VarQ.e(2058660585);
                j30VarQ.e(-1253629305);
                if (((((i10 >> 9) & 14) & 11) ^ 2) == 0) {
                    j30VarQ.e(1930908853);
                    if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj111110 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj111110));
                            x81Var = (x81) map.get(obj111110);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var11119 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    } else {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj111111 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj111111));
                            x81Var = (x81) map.get(obj111111);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var111110 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    }
                    z = false;
                    j30VarQ.R(false);
                } else {
                    j30VarQ.e(1930908853);
                    if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj111112 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj111112));
                            x81Var = (x81) map.get(obj111112);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var111111 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    } else {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj111113 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj111113));
                            x81Var = (x81) map.get(obj111113);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var111112 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    }
                    z = false;
                    j30VarQ.R(false);
                }
                O.g(j30VarQ, z, z, true, z);
                j30VarQ.R(z);
                j81Var3 = j81Var2;
                pg2Var4 = pg2Var3;
                lx0Var2 = lx0VarE;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new NUlFixed(t95Var, pg2Var4, lx0Var2, j81Var3, y81Var, i, i2);
        }
        i3 |= 3072;
        j81Var2 = j81Var;
        if ((i2 & 8) != 0) {
            if ((57344 & i) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i3;
            if (i4 != 2) {
                if (i14 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    lx0VarE = hH.E(0, 0, null, 7);
                } else {
                    lx0VarE = lx0Var;
                }
                if (i5 != 0) {
                    j81Var2 = CQf.w;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                obj = objB0;
                if (objB0 == c0132QnHx) {
                    wp4 wp4Var13 = new wp4();
                    wp4Var13.add(t95Var.b());
                    sd5 sd5Var111113 = sd5.a;
                    j30VarQ.F0(wp4Var13);
                    obj = wp4Var13;
                }
                j30VarQ.R(false);
                wp4Var = (wp4) obj;
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                if (objB1 == c0132QnHx) {
                    objB1 = new LinkedHashMap();
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                map = (Map) objB1;
                j30VarQ.e(-1621449801);
                if (ur1.a(t95Var.b(), t95Var.d())) {
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(t95Var);
                    objB2 = j30VarQ.b0();
                    if (zI) {
                        objB2 = new F1(t95Var);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new F1(t95Var);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    su.z0((j81) objB2, wp4Var);
                    map.clear();
                }
                j30VarQ.R(false);
                if (!map.containsKey(t95Var.d())) {
                    listIterator = wp4Var.listIterator();
                    i12 = 0;
                    while (true) {
                        ps4Var = (ps4) listIterator;
                        if (!ps4Var.hasNext()) {
                            i12 = -1;
                            break;
                        } else {
                            if (ur1.a(j81Var2.invoke((Object) ps4Var.next()), j81Var2.invoke(t95Var.d()))) {
                                break;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (i12 == -1) {
                        wp4Var.add(t95Var.d());
                    } else {
                        wp4Var.set(i12, t95Var.d());
                    }
                    map.clear();
                    i13 = 0;
                    while (i13 < size2) {
                        Object obj111114 = wp4Var.get(i13);
                        map.put(obj111114, X.m(j30VarQ, -1426421288, new LPt8Fixed(t95Var, i8, lx0VarE, obj111114, y81Var)));
                        i13++;
                    }
                }
                i9 = (i8 >> 3) & 14;
                j30VarQ.e(-1990474327);
                rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                j30VarQ.e(1376089335);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2Var3);
                i10 = (((i9 << 3) & 112) << 9) & 7168;
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                j30VarQ.h();
                szVarJ.invoke(new mm4(j30VarQ), j30VarQ, Integer.valueOf((i10 >> 3) & 112));
                j30VarQ.e(2058660585);
                j30VarQ.e(-1253629305);
                if (((((i10 >> 9) & 14) & 11) ^ 2) == 0) {
                    j30VarQ.e(1930908853);
                    if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj111115 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj111115));
                            x81Var = (x81) map.get(obj111115);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var111114 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    } else {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj111116 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj111116));
                            x81Var = (x81) map.get(obj111116);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var111115 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    }
                    z = false;
                    j30VarQ.R(false);
                } else {
                    j30VarQ.e(1930908853);
                    if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj111117 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj111117));
                            x81Var = (x81) map.get(obj111117);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var111116 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    } else {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj111118 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj111118));
                            x81Var = (x81) map.get(obj111118);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var111117 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    }
                    z = false;
                    j30VarQ.R(false);
                }
                O.g(j30VarQ, z, z, true, z);
                j30VarQ.R(z);
                j81Var3 = j81Var2;
                pg2Var4 = pg2Var3;
                lx0Var2 = lx0VarE;
            } else {
                if (i14 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    lx0VarE = hH.E(0, 0, null, 7);
                } else {
                    lx0VarE = lx0Var;
                }
                if (i5 != 0) {
                    j81Var2 = CQf.w;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                obj = objB0;
                if (objB0 == c0132QnHx) {
                    wp4 wp4Var14 = new wp4();
                    wp4Var14.add(t95Var.b());
                    sd5 sd5Var111118 = sd5.a;
                    j30VarQ.F0(wp4Var14);
                    obj = wp4Var14;
                }
                j30VarQ.R(false);
                wp4Var = (wp4) obj;
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                if (objB1 == c0132QnHx) {
                    objB1 = new LinkedHashMap();
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                map = (Map) objB1;
                j30VarQ.e(-1621449801);
                if (ur1.a(t95Var.b(), t95Var.d())) {
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(t95Var);
                    objB2 = j30VarQ.b0();
                    if (zI) {
                        objB2 = new F1(t95Var);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new F1(t95Var);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    su.z0((j81) objB2, wp4Var);
                    map.clear();
                }
                j30VarQ.R(false);
                if (!map.containsKey(t95Var.d())) {
                    listIterator = wp4Var.listIterator();
                    i12 = 0;
                    while (true) {
                        ps4Var = (ps4) listIterator;
                        if (!ps4Var.hasNext()) {
                            i12 = -1;
                            break;
                        } else {
                            if (ur1.a(j81Var2.invoke((Object) ps4Var.next()), j81Var2.invoke(t95Var.d()))) {
                                break;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (i12 == -1) {
                        wp4Var.add(t95Var.d());
                    } else {
                        wp4Var.set(i12, t95Var.d());
                    }
                    map.clear();
                    i13 = 0;
                    while (i13 < size2) {
                        Object obj111119 = wp4Var.get(i13);
                        map.put(obj111119, X.m(j30VarQ, -1426421288, new LPt8Fixed(t95Var, i8, lx0VarE, obj111119, y81Var)));
                        i13++;
                    }
                }
                i9 = (i8 >> 3) & 14;
                j30VarQ.e(-1990474327);
                rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                j30VarQ.e(1376089335);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2Var3);
                i10 = (((i9 << 3) & 112) << 9) & 7168;
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                j30VarQ.h();
                szVarJ.invoke(new mm4(j30VarQ), j30VarQ, Integer.valueOf((i10 >> 3) & 112));
                j30VarQ.e(2058660585);
                j30VarQ.e(-1253629305);
                if (((((i10 >> 9) & 14) & 11) ^ 2) == 0) {
                    j30VarQ.e(1930908853);
                    if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj1111110 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj1111110));
                            x81Var = (x81) map.get(obj1111110);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var111119 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    } else {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj1111111 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj1111111));
                            x81Var = (x81) map.get(obj1111111);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var1111110 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    }
                    z = false;
                    j30VarQ.R(false);
                } else {
                    j30VarQ.e(1930908853);
                    if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj1111112 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj1111112));
                            x81Var = (x81) map.get(obj1111112);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var1111111 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    } else {
                        size = wp4Var.size();
                        while (i11 < size) {
                            Object obj1111113 = wp4Var.get(i11);
                            j30VarQ.r(-450541954, j81Var2.invoke(obj1111113));
                            x81Var = (x81) map.get(obj1111113);
                            if (x81Var != null) {
                                x81Var.invoke(j30VarQ, 0);
                                sd5 sd5Var1111112 = sd5.a;
                            }
                            j30VarQ.R(false);
                        }
                    }
                    z = false;
                    j30VarQ.R(false);
                }
                O.g(j30VarQ, z, z, true, z);
                j30VarQ.R(z);
                j81Var3 = j81Var2;
                pg2Var4 = pg2Var3;
                lx0Var2 = lx0VarE;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new NUlFixed(t95Var, pg2Var4, lx0Var2, j81Var3, y81Var, i, i2);
        }
        i3 |= 24576;
        i8 = i3;
        if (i4 != 2) {
            if (i14 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i4 != 0) {
                lx0VarE = hH.E(0, 0, null, 7);
            } else {
                lx0VarE = lx0Var;
            }
            if (i5 != 0) {
                j81Var2 = CQf.w;
            }
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            obj = objB0;
            if (objB0 == c0132QnHx) {
                wp4 wp4Var15 = new wp4();
                wp4Var15.add(t95Var.b());
                sd5 sd5Var1111113 = sd5.a;
                j30VarQ.F0(wp4Var15);
                obj = wp4Var15;
            }
            j30VarQ.R(false);
            wp4Var = (wp4) obj;
            j30VarQ.e(-492369756);
            objB1 = j30VarQ.b0();
            if (objB1 == c0132QnHx) {
                objB1 = new LinkedHashMap();
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            map = (Map) objB1;
            j30VarQ.e(-1621449801);
            if (ur1.a(t95Var.b(), t95Var.d())) {
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(t95Var);
                objB2 = j30VarQ.b0();
                if (zI) {
                    objB2 = new F1(t95Var);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new F1(t95Var);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                su.z0((j81) objB2, wp4Var);
                map.clear();
            }
            j30VarQ.R(false);
            if (!map.containsKey(t95Var.d())) {
                listIterator = wp4Var.listIterator();
                i12 = 0;
                while (true) {
                    ps4Var = (ps4) listIterator;
                    if (!ps4Var.hasNext()) {
                        i12 = -1;
                        break;
                    } else {
                        if (ur1.a(j81Var2.invoke((Object) ps4Var.next()), j81Var2.invoke(t95Var.d()))) {
                            break;
                            break;
                        }
                        i12++;
                    }
                }
                if (i12 == -1) {
                    wp4Var.add(t95Var.d());
                } else {
                    wp4Var.set(i12, t95Var.d());
                }
                map.clear();
                i13 = 0;
                while (i13 < size2) {
                    Object obj1111114 = wp4Var.get(i13);
                    map.put(obj1111114, X.m(j30VarQ, -1426421288, new LPt8Fixed(t95Var, i8, lx0VarE, obj1111114, y81Var)));
                    i13++;
                }
            }
            i9 = (i8 >> 3) & 14;
            j30VarQ.e(-1990474327);
            rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
            j30VarQ.e(1376089335);
            ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1Var = (jy1) j30VarQ.E(r40.k);
            a30.e.getClass();
            qnHx = a30.QnHx.b;
            szVarJ = S12N.j(pg2Var3);
            i10 = (((i9 << 3) & 112) << 9) & 7168;
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            j30VarQ.h();
            szVarJ.invoke(new mm4(j30VarQ), j30VarQ, Integer.valueOf((i10 >> 3) & 112));
            j30VarQ.e(2058660585);
            j30VarQ.e(-1253629305);
            if (((((i10 >> 9) & 14) & 11) ^ 2) == 0) {
                j30VarQ.e(1930908853);
                if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                    size = wp4Var.size();
                    while (i11 < size) {
                        Object obj1111115 = wp4Var.get(i11);
                        j30VarQ.r(-450541954, j81Var2.invoke(obj1111115));
                        x81Var = (x81) map.get(obj1111115);
                        if (x81Var != null) {
                            x81Var.invoke(j30VarQ, 0);
                            sd5 sd5Var1111114 = sd5.a;
                        }
                        j30VarQ.R(false);
                    }
                } else {
                    size = wp4Var.size();
                    while (i11 < size) {
                        Object obj1111116 = wp4Var.get(i11);
                        j30VarQ.r(-450541954, j81Var2.invoke(obj1111116));
                        x81Var = (x81) map.get(obj1111116);
                        if (x81Var != null) {
                            x81Var.invoke(j30VarQ, 0);
                            sd5 sd5Var1111115 = sd5.a;
                        }
                        j30VarQ.R(false);
                    }
                }
                z = false;
                j30VarQ.R(false);
            } else {
                j30VarQ.e(1930908853);
                if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                    size = wp4Var.size();
                    while (i11 < size) {
                        Object obj1111117 = wp4Var.get(i11);
                        j30VarQ.r(-450541954, j81Var2.invoke(obj1111117));
                        x81Var = (x81) map.get(obj1111117);
                        if (x81Var != null) {
                            x81Var.invoke(j30VarQ, 0);
                            sd5 sd5Var1111116 = sd5.a;
                        }
                        j30VarQ.R(false);
                    }
                } else {
                    size = wp4Var.size();
                    while (i11 < size) {
                        Object obj1111118 = wp4Var.get(i11);
                        j30VarQ.r(-450541954, j81Var2.invoke(obj1111118));
                        x81Var = (x81) map.get(obj1111118);
                        if (x81Var != null) {
                            x81Var.invoke(j30VarQ, 0);
                            sd5 sd5Var1111117 = sd5.a;
                        }
                        j30VarQ.R(false);
                    }
                }
                z = false;
                j30VarQ.R(false);
            }
            O.g(j30VarQ, z, z, true, z);
            j30VarQ.R(z);
            j81Var3 = j81Var2;
            pg2Var4 = pg2Var3;
            lx0Var2 = lx0VarE;
        } else {
            if (i14 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i4 != 0) {
                lx0VarE = hH.E(0, 0, null, 7);
            } else {
                lx0VarE = lx0Var;
            }
            if (i5 != 0) {
                j81Var2 = CQf.w;
            }
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            obj = objB0;
            if (objB0 == c0132QnHx) {
                wp4 wp4Var16 = new wp4();
                wp4Var16.add(t95Var.b());
                sd5 sd5Var1111118 = sd5.a;
                j30VarQ.F0(wp4Var16);
                obj = wp4Var16;
            }
            j30VarQ.R(false);
            wp4Var = (wp4) obj;
            j30VarQ.e(-492369756);
            objB1 = j30VarQ.b0();
            if (objB1 == c0132QnHx) {
                objB1 = new LinkedHashMap();
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            map = (Map) objB1;
            j30VarQ.e(-1621449801);
            if (ur1.a(t95Var.b(), t95Var.d())) {
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(t95Var);
                objB2 = j30VarQ.b0();
                if (zI) {
                    objB2 = new F1(t95Var);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new F1(t95Var);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                su.z0((j81) objB2, wp4Var);
                map.clear();
            }
            j30VarQ.R(false);
            if (!map.containsKey(t95Var.d())) {
                listIterator = wp4Var.listIterator();
                i12 = 0;
                while (true) {
                    ps4Var = (ps4) listIterator;
                    if (!ps4Var.hasNext()) {
                        i12 = -1;
                        break;
                    } else {
                        if (ur1.a(j81Var2.invoke((Object) ps4Var.next()), j81Var2.invoke(t95Var.d()))) {
                            break;
                            break;
                        }
                        i12++;
                    }
                }
                if (i12 == -1) {
                    wp4Var.add(t95Var.d());
                } else {
                    wp4Var.set(i12, t95Var.d());
                }
                map.clear();
                i13 = 0;
                while (i13 < size2) {
                    Object obj1111119 = wp4Var.get(i13);
                    map.put(obj1111119, X.m(j30VarQ, -1426421288, new LPt8Fixed(t95Var, i8, lx0VarE, obj1111119, y81Var)));
                    i13++;
                }
            }
            i9 = (i8 >> 3) & 14;
            j30VarQ.e(-1990474327);
            rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
            j30VarQ.e(1376089335);
            ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1Var = (jy1) j30VarQ.E(r40.k);
            a30.e.getClass();
            qnHx = a30.QnHx.b;
            szVarJ = S12N.j(pg2Var3);
            i10 = (((i9 << 3) & 112) << 9) & 7168;
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            j30VarQ.h();
            szVarJ.invoke(new mm4(j30VarQ), j30VarQ, Integer.valueOf((i10 >> 3) & 112));
            j30VarQ.e(2058660585);
            j30VarQ.e(-1253629305);
            if (((((i10 >> 9) & 14) & 11) ^ 2) == 0) {
                j30VarQ.e(1930908853);
                if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                    size = wp4Var.size();
                    while (i11 < size) {
                        Object obj11111110 = wp4Var.get(i11);
                        j30VarQ.r(-450541954, j81Var2.invoke(obj11111110));
                        x81Var = (x81) map.get(obj11111110);
                        if (x81Var != null) {
                            x81Var.invoke(j30VarQ, 0);
                            sd5 sd5Var1111119 = sd5.a;
                        }
                        j30VarQ.R(false);
                    }
                } else {
                    size = wp4Var.size();
                    while (i11 < size) {
                        Object obj11111111 = wp4Var.get(i11);
                        j30VarQ.r(-450541954, j81Var2.invoke(obj11111111));
                        x81Var = (x81) map.get(obj11111111);
                        if (x81Var != null) {
                            x81Var.invoke(j30VarQ, 0);
                            sd5 sd5Var11111110 = sd5.a;
                        }
                        j30VarQ.R(false);
                    }
                }
                z = false;
                j30VarQ.R(false);
            } else {
                j30VarQ.e(1930908853);
                if (((((i9 >> 6) & 112) | 6) & 81) == 16) {
                    size = wp4Var.size();
                    while (i11 < size) {
                        Object obj11111112 = wp4Var.get(i11);
                        j30VarQ.r(-450541954, j81Var2.invoke(obj11111112));
                        x81Var = (x81) map.get(obj11111112);
                        if (x81Var != null) {
                            x81Var.invoke(j30VarQ, 0);
                            sd5 sd5Var11111111 = sd5.a;
                        }
                        j30VarQ.R(false);
                    }
                } else {
                    size = wp4Var.size();
                    while (i11 < size) {
                        Object obj11111113 = wp4Var.get(i11);
                        j30VarQ.r(-450541954, j81Var2.invoke(obj11111113));
                        x81Var = (x81) map.get(obj11111113);
                        if (x81Var != null) {
                            x81Var.invoke(j30VarQ, 0);
                            sd5 sd5Var11111112 = sd5.a;
                        }
                        j30VarQ.R(false);
                    }
                }
                z = false;
                j30VarQ.R(false);
            }
            O.g(j30VarQ, z, z, true, z);
            j30VarQ.R(z);
            j81Var3 = j81Var2;
            pg2Var4 = pg2Var3;
            lx0Var2 = lx0VarE;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(t95Var, pg2Var4, lx0Var2, j81Var3, y81Var, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final <T> void b(T t, pg2 pg2Var, lx0<Float> lx0Var, y81<? super T, ? super g30, ? super Integer, sd5> y81Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        int i4;
        int i5;
        pg2 pg2Var3;
        lx0<Float> lx0VarE;
        pg2 pg2Var4;
        lx0<Float> lx0Var2;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(523603005);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(t) ? 4 : 2) | i;
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
                i3 |= 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if (i4 != 4 && (i3 & 5851) == 1170 && j30VarQ.t()) {
                j30VarQ.x();
                lx0Var2 = lx0Var;
                pg2Var4 = pg2Var2;
            } else {
                if (i6 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    lx0VarE = hH.E(0, 0, null, 7);
                } else {
                    lx0VarE = lx0Var;
                }
                a(da5.c(t, null, j30VarQ, (i3 & 8) | (i3 & 14), 2), pg2Var3, lx0VarE, null, y81Var, j30VarQ, (i3 & 112) | AdRequest.MAX_CONTENT_URL_LENGTH | ((i3 << 3) & 57344), 4);
                pg2Var4 = pg2Var3;
                lx0Var2 = lx0VarE;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new QnHx(t, pg2Var4, lx0Var2, y81Var, i, i2);
        }
        i3 |= 48;
        pg2Var2 = pg2Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (j30VarQ.I(y81Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if (i4 != 4) {
            if (i6 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i4 != 0) {
                lx0VarE = hH.E(0, 0, null, 7);
            } else {
                lx0VarE = lx0Var;
            }
            a(da5.c(t, null, j30VarQ, (i3 & 8) | (i3 & 14), 2), pg2Var3, lx0VarE, null, y81Var, j30VarQ, (i3 & 112) | AdRequest.MAX_CONTENT_URL_LENGTH | ((i3 << 3) & 57344), 4);
            pg2Var4 = pg2Var3;
            lx0Var2 = lx0VarE;
        } else {
            if (i6 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i4 != 0) {
                lx0VarE = hH.E(0, 0, null, 7);
            } else {
                lx0VarE = lx0Var;
            }
            a(da5.c(t, null, j30VarQ, (i3 & 8) | (i3 & 14), 2), pg2Var3, lx0VarE, null, y81Var, j30VarQ, (i3 & 112) | AdRequest.MAX_CONTENT_URL_LENGTH | ((i3 << 3) & 57344), 4);
            pg2Var4 = pg2Var3;
            lx0Var2 = lx0VarE;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(t, pg2Var4, lx0Var2, y81Var, i, i2);
    }
}

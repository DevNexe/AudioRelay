package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class aw4 {
    public final cw4 a;
    public gz1 b;
    public final LPt8Fixed c;
    public final CQf d;
    public final F1 e;

    public static final class CQf extends cx1 implements x81<yy1, l40, sd5> {
        public CQf() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(yy1 yy1Var, l40 l40Var) {
            aw4.this.a().b = l40Var;
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<yy1, x81<? super bw4, ? super g70, ? extends sb2>, sd5> {
        public F1() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(yy1 yy1Var, x81<? super bw4, ? super g70, ? extends sb2> x81Var) {
            gz1 gz1VarA = aw4.this.a();
            yy1Var.b(new hz1(gz1VarA, x81Var, gz1VarA.l));
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<yy1, aw4, sd5> {
        public LPt8Fixed() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(yy1 yy1Var, aw4 aw4Var) {
            yy1 yy1Var2 = yy1Var;
            gz1 gz1Var = yy1Var2.b0;
            aw4 aw4Var2 = aw4.this;
            if (gz1Var == null) {
                gz1Var = new gz1(yy1Var2, aw4Var2.a);
                yy1Var2.b0 = gz1Var;
            }
            aw4Var2.b = gz1Var;
            aw4Var2.a().b();
            gz1 gz1VarA = aw4Var2.a();
            cw4 cw4Var = gz1VarA.c;
            cw4 cw4Var2 = aw4Var2.a;
            if (cw4Var != cw4Var2) {
                gz1VarA.c = cw4Var2;
                gz1VarA.a(0);
            }
            return sd5.a;
        }
    }

    public interface QnHx {
        void a();

        int b();

        void c(int i, long j);
    }

    public aw4(cw4 cw4Var) {
        this.a = cw4Var;
        this.c = new LPt8Fixed();
        this.d = new CQf();
        this.e = new F1();
    }

    public final gz1 a() {
        gz1 gz1Var = this.b;
        if (gz1Var != null) {
            return gz1Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final iz1 b(Object obj, x81 x81Var) {
        gz1 gz1VarA = a();
        gz1VarA.b();
        if (!gz1VarA.f.containsKey(obj)) {
            LinkedHashMap linkedHashMap = gz1VarA.h;
            Object objD = linkedHashMap.get(obj);
            if (objD == null) {
                objD = gz1VarA.d(obj);
                yy1 yy1Var = gz1VarA.a;
                if (objD != null) {
                    int iIndexOf = ((ui2.QnHx) yy1Var.r()).indexOf(objD);
                    int i = ((ui2.QnHx) yy1Var.r()).w.y;
                    yy1Var.G = true;
                    yy1Var.I(iIndexOf, i, 1);
                    yy1Var.G = false;
                    gz1VarA.k++;
                } else {
                    int i2 = ((ui2.QnHx) yy1Var.r()).w.y;
                    yy1 yy1Var2 = new yy1(true);
                    yy1Var.G = true;
                    yy1Var.z(i2, yy1Var2);
                    yy1Var.G = false;
                    gz1VarA.k++;
                    objD = yy1Var2;
                }
                linkedHashMap.put(obj, objD);
            }
            gz1VarA.c((yy1) objD, obj, x81Var);
        }
        return new iz1(gz1VarA, obj);
    }

    public aw4() {
        this(o70.A);
    }
}

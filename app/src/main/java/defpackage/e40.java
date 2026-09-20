package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e40 {
    public static final CQf a = CQf.w;
    public static final LPt8Fixed b = LPt8Fixed.w;
    public static final QnHx c = QnHx.w;
    public static final NUlFixed d = NUlFixed.w;
    public static final F1 e = F1.w;
    public static final gv2 f = new gv2("provider");
    public static final gv2 g = new gv2("provider");
    public static final gv2 h = new gv2("compositionLocalMap");
    public static final gv2 i = new gv2("providerValues");
    public static final gv2 j = new gv2("providers");
    public static final gv2 k = new gv2("reference");

    public static final class CQf extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public static final CQf w = new CQf();

        public CQf() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            e40.e(mn4Var, xl3Var);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public static final F1 w = new F1();

        public F1() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            mn4 mn4Var2 = mn4Var;
            if (!(mn4Var2.m == 0)) {
                e40.c("Cannot reset when inserting".toString());
                throw null;
            }
            mn4Var2.A();
            mn4Var2.r = 0;
            mn4Var2.g = (mn4Var2.b.length / 5) - mn4Var2.f;
            mn4Var2.h = 0;
            mn4Var2.i = 0;
            mn4Var2.n = 0;
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            mn4Var.G();
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public static final NUlFixed w = new NUlFixed();

        public NUlFixed() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            mn4Var.k(0);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
            mn4Var.i();
            return sd5.a;
        }
    }

    public static final void a(int i2, int i3, ArrayList arrayList) {
        int iD = d(arrayList, i2);
        if (iD < 0) {
            iD = -(iD + 1);
        }
        while (iD < arrayList.size() && ((bs1) arrayList.get(iD)).b < i3) {
            arrayList.remove(iD);
        }
    }

    public static final void b(kn4 kn4Var, ArrayList arrayList, int i2) {
        if (kn4Var.i(i2)) {
            arrayList.add(kn4Var.j(i2));
            return;
        }
        int iH = i2 + 1;
        int iH2 = kn4Var.h(i2) + i2;
        while (iH < iH2) {
            b(kn4Var, arrayList, iH);
            iH += kn4Var.h(iH);
        }
    }

    public static final void c(String str) {
        throw new IllegalStateException(("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback").toString());
    }

    public static final int d(List<bs1> list, int i2) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iB = ur1.b(list.get(i4).b, i2);
            if (iB < 0) {
                i3 = i4 + 1;
            } else {
                if (iB <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void e(mn4 mn4Var, xl3 xl3Var) {
        tk3 tk3Var;
        n40 n40Var;
        int iG = mn4Var.g(mn4Var.b, mn4Var.n(mn4Var.r));
        int[] iArr = mn4Var.b;
        int i2 = mn4Var.r;
        nn4 nn4Var = new nn4(iG, mn4Var.g(iArr, mn4Var.n(mn4Var.o(i2) + i2)), mn4Var);
        while (nn4Var.hasNext()) {
            Object next = nn4Var.next();
            if (next instanceof yl3) {
                xl3Var.a((yl3) next);
            } else if ((next instanceof tk3) && (n40Var = (tk3Var = (tk3) next).b) != null) {
                n40Var.J = true;
                tk3Var.b = null;
                tk3Var.f = null;
                tk3Var.g = null;
            }
        }
        mn4Var.B();
    }

    public static final void f(boolean z) {
        if (z) {
            return;
        }
        c("Check failed".toString());
        throw null;
    }
}

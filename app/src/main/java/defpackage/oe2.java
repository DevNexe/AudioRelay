package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class oe2 {
    public static final ry4 c = new ry4(LPt8Fixed.w);
    public static final ry4 d = new ry4(CQf.w);
    public static final ry4 e = new ry4(F1.w);
    public final int a;
    public final String b;

    public static final class CQf extends cx1 implements h81<Map<Integer, ? extends oe2>> {
        public static final CQf w = new CQf();

        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final Map<Integer, ? extends oe2> invoke() {
            List list = (List) oe2.c.getValue();
            int iA = C0239D.A(mu.w0(list, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj : list) {
                linkedHashMap.put(Integer.valueOf(((oe2) obj).a), obj);
            }
            return linkedHashMap;
        }
    }

    public static final class EQ extends oe2 {
        public static final EQ f = new EQ();

        public EQ() {
            super(6, "VOICE_RECOGNITION");
        }
    }

    public static final class F1 extends cx1 implements h81<Set<? extends Integer>> {
        public static final F1 w = new F1();

        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final Set<? extends Integer> invoke() {
            List list = (List) oe2.c.getValue();
            ArrayList arrayList = new ArrayList(mu.w0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((oe2) it.next()).a));
            }
            return wu.h1(arrayList);
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<List<? extends oe2>> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final List<? extends oe2> invoke() {
            py0 py0Var;
            py0 py0Var2;
            py0 py0Var3;
            ry4 ry4Var = oe2.c;
            x94 x94VarH0 = ba4.H0(NUlFixed.f, T23.f);
            int i = Build.VERSION.SDK_INT;
            da4 da4Var = da4.w;
            ca4 ca4Var = ca4.w;
            if (i >= 24) {
                x94 x94VarH1 = ba4.H0(x94VarH0, ba4.H0(auxFixed.f));
                if (x94VarH1 instanceof q95) {
                    q95 q95Var = (q95) x94VarH1;
                    py0Var3 = new py0(q95Var.a, q95Var.b, ca4Var);
                } else {
                    py0Var3 = new py0(x94VarH1, da4Var, ca4Var);
                }
                x94VarH0 = py0Var3;
            }
            if (i >= 29) {
                x94 x94VarH2 = ba4.H0(x94VarH0, ba4.H0(byN.f));
                if (x94VarH2 instanceof q95) {
                    q95 q95Var2 = (q95) x94VarH2;
                    py0Var2 = new py0(q95Var2.a, q95Var2.b, ca4Var);
                } else {
                    py0Var2 = new py0(x94VarH2, da4Var, ca4Var);
                }
                x94VarH0 = py0Var2;
            }
            x94 x94VarH3 = ba4.H0(x94VarH0, ba4.H0(EQ.f, QnHx.f, YKK.f));
            if (x94VarH3 instanceof q95) {
                q95 q95Var3 = (q95) x94VarH3;
                py0Var = new py0(q95Var3.a, q95Var3.b, ca4Var);
            } else {
                py0Var = new py0(x94VarH3, da4Var, ca4Var);
            }
            return na4.L0(py0Var);
        }
    }

    public static final class NUlFixed extends oe2 {
        public static final NUlFixed f = new NUlFixed();

        public NUlFixed() {
            super(0, "DEFAULT");
        }
    }

    public static final class QnHx extends oe2 {
        public static final QnHx f = new QnHx();

        public QnHx() {
            super(5, "CAMCORDER");
        }
    }

    public static final class T23 extends oe2 {
        public static final T23 f = new T23();

        public T23() {
            super(7, "VOICE_COMMUNICATION");
        }
    }

    public static final class YKK extends oe2 {
        public static final YKK f = new YKK();

        public YKK() {
            super(1, "MIC");
        }
    }

    public static final class auxFixed extends oe2 {
        public static final auxFixed f = new auxFixed();

        public auxFixed() {
            super(9, "UNPROCESSED");
        }
    }

    public static final class byN extends oe2 {
        public static final byN f = new byN();

        public byN() {
            super(10, "VOICE_PERFORMANCE");
        }
    }

    public oe2(int i, String str) {
        this.a = i;
        this.b = str;
    }
}

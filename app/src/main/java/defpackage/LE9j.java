package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class LE9j extends cx1 implements y81<A$Y4, g30, Integer, sd5> {
    public final /* synthetic */ T9r w;
    public final /* synthetic */ j81<If$, sd5> x;

    public /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[A$Y4.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LE9j(T9r t9r, j81<? super If$, sd5> j81Var, int i) {
        super(3);
        this.w = t9r;
        this.x = j81Var;
    }

    @Override // defpackage.y81
    public final sd5 invoke(A$Y4 a$y4, g30 g30Var, Integer num) {
        A$Y4 a$y5 = a$y4;
        g30 g30Var2 = g30Var;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= g30Var2.I(a$y5) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            int i = a$y5 == null ? -1 : QnHx.a[a$y5.ordinal()];
            if (i != -1) {
                g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                j81<If$, sd5> j81Var = this.x;
                T9r t9r = this.w;
                if (i == 1) {
                    g30Var2.e(-1272547760);
                    nj1<jv2> nj1Var = t9r.c;
                    if (nj1Var != null) {
                        g30Var2.e(1157296644);
                        boolean zI = g30Var2.I(j81Var);
                        Object objF = g30Var2.f();
                        if (zI || objF == c0132QnHx) {
                            objF = new AwDx(j81Var);
                            g30Var2.B(objF);
                        }
                        g30Var2.G();
                        Ix.f(nj1Var, t9r.d, (j81) objF, g30Var2, 0);
                    }
                    g30Var2.G();
                } else if (i == 2) {
                    g30Var2.e(-1272547335);
                    nj1<q1> nj1Var2 = t9r.b;
                    if (nj1Var2 != null) {
                        g30Var2.e(1157296644);
                        boolean zI2 = g30Var2.I(j81Var);
                        Object objF2 = g30Var2.f();
                        if (zI2 || objF2 == c0132QnHx) {
                            objF2 = new Ld.e(j81Var);
                            g30Var2.B(objF2);
                        }
                        g30Var2.G();
                        Ix.e(nj1Var2, t9r.d, (j81) objF2, g30Var2, 0);
                    }
                    g30Var2.G();
                } else {
                    if (i == 3) {
                        g30Var2.e(-1272546898);
                        g30Var2.G();
                        throw new IllegalStateException("The type doesn't exist".toString());
                    }
                    if (i == 4) {
                        g30Var2.e(-1272546827);
                        g30Var2.G();
                        throw new IllegalStateException("The type doesn't exist".toString());
                    }
                    g30Var2.e(-1272546738);
                    g30Var2.G();
                }
            } else {
                g30Var2.e(-1272546771);
                g30Var2.G();
            }
        }
        return sd5.a;
    }
}

package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class ml extends cx1 implements y81<wv, g30, Integer, sd5> {
    public final /* synthetic */ fb3 w;
    public final /* synthetic */ j81<za3, sd5> x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ml(fb3 fb3Var, j81<? super za3, sd5> j81Var, int i) {
        super(3);
        this.w = fb3Var;
        this.x = j81Var;
        this.y = i;
    }

    @Override // defpackage.y81
    public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 81) == 16 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            xa3 xa3Var = this.w.l;
            if (ur1.a(xa3Var, xa3.CQf.a)) {
                g30Var2.e(-122893940);
                g30Var2.G();
            } else {
                boolean z = xa3Var instanceof xa3.QnHx;
                int i = this.y;
                if (z) {
                    g30Var2.e(-122893850);
                    float f = 16;
                    wo1.QnHx qnHx = wo1.a;
                    jl.c((xa3.QnHx) xa3Var, this.x, new zx2(f, f, f, f).y(gm4.a), g30Var2, (i & 112) | 384, 0);
                    g30Var2.G();
                } else if (xa3Var instanceof xa3.F1) {
                    g30Var2.e(-122893489);
                    float f2 = 16;
                    wo1.QnHx qnHx2 = wo1.a;
                    jl.e(((xa3.F1) xa3Var).a, this.x, new zx2(f2, f2, f2, f2).y(gm4.a), g30Var2, (i & 112) | 384, 0);
                    g30Var2.G();
                } else if (xa3Var instanceof xa3.LPt8Fixed) {
                    g30Var2.e(-122893123);
                    float f3 = 16;
                    wo1.QnHx qnHx3 = wo1.a;
                    jl.f((xa3.LPt8Fixed) xa3Var, this.x, new zx2(f3, f3, f3, f3).y(gm4.a), g30Var2, (i & 112) | 384, 0);
                    g30Var2.G();
                } else if (xa3Var instanceof xa3.NUlFixed) {
                    g30Var2.e(-122892754);
                    pg2.QnHx qnHx4 = pg2.QnHx.w;
                    float f4 = 16;
                    pg2 pg2VarT = ps0.T(qnHx4, f4);
                    g30Var2.e(-483455358);
                    rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, g30Var2);
                    g30Var2.e(-1323940314);
                    ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                    jy1 jy1Var = (jy1) g30Var2.E(r40.k);
                    ti5 ti5Var = (ti5) g30Var2.E(r40.o);
                    a30.e.getClass();
                    yy1.QnHx qnHx5 = a30.QnHx.b;
                    sz szVarJ = S12N.j(pg2VarT);
                    if (!(g30Var2.v() instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    g30Var2.s();
                    if (g30Var2.m()) {
                        g30Var2.l(qnHx5);
                    } else {
                        g30Var2.A();
                    }
                    g30Var2.u();
                    hH.u(g30Var2, rb2VarA, a30.QnHx.e);
                    hH.u(g30Var2, ij0Var, a30.QnHx.d);
                    hH.u(g30Var2, jy1Var, a30.QnHx.f);
                    qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -1163856341);
                    String strX = hH.x(R.string.premium_subscription_to_lifetime_warning, g30Var2);
                    jt4 jt4Var = sc5.a;
                    w55 w55Var = ((rc5) g30Var2.E(jt4Var)).j;
                    x41 x41Var = x41.B;
                    j55.b(strX, null, 0L, 0L, null, x41Var, null, 0L, null, null, 0L, 0, false, 0, null, w55Var, g30Var2, 196608, 0, 32734);
                    hH.i(gm4.g(qnHx4, 8), g30Var2, 6);
                    j55.b(hH.x(R.string.premium_cancel_subscription_first, g30Var2), null, 0L, 0L, null, x41Var, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(jt4Var)).j, g30Var2, 196608, 0, 32734);
                    hH.i(gm4.g(qnHx4, f4), g30Var2, 6);
                    hx0 hx0Var = gm4.a;
                    j81<za3, sd5> j81Var = this.x;
                    C0239D.f(((i >> 3) & 14) | 48, 0, g30Var2, hx0Var, j81Var);
                    hH.i(gm4.g(qnHx4, f4), g30Var2, 6);
                    jl.e(((xa3.NUlFixed) xa3Var).a, j81Var, hx0Var, g30Var2, (i & 112) | 384, 0);
                    g30Var2.G();
                    g30Var2.G();
                    g30Var2.H();
                    g30Var2.G();
                    g30Var2.G();
                    g30Var2.G();
                } else {
                    g30Var2.e(-122891535);
                    g30Var2.G();
                }
            }
        }
        return sd5.a;
    }
}

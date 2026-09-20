package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wt3 extends cx1 implements j81<gl2, sd5> {
    public final /* synthetic */ xv0 w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt3(xv0 xv0Var, int i) {
        super(1);
        this.w = xv0Var;
        this.x = i;
    }

    @Override // defpackage.j81
    public final sd5 invoke(gl2 gl2Var) {
        gl2 gl2Var2 = gl2Var;
        ou3.byN byn = ou3.byN.e;
        mt3 mt3Var = mt3.w;
        jk2 jk2Var = new jk2();
        mt3Var.invoke(jk2Var);
        ik2.QnHx qnHx = jk2Var.a;
        vl2 vl2Var = qnHx.a;
        if (vl2Var == null) {
            vl2Var = vl2.b;
        }
        List listSingletonList = Collections.singletonList(new vj2(new ik2(vl2Var, qnHx.b)));
        nt3 nt3Var = nt3.w;
        zk2 zk2Var = new zk2();
        nt3Var.invoke(zk2Var);
        String str = zk2Var.b;
        if (!(str != null)) {
            throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.".toString());
        }
        yk2.QnHx qnHx2 = zk2Var.a;
        if (str != null) {
            qnHx2.a = str;
        }
        qnHx2.getClass();
        List listSingletonList2 = Collections.singletonList(new yk2(qnHx2.a, null, null));
        int i = this.x;
        xv0 xv0Var = this.w;
        XTd3.g(gl2Var2, "main?destinationId={destinationId}", listSingletonList, listSingletonList2, X.n(1421328609, new fu3(X.n(1069874322, new pt3(xv0Var, i), true)), true));
        yt3.d(gl2Var2, ou3.EQ.e, X.n(-1119601399, new qt3(xv0Var), true));
        yt3.d(gl2Var2, ou3.LPt8Fixed.e, X.n(1072912394, new rt3(xv0Var), true));
        ou3.YKK ykk = ou3.YKK.e;
        sz szVarN = X.n(1718695741, new st3(xv0Var), true);
        wk0 wk0Var = new wk0(0);
        cm2 cm2Var = gl2Var2.g;
        cm2Var.getClass();
        vk0.QnHx qnHx3 = new vk0.QnHx((vk0) cm2Var.b(cm2.QnHx.a(vk0.class)), wk0Var, szVarN);
        qnHx3.f("customBufferSizeSettings");
        gl2Var2.i.add(qnHx3);
        yt3.d(gl2Var2, ou3.auxFixed.e, X.n(-1029541109, new tt3(xv0Var), true));
        yt3.d(gl2Var2, ou3.FJCM.e, X.n(1162972684, new ut3(xv0Var), true));
        yt3.d(gl2Var2, ou3.F1.e, X.n(-939480819, new vt3(xv0Var), true));
        yt3.d(gl2Var2, ou3.QnHx.e, X.n(1253032974, new it3(xv0Var), true));
        yt3.d(gl2Var2, ou3.CQf.e, X.n(-849420529, new jt3(xv0Var), true));
        yt3.d(gl2Var2, ou3.T23.e, X.n(1343093264, new kt3(xv0Var), true));
        yt3.d(gl2Var2, ou3.PRnFixed.e, X.n(-759360239, new lt3(xv0Var), true));
        return sd5.a;
    }
}

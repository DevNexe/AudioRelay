package defpackage;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class p8 implements xr4 {
    public final in2 a;

    public p8(in2 in2Var) {
        this.a = in2Var;
    }

    @Override // defpackage.xr4
    public final qw start() {
        mz0 d24Var;
        qd qdVar = (qd) this;
        ConnectivityManager connectivityManager = (ConnectivityManager) r80.c(qdVar.b, ConnectivityManager.class);
        if (connectivityManager != null) {
            am amVar = new am(new GSUk(qdVar, connectivityManager, null), xr0.w, -2, lg.SUSPEND);
            gq0.QnHx qnHx = gq0.x;
            wz0 wz0Var = new wz0(new vNG(null), new d24(new sa0(amVar, ps0.o0(2, kq0.SECONDS), null)));
            YZ yz = new YZ(qdVar, null);
            int i = i01.a;
            d24Var = kd.G(wz0Var, new h01(yz, null));
        } else {
            a62 a62Var = a62.a;
            a62.a.g("connectivity_manager_not_found", null);
            d24Var = new d24(new aN(qdVar, null));
        }
        dr2 dr2VarD = iE.d(d24Var);
        CY cy = new CY(3);
        m91.byN byn = m91.d;
        m91.T23 t23 = m91.c;
        return new zr2(new jr2(new jr2(new hr2(new ms2(new jr2(dr2VarD, byn, cy, t23), new a14(q8.a, q8.b, q8.c, j54.c, 0))), new jG$(3), byn, t23), new J(this, 3), byn, t23));
    }
}

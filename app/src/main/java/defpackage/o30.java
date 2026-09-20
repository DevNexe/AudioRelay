package defpackage;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class o30 extends cx1 implements h81<sd5> {
    public final /* synthetic */ x81<g30, Integer, sd5> w;
    public final /* synthetic */ j30 x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o30(sz szVar, j30 j30Var, Object obj) {
        super(0);
        this.w = szVar;
        this.x = j30Var;
        this.y = obj;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        j30 j30Var = this.x;
        x81<g30, Integer, sd5> x81Var = this.w;
        if (x81Var != null) {
            j30Var.u0(RCHTTPStatusCodes.SUCCESS, e40.f);
            sb5.d(2, x81Var);
            x81Var.invoke(j30Var, 1);
            j30Var.R(false);
        } else {
            j30Var.getClass();
            if (j30Var.r.isEmpty()) {
                j30Var.l = j30Var.D.n() + j30Var.l;
            } else {
                kn4 kn4Var = j30Var.D;
                int iF = kn4Var.f();
                int i = kn4Var.f;
                int i2 = kn4Var.g;
                int[] iArr = kn4Var.b;
                Object objK = i < i2 ? kn4Var.k(iArr, i) : null;
                Object objE = kn4Var.e();
                j30Var.A0(iF, objK, objE);
                j30Var.x0(null, fp1.u(iArr, kn4Var.f));
                j30Var.h0();
                kn4Var.d();
                j30Var.B0(iF, objK, objE);
            }
        }
        return sd5.a;
    }
}

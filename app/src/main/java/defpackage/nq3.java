package defpackage;

import com.google.protobuf.FA4;

/* JADX INFO: loaded from: classes.dex */
public final class nq3 extends cx1 implements j81<ad2.CQf, sd5> {
    public final /* synthetic */ hu4 w;
    public final /* synthetic */ long x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq3(hu4 hu4Var, long j) {
        super(1);
        this.w = hu4Var;
        this.x = j;
    }

    @Override // defpackage.j81
    public final sd5 invoke(ad2.CQf cQf) {
        sq3 sq3Var;
        kp2 kp2Var;
        ad2.CQf cQf2 = cQf;
        hu4 hu4Var = this.w;
        if (hu4Var == null) {
            cQf2.M();
            FA4<kp2, kp2.CQf, Object> fa4 = cQf2.M;
            if (fa4 == null) {
                if (fa4 == null) {
                    kp2Var = cQf2.L;
                    if (kp2Var == null) {
                        kp2Var = kp2.B;
                    }
                } else {
                    kp2Var = (kp2) fa4.d();
                }
                cQf2.M = new FA4<>(kp2Var, cQf2.H(), cQf2.y);
                cQf2.L = null;
            }
            kp2.CQf cQf3 = (kp2.CQf) cQf2.M.c();
            cQf3.A = this.x;
            cQf3.M();
        } else {
            cQf2.M();
            FA4<sq3, sq3.CQf, Object> fa5 = cQf2.K;
            if (fa5 == null) {
                if (fa5 == null) {
                    sq3Var = cQf2.J;
                    if (sq3Var == null) {
                        sq3Var = sq3.B;
                    }
                } else {
                    sq3Var = (sq3) fa5.d();
                }
                cQf2.K = new FA4<>(sq3Var, cQf2.H(), cQf2.y);
                cQf2.J = null;
            }
            sq3.CQf cQf4 = (sq3.CQf) cQf2.K.c();
            cQf4.getClass();
            cQf4.A = hu4Var;
            cQf4.M();
        }
        return sd5.a;
    }
}

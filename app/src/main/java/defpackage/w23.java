package defpackage;

import com.google.protobuf.QnHx;

/* JADX INFO: loaded from: classes.dex */
public final class w23 implements fd2 {
    public final sd2 a;
    public final ad2.CQf b = ad2.w0();

    public w23(sd2 sd2Var) {
        this.a = sd2Var;
    }

    @Override // defpackage.fd2
    public final Object a(ad2 ad2Var, md2.QnHx qnHx) {
        if (!ad2Var.p0()) {
            return sd5.a;
        }
        long j = ad2Var.b0().z;
        e33.CQf cQfC = e33.B.c();
        cQfC.A = j;
        cQfC.M();
        e33 e33VarF = cQfC.f();
        if (!e33VarF.isInitialized()) {
            throw QnHx.AbstractC0099QnHx.C(e33VarF);
        }
        ad2.CQf cQf = this.b;
        cQf.getClass();
        cQf.P = e33VarF;
        cQf.M();
        Object objB = this.a.b(cQf.build(), qnHx);
        return objB == va0.COROUTINE_SUSPENDED ? objB : sd5.a;
    }
}

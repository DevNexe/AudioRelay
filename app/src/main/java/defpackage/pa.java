package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class pa implements ha {
    public final ws a;
    public final fXUx b;
    public final pf4 c;
    public final i03 d;
    public final wq2 e;

    public pa(ws wsVar, fXUx fxux, pf4 pf4Var) {
        this.a = wsVar;
        this.b = fxux;
        this.c = pf4Var;
        i03 i03Var = new i03();
        this.d = i03Var;
        vq2 vq2VarK = vq2.k(i03Var.a, i03Var.b, new la(1));
        vq2VarK.getClass();
        jr2 jr2Var = new jr2(new hr2(vq2VarK), new rq1(this, 10), m91.d, m91.c);
        mq2.c(1, "bufferSize");
        ks2.YKK ykk = new ks2.YKK();
        AtomicReference atomicReference = new AtomicReference();
        this.e = new wq2(new ks2(new ks2.T23(atomicReference, ykk), jr2Var, atomicReference, ykk));
    }

    @Override // defpackage.ha
    public final ds2 a(c54 c54Var) {
        return this.e.u(c54Var);
    }

    @Override // defpackage.ha
    public final fl4 b() {
        int i = 19;
        int i2 = 15;
        return new fl4(vk4.k(new pl4(new kl4(new kl4(c(yg3.InApp), new k71(18)), new KnU(i)), new Acr(i2)), new pl4(new kl4(new kl4(c(yg3.Subscription), new KnU(i2)), new KnU(i)), new Acr(i2)), new la(0)), new k71(i));
    }

    public final fl4 c(yg3 yg3Var) {
        na naVar = new na(this, yg3Var);
        ws wsVar = this.a;
        wsVar.getClass();
        return new fl4(new yk4(new vK0u(wsVar, 3)), new NFo7(naVar, 19));
    }
}

package defpackage;

import java.net.DatagramSocket;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m33 implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ p33 x;

    public /* synthetic */ m33(p33 p33Var, int i) {
        this.w = i;
        this.x = p33Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.i91
    public final Object apply(Object obj) {
        int i = this.w;
        int i2 = 3;
        p33 p33Var = this.x;
        switch (i) {
            case 0:
                il3 il3Var = new il3();
                vq2<R> vq2VarB = p33Var.b.B(new m33(p33Var, 1));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c54 c54Var = j54.c;
                vq2VarB.getClass();
                ss2 ss2Var = new ss2(vq2VarB, vq2.E(100L, timeUnit, c54Var));
                rq1 rq1Var = new rq1(il3Var, 16);
                m91.byN byn = m91.d;
                m91.T23 t23 = m91.c;
                jr2 jr2Var = new jr2(ss2Var, rq1Var, byn, t23);
                int i3 = 20;
                vq2 vq2VarT = vq2.t(jr2Var, new hr2(new cs2(new cs2(vq2.r(500L, 500L, timeUnit, j54.b), new Ot0r(il3Var, i3)), new KnU(24))).B(new Acr(i3)));
                gc gcVar = new gc(i2, p33Var, (DatagramSocket) obj);
                vq2VarT.getClass();
                return new jr2(vq2VarT, gcVar, byn, t23);
            default:
                xq0 xq0Var = (xq0) obj;
                if (xq0Var instanceof xq0.CQf) {
                    return (vq2) ((xq0.CQf) xq0Var).a;
                }
                if (!(xq0Var instanceof xq0.QnHx)) {
                    throw new NoWhenBranchMatchedException();
                }
                fx fxVar = new fx(new ec2(3, p33Var, (r33) ((xq0.QnHx) xq0Var).a));
                return fxVar instanceof p91 ? ((p91) fxVar).a() : new zx(fxVar);
        }
    }
}

package defpackage;

import android.media.AudioRecord;
import java.net.DatagramSocket;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hMT implements i91 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ hMT(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        int i = this.w;
        int i2 = 1;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.y;
        Object obj5 = this.x;
        switch (i) {
            case 0:
                final lfe lfeVar = (lfe) obj5;
                final MUpZ mUpZ = (MUpZ) obj4;
                final di diVar = (di) obj3;
                final j81 j81Var = (j81) obj2;
                final AudioRecord audioRecord = (AudioRecord) obj;
                return qw.e(ps0.M(new ox(kd.x(new SY(lfeVar, audioRecord, null)).c(new CY(11))), kd.x(new xv(mUpZ, null)), new uw(new px() { // from class: PEb4
                    @Override // defpackage.px
                    public final void d(uw.QnHx qnHx) {
                        AudioRecord audioRecord2 = audioRecord;
                        di diVar2 = diVar;
                        MUpZ mUpZ2 = mUpZ;
                        j81 j81Var2 = j81Var;
                        fl3 fl3Var = new fl3();
                        fl3Var.w = true;
                        bm0.m(qnHx, new av3(new yo2(fl3Var, 1)));
                        lfe lfeVar2 = lfeVar;
                        h75 h75Var = lfeVar2.c;
                        h75Var.k();
                        h75Var.c(-16, new xno(lfeVar2, audioRecord2, diVar2, mUpZ2, j81Var2, qnHx, fl3Var));
                    }
                }).i(j54.c)));
            default:
                ub4 ub4Var = (ub4) obj5;
                c2 c2Var = (c2) obj3;
                c2 c2Var2 = (c2) obj2;
                DatagramSocket datagramSocket = (DatagramSocket) obj;
                c54 c54Var = j54.b;
                vq2 vq2VarU = ((dc4) obj4).b;
                if (c54Var != null) {
                    vq2VarU = vq2VarU.u(c54Var);
                }
                us2 us2Var = ub4Var.a.a;
                KnU knU = new KnU(22);
                us2Var.getClass();
                rx rxVarC = new xs2(new cs2(vq2.k(vq2VarU, new hr2(new cs2(us2Var, knU)), xnX3.z).C(1L, TimeUnit.SECONDS), new D(ub4Var, 24)), new i71(6, ub4Var, datagramSocket)).c(new gc(i2, c2Var, c2Var2));
                gq0.QnHx qnHx = gq0.x;
                kq0 kq0Var = kq0.SECONDS;
                return Th.h(rxVarC, ps0.o0(1, kq0Var), ps0.o0(10, kq0Var), ps0.o0(30, kq0Var), c54Var);
        }
    }
}

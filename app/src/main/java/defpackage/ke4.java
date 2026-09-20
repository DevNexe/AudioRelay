package defpackage;

import com.azefsw.audioconnect.network.exceptions.MessageException;
import com.azefsw.audioconnect.server.exceptions.ClientVersionTooLowException;
import com.azefsw.audioconnect.server.exceptions.MissingRequiredFeatureException;
import com.google.protobuf.F1;
import com.google.protobuf.QnHx;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ke4 implements i91 {
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ ps x;
    public final /* synthetic */ re4 y;
    public final /* synthetic */ dc4 z;

    public /* synthetic */ ke4(ps psVar, re4 re4Var, dc4 dc4Var) {
        this.x = psVar;
        this.y = re4Var;
        this.z = dc4Var;
    }

    public /* synthetic */ ke4(re4 re4Var, dc4 dc4Var, ps psVar) {
        this.y = re4Var;
        this.z = dc4Var;
        this.x = psVar;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        int i = this.w;
        final re4 re4Var = this.y;
        final ps psVar = this.x;
        final dc4 dc4Var = this.z;
        switch (i) {
            case 0:
                c54 c54Var = j54.c;
                vq2 vq2VarU = dc4Var.b;
                if (c54Var != null) {
                    vq2VarU = vq2VarU.u(c54Var);
                }
                vq2VarU.getClass();
                return new ox(new sr2(new zs2(vq2VarU), new ke4(psVar, re4Var, dc4Var)).c(new fc(5, psVar, re4Var))).i(c54Var);
            default:
                final yb4 yb4Var = (yb4) obj;
                return new fx(new InterfaceC1443fH() { // from class: le4
                    /* JADX WARN: Code duplicated, block: B:54:0x01cb  */
                    @Override // defpackage.InterfaceC1443fH
                    public final void run() throws SocketException, ClientVersionTooLowException, MissingRequiredFeatureException {
                        h04 h04Var;
                        rf3 rf3VarBuild;
                        x40 x40Var;
                        int i2;
                        a62 a62Var = a62.a;
                        ps psVar2 = psVar;
                        Socket socket = psVar2.a;
                        socket.setSoTimeout(10000);
                        re4 re4Var2 = re4Var;
                        ac4 ac4Var = re4Var2.b;
                        ac4Var.getClass();
                        yb4 yb4Var2 = yb4Var;
                        cg3 cg3VarX = OW8.x(yb4Var2);
                        OutputStream outputStream = psVar2.c;
                        cg3VarX.A(outputStream);
                        try {
                            of3 of3VarG = of3.O.g(psVar2.b, F1.a);
                            if (of3VarG == null) {
                                int i3 = MessageException.x;
                                throw MessageException.QnHx.b();
                            }
                            String strS = of3VarG.S();
                            vf3 vf3VarA = vf3.a(of3VarG.K);
                            if (vf3VarA == null) {
                                vf3VarA = vf3.UNRECOGNIZED;
                            }
                            mv2 mv2VarH = g7.h(vf3VarA, new nv2(of3VarG.S()));
                            String strV = of3VarG.V();
                            Sb1 sb1 = new Sb1(of3VarG.E, of3VarG.F, of3VarG.G);
                            Sb1 sb2 = new Sb1(of3VarG.B, of3VarG.C, of3VarG.D);
                            if (of3VarG.X()) {
                                wf3 wf3VarT = of3VarG.T();
                                h04Var = new h04(wf3VarT.S(), wf3VarT.A);
                            } else {
                                h04Var = new h04(of3VarG.U(), of3VarG.I);
                            }
                            bs bsVar = new bs(strS, mv2VarH, strV, h04Var, sb1, sb2);
                            a62Var.c("Received client config, clientVersion: " + strS + ", os: " + mv2VarH + ", osVersion: " + strV);
                            if (!v84.a(of3VarG.S(), "0.9.0")) {
                                throw new ClientVersionTooLowException(of3VarG.S());
                            }
                            uw0 uw0VarW = of3VarG.W();
                            uw0.CQf cQfC = uw0.H.c();
                            cQfC.R(uw0VarW);
                            cQfC.f().A(outputStream);
                            nh2 nh2Var = null;
                            if (!(of3VarG.W().a0() && of3VarG.W().T().z)) {
                                rf3VarBuild = null;
                            } else if ((!yb4Var2.G0()) && bsVar.G0()) {
                                f51 f51Var = ac4Var.a;
                                ad0 ad0VarA = f51Var.a();
                                rf3.CQf cQfC2 = rf3.D.c();
                                cQfC2.A = true;
                                cQfC2.M();
                                uf3.CQf cQfC3 = uf3.C.c();
                                cQfC3.A = f51Var.c();
                                cQfC3.M();
                                cQfC3.B = f51Var.b();
                                cQfC3.M();
                                uf3 uf3VarF = cQfC3.f();
                                if (!uf3VarF.isInitialized()) {
                                    throw QnHx.AbstractC0099QnHx.C(uf3VarF);
                                }
                                cQfC2.C = uf3VarF;
                                cQfC2.M();
                                tf3.CQf cQfC4 = tf3.C.c();
                                cQfC4.A = ad0VarA.a;
                                cQfC4.M();
                                cQfC4.B = ad0VarA.b;
                                cQfC4.M();
                                tf3 tf3VarF = cQfC4.f();
                                if (!tf3VarF.isInitialized()) {
                                    throw QnHx.AbstractC0099QnHx.C(tf3VarF);
                                }
                                cQfC2.B = tf3VarF;
                                cQfC2.M();
                                rf3VarBuild = cQfC2.build();
                            } else {
                                rf3.CQf cQfC5 = rf3.D.c();
                                cQfC5.A = false;
                                cQfC5.M();
                                rf3VarBuild = cQfC5.build();
                            }
                            if (rf3VarBuild != null) {
                                rf3VarBuild.A(outputStream);
                            }
                            if (rf3VarBuild == null || !rf3VarBuild.z) {
                                if (of3VarG.W().Z() && of3VarG.W().S().z) {
                                    int i4 = of3VarG.W().S().A;
                                    if (i4 <= 0) {
                                        i4 = 128000;
                                    }
                                    x40Var = new x40(i4);
                                } else {
                                    x40Var = null;
                                }
                            } else if (rf3VarBuild.T().z) {
                                x40Var = new x40(rf3VarBuild.T().A);
                            } else {
                                x40Var = null;
                            }
                            if (of3VarG.W().c0() && of3VarG.W().V().z) {
                                mh2 mh2VarV = of3VarG.W().V();
                                nh2Var = new nh2(mh2VarV.B, mh2VarV.A);
                            }
                            nh2 nh2Var2 = nh2Var;
                            boolean z = of3VarG.W().b0() && of3VarG.W().U().z;
                            boolean z2 = of3VarG.W().f0() && of3VarG.W().Y().z;
                            w50 w50Var = new w50(bsVar, new gc4(x40Var, nh2Var2, z, z2, of3VarG.W().e0() && of3VarG.W().X().z));
                            if (!z2) {
                                throw new MissingRequiredFeatureException();
                            }
                            if (v84.a(strS, "0.20.0")) {
                                i2 = 10000;
                            } else {
                                a62Var.l("Old client version, setting the timeout to 0 (" + strS + ")");
                                i2 = 0;
                            }
                            socket.setSoTimeout(i2);
                            re4Var2.c.P0(new eg4(dc4Var, ((ze4) re4Var2.d.x).a(), psVar2, w50Var));
                        } catch (Throwable th) {
                            int i5 = MessageException.x;
                            throw MessageException.QnHx.a(th);
                        }
                    }
                });
        }
    }
}

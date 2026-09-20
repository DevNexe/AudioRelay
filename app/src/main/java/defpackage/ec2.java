package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.protobuf.QnHx;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ec2 implements InterfaceC1443fH {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ec2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC1443fH
    public final void run() {
        switch (this.a) {
            case 0:
                ny1 ny1Var = (ny1) this.b;
                dc2.F1 f1 = (dc2.F1) this.c;
                sd2 sd2Var = (sd2) ny1Var.w;
                ad2.CQf cQfW0 = ad2.w0();
                dc2.CQf cQfC = dc2.B.c();
                cQfC.A = f1.b();
                cQfC.M();
                dc2 dc2VarF = cQfC.f();
                if (!dc2VarF.isInitialized()) {
                    throw QnHx.AbstractC0099QnHx.C(dc2VarF);
                }
                cQfW0.D = dc2VarF;
                cQfW0.M();
                sd2Var.a(cQfW0.build());
                return;
            case 1:
                vb4 vb4Var = (vb4) this.b;
                uc4 uc4Var = (uc4) this.c;
                try {
                    vb4Var.close();
                    break;
                } catch (Throwable th) {
                    a62 a62Var = a62.a;
                    a62.a.d(th, true);
                }
                df4.QnHx qnHx = df4.QnHx.a;
                uc4Var.e = qnHx;
                uc4Var.b.a(qnHx);
                return;
            case 2:
                xe4 xe4Var = (xe4) this.b;
                oq3 oq3Var = (oq3) this.c;
                long j = xe4Var.b.d0().z;
                je4 je4Var = xe4Var.a;
                hu4 hu4VarK = je4Var.k(j);
                if (hu4VarK == null) {
                    oq3Var.b.a(mq3.w);
                    a62 a62Var2 = a62.a;
                }
                nq3 nq3Var = new nq3(hu4VarK, j);
                ad4 ad4Var = oq3Var.a;
                ad4Var.getClass();
                ad2.CQf cQfW1 = ad2.w0();
                nq3Var.invoke(cQfW1);
                ad4Var.a(new uf4(je4Var, cQfW1.build()));
                return;
            case 3:
                p33 p33Var = (p33) this.b;
                r33 r33Var = (r33) this.c;
                synchronized (p33Var) {
                    List<l33> list = p33Var.d;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        je4 je4Var2 = list.get(i).a;
                        if (r33Var instanceof r33.QnHx) {
                            je4Var2.a(new yv2.QnHx(((r33.QnHx) r33Var).a));
                        }
                    }
                    sd5 sd5Var = sd5.a;
                }
                return;
            default:
                gu4 gu4Var = (gu4) this.b;
                String str = (String) this.c;
                gu4Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.setFlags(268435456);
                gu4Var.a.startActivity(intent);
                return;
        }
    }
}

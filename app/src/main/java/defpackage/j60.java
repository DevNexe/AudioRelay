package defpackage;

import com.google.protobuf.QnHx;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j60 implements InterfaceC1443fH {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j60(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.InterfaceC1443fH
    public final void run() throws oo5 {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                s50 s50Var = (s50) obj2;
                ad2.CQf cQfW0 = ad2.w0();
                xt4.CQf cQfC = xt4.B.c();
                String str = ((zt4) obj).a;
                str.getClass();
                cQfC.A = str;
                cQfC.M();
                xt4 xt4VarF = cQfC.f();
                if (!xt4VarF.isInitialized()) {
                    throw QnHx.AbstractC0099QnHx.C(xt4VarF);
                }
                cQfW0.N = xt4VarF;
                cQfW0.M();
                ad2 ad2VarBuild = cQfW0.build();
                m15 m15Var = s50Var.b;
                m15Var.getClass();
                try {
                    ad2VarBuild.A(m15Var.e);
                    return;
                } catch (Throwable th) {
                    hq4.a(m15Var, th);
                    throw null;
                }
            default:
                ((hd4) obj2).a.a(new d33((je4) this.c, ((e33) obj).z));
                return;
        }
    }
}

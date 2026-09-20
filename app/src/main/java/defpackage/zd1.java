package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zd1 extends v05 {
    public final /* synthetic */ xd1 e;
    public final /* synthetic */ ke1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd1(String str, xd1 xd1Var, ke1 ke1Var) {
        super(str, true);
        this.e = xd1Var;
        this.f = ke1Var;
    }

    @Override // defpackage.v05
    public final long a() {
        try {
            this.e.x.b(this.f);
            return -1L;
        } catch (IOException e) {
            x43 x43Var = x43.a;
            x43 x43Var2 = x43.a;
            String strD = ur1.d(this.e.z, "Http2Connection.Listener failure for ");
            x43Var2.getClass();
            x43.i(4, strD, e);
            try {
                this.f.c(rt0.PROTOCOL_ERROR, e);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}

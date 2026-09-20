package defpackage;

import com.google.protobuf.F1;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ve4 implements je4, wb1 {
    public final long b;
    public final ps c;
    public final w50 d;
    public final j81<je4, sd5> e;
    public final /* synthetic */ hg4 f;
    public volatile boolean g;
    public final rg3<h04> i;
    public final xq2 j;
    public final cl0 k;
    public final bs l;
    public final gc4 m;
    public final String n;
    public volatile pq3 o;
    public final of4 a = new of4(UUID.randomUUID());
    public final h40 h = new h40();

    public ve4(long j, ps psVar, w50 w50Var, pq2 pq2Var, tf4.QnHx qnHx, hg4 hg4Var) {
        this.b = j;
        this.c = psVar;
        this.d = w50Var;
        this.e = qnHx;
        this.f = hg4Var;
        rg3<h04> rg3Var = new rg3<>();
        this.i = rg3Var;
        this.k = new cl0(this, (ad4) pq2Var.w);
        bs bsVar = w50Var.a;
        this.l = bsVar;
        this.m = w50Var.b;
        this.n = psVar.a.getInetAddress().getHostAddress();
        vq2<h04> vq2VarX = rg3Var.x(bsVar.z);
        D d = new D(this, 26);
        vq2VarX.getClass();
        jr2 jr2Var = new jr2(new cs2(vq2VarX, d), new jG$(11), m91.d, m91.c);
        mq2.c(16, "initialCapacity");
        this.j = new xq2(jr2Var);
    }

    @Override // defpackage.wb1
    public final void a(yv2.QnHx qnHx) {
        this.f.a(qnHx);
    }

    @Override // defpackage.je4
    public final boolean b() {
        return this.d.b.c;
    }

    @Override // defpackage.je4
    public final void c(pq3 pq3Var) {
        this.o = pq3Var;
    }

    @Override // defpackage.je4
    public final ds2 d(c54 c54Var) {
        return this.j.u(c54Var);
    }

    @Override // defpackage.wb1
    public final void e(c60 c60Var) {
        this.f.e(c60Var);
    }

    @Override // defpackage.je4
    public final boolean f() {
        return b();
    }

    @Override // defpackage.je4
    public final OutputStream g() {
        if (b()) {
            return this.c.c;
        }
        throw new IllegalStateException("Call hasMessageStream() first.".toString());
    }

    @Override // defpackage.je4
    public final long getCreationTime() {
        return this.b;
    }

    @Override // defpackage.je4
    public final of4 getId() {
        return this.a;
    }

    @Override // defpackage.je4
    public final void h(cf4.QnHx qnHx) {
        ((w9) this.k.c).g(qnHx);
    }

    @Override // defpackage.je4
    public final void i(h04 h04Var) {
        this.i.g(h04Var);
    }

    @Override // defpackage.je4
    public final InputStream j() {
        if (b()) {
            return this.c.b;
        }
        throw new IllegalStateException("Call hasMessageStream() first.".toString());
    }

    @Override // defpackage.je4
    public final hu4 k(long j) {
        zk zkVar;
        qk qkVar;
        pq3 pq3Var = this.o;
        if (pq3Var == null) {
            return null;
        }
        zk[] zkVarArr = pq3Var.a;
        int length = zkVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                zkVar = null;
                break;
            }
            zkVar = zkVarArr[i];
            if (zkVar != null && zkVar.a == j) {
                break;
            }
            i++;
        }
        if (zkVar == null || (qkVar = (qk) zkVar.b) == null) {
            return null;
        }
        hu4.QnHx qnHx = hu4.H;
        qnHx.getClass();
        byte[] bArr = qkVar.a;
        return (hu4) qnHx.f(bArr, bArr.length, F1.a);
    }

    @Override // defpackage.je4
    public final boolean l() {
        return this.g;
    }

    @Override // defpackage.je4
    public final gc4 m() {
        return this.m;
    }

    @Override // defpackage.je4
    public final String n() {
        return this.n;
    }

    @Override // defpackage.je4
    public final void stop() {
        if (this.g) {
            a62 a62Var = a62.a;
            return;
        }
        synchronized (this) {
            if (this.g) {
                a62 a62Var2 = a62.a;
                return;
            }
            a62.a.c("Remote device disconnected: " + this.n + "...");
            this.g = true;
            this.h.a();
            this.c.a.close();
            this.e.invoke(this);
            sd5 sd5Var = sd5.a;
        }
    }
}

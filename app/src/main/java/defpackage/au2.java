package defpackage;

import io.ktor.client.plugins.websocket.WebSocketException;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class au2 extends rl5 implements hi0 {
    public final LNw C;
    public final ll5.QnHx w;
    public final la0 x;
    public final yw y = ddf.c();
    public final yw z = ddf.c();
    public final NUlFixed A = AY.a(0, null, 7);
    public final yw B = ddf.c();

    public au2(ll5.QnHx qnHx, cp3 cp3Var, la0 la0Var) {
        this.w = qnHx;
        this.x = la0Var;
        x81 zt2Var = new zt2(this, cp3Var, null);
        LNw lNw = new LNw(ma0.b(this, xr0.w), AY.a(0, null, 6), true);
        lNw.W0(1, lNw, zt2Var);
        this.C = lNw;
    }

    @Override // defpackage.tl5
    public final Object I(ul5.QnHx qnHx) {
        return sd5.a;
    }

    @Override // defpackage.tl5
    public final q94<p61> T() {
        return this.C;
    }

    @Override // defpackage.rl5
    public final void a(int i, String str) {
        Object objValueOf;
        short s = (short) i;
        this.B.G0(new lt(s, str));
        this.A.a(null);
        StringBuilder sb = new StringBuilder("WebSocket session closed with code ");
        lt.QnHx qnHx = (lt.QnHx) lt.QnHx.x.get(Short.valueOf(s));
        if (qnHx == null || (objValueOf = qnHx.toString()) == null) {
            objValueOf = Integer.valueOf(i);
        }
        this.C.a(new CancellationException(o5.d(sb, objValueOf, '.')));
    }

    @Override // defpackage.rl5
    public final void c(int i, String str) {
        short s = (short) i;
        this.B.G0(new lt(s, str));
        try {
            fp1.B0(this.C, new p61.CQf(new lt(s, str)));
        } catch (Throwable unused) {
        }
        this.A.a(null);
    }

    @Override // defpackage.rl5
    public final void d(Throwable th) {
        yw ywVar = this.B;
        ywVar.getClass();
        ywVar.G0(new iy(th, false));
        yw ywVar2 = this.z;
        ywVar2.getClass();
        ywVar2.G0(new iy(th, false));
        this.A.a(th);
        this.C.a(th);
    }

    @Override // defpackage.rl5
    public final void e(mk mkVar) {
        fp1.B0(this.A, new p61.QnHx(mkVar.o(), false, false, false));
    }

    @Override // defpackage.ua0
    public final la0 g() {
        return this.x;
    }

    @Override // defpackage.rl5
    public final void h(String str) {
        fp1.B0(this.A, new p61.YKK(str.getBytes(up.a), false, false, false));
    }

    @Override // defpackage.hi0
    public final void h0(List<? extends ol5<?>> list) {
        if (!list.isEmpty()) {
            throw new IllegalArgumentException("Extensions are not supported.".toString());
        }
    }

    @Override // defpackage.rl5
    public final void i(xp3 xp3Var) {
        this.z.G0(xp3Var);
    }

    @Override // defpackage.tl5
    public final Object i0(p61 p61Var, z80<? super sd5> z80Var) {
        Object objP = T().p(p61Var, z80Var);
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (objP != va0Var) {
            objP = sd5.a;
        }
        return objP == va0Var ? objP : sd5.a;
    }

    @Override // defpackage.tl5
    public final void q0(long j) {
        throw new WebSocketException();
    }

    @Override // defpackage.tl5
    public final nk3<p61> v() {
        return this.A;
    }

    @Override // defpackage.tl5
    public final long x0() {
        return Long.MAX_VALUE;
    }
}

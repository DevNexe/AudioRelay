package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.PlayerInputHandler$handleInput$2", f = "PlayerInputHandler.kt", l = {}, m = "invokeSuspend")
public final class s63 extends px4 implements x81<gk4<g63, f63, h63>, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ u63 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s63(u63 u63Var, z80<? super s63> z80Var) {
        super(2, z80Var);
        this.B = u63Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        s63 s63Var = new s63(this.B, z80Var);
        s63Var.A = obj;
        return s63Var;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        gk4 gk4Var = (gk4) this.A;
        u63 u63Var = this.B;
        u63Var.getClass();
        mz0[] mz0VarArr = new mz0[5];
        mz0VarArr[0] = new r01(new n63(gk4Var, null), iE.b(u63Var.d.a(j54.c)));
        mz0VarArr[1] = new r01(new o63(gk4Var, null), iE.b(u63Var.c.a));
        c54 c54Var = j54.b;
        ln2 ln2Var = u63Var.a;
        mz0VarArr[2] = new r01(new p63(gk4Var, null), iE.b(ln2Var.d(c54Var)));
        vq2 vq2VarB = u63Var.b.a.B(new D(u63Var, 17));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vq2VarB.getClass();
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (c54Var == null) {
            throw new NullPointerException("scheduler is null");
        }
        mz0VarArr[3] = new r01(new q63(gk4Var, null), iE.b(new cs2(new ct2(vq2VarB, timeUnit, c54Var), new k71(14))));
        ds2 ds2VarF = ln2Var.f(c54Var);
        KnU knU = new KnU(11);
        ds2VarF.getClass();
        mz0VarArr[4] = new r01(new r63(gk4Var, null), iE.b(new cs2(new cs2(ds2VarF, knU), new Acr(10))));
        kd.r(kd.s(ps0.M(mz0VarArr)), gk4Var);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(gk4<g63, f63, h63> gk4Var, z80<? super sd5> z80Var) {
        return ((s63) a(gk4Var, z80Var)).i(sd5.a);
    }
}

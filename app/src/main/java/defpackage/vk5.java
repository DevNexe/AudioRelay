package defpackage;

import com.google.protobuf.QnHx;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.audio.volume.VolumeObserverSessionTask$sendVolumeMessage$1", f = "VolumeObserverSessionTask.kt", l = {63}, m = "invokeSuspend")
public final class vk5 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ wk5 B;
    public final /* synthetic */ ok5 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk5(wk5 wk5Var, ok5 ok5Var, z80<? super vk5> z80Var) {
        super(2, z80Var);
        this.B = wk5Var;
        this.C = ok5Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new vk5(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            sd2 sd2Var = this.B.d;
            ad2.CQf cQfW0 = ad2.w0();
            s_.CQf cQfC = s_.D.c();
            ok5 ok5Var = this.C;
            cQfC.A = ok5Var.a;
            cQfC.M();
            cQfC.B = ok5Var.b;
            cQfC.M();
            cQfC.C = ok5Var.c;
            cQfC.M();
            s_ s_VarF = cQfC.f();
            if (!s_VarF.isInitialized()) {
                throw QnHx.AbstractC0099QnHx.C(s_VarF);
            }
            cQfW0.E = s_VarF;
            cQfW0.M();
            ad2 ad2VarBuild = cQfW0.build();
            this.A = 1;
            if (sd2Var.b(ad2VarBuild, this) == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((vk5) a(ua0Var, z80Var)).i(sd5.a);
    }
}

package defpackage;

import android.media.projection.MediaProjection;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.AndroidServerInputHandler$startServer$3", f = "AndroidServerInputHandler.kt", l = {}, m = "invokeSuspend")
public final class sjLP extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public final /* synthetic */ AO9A A;
    public final /* synthetic */ VV4.LPt6Fixed B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjLP(AO9A ao9a, VV4.LPt6Fixed lPt6, z80<? super sjLP> z80Var) {
        super(2, z80Var);
        this.A = ao9a;
        this.B = lPt6;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new sjLP(this.A, this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        MediaProjection mediaProjection = ((Qx0$.CQf) this.B.a).a;
        AO9A ao9a = this.A;
        ao9a.getClass();
        mediaProjection.registerCallback(new JmY(ao9a), null);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((sjLP) a(ua0Var, z80Var)).i(sd5.a);
    }
}

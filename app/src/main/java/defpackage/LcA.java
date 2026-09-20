package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
public final class LcA extends px4 implements x81<ua0, z80<? super Choreographer>, Object> {
    public LcA(z80<? super LcA> z80Var) {
        super(2, z80Var);
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new LcA(z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return Choreographer.getInstance();
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super Choreographer> z80Var) {
        return new LcA(z80Var).i(sd5.a);
    }
}

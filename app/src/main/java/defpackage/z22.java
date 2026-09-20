package defpackage;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.YKK;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
public final class z22 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ LifecycleCoroutineScopeImpl B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z22(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, z80<? super z22> z80Var) {
        super(2, z80Var);
        this.B = lifecycleCoroutineScopeImpl;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        z22 z22Var = new z22(this.B, z80Var);
        z22Var.A = obj;
        return z22Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        ua0 ua0Var = (ua0) this.A;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.B;
        if (lifecycleCoroutineScopeImpl.w.b().compareTo(YKK.F1.INITIALIZED) >= 0) {
            lifecycleCoroutineScopeImpl.w.a(lifecycleCoroutineScopeImpl);
        } else {
            AY.j(ua0Var.g(), null);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((z22) a(ua0Var, z80Var)).i(sd5.a);
    }
}

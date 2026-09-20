package androidx.compose.ui.platform;

import defpackage.C0239D;
import defpackage.if0;
import defpackage.px4;
import defpackage.sd5;
import defpackage.ua0;
import defpackage.va0;
import defpackage.x81;
import defpackage.z80;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", l = {153}, m = "invokeSuspend")
public final class CQf extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ WrappedComposition B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CQf(WrappedComposition wrappedComposition, z80<? super CQf> z80Var) {
        super(2, z80Var);
        this.B = wrappedComposition;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new CQf(this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            AndroidComposeView androidComposeView = this.B.w;
            this.A = 1;
            Object objF = androidComposeView.s0.f(this);
            if (objF != va0Var) {
                objF = sd5.a;
            }
            if (objF == va0Var) {
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
        return ((CQf) a(ua0Var, z80Var)).i(sd5.a);
    }
}

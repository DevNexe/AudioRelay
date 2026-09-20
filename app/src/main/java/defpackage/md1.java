package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2", f = "Hoverable.kt", l = {88}, m = "invokeSuspend")
public final class md1 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ ri2<hd1> C;
    public final /* synthetic */ ci2 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md1(ci2 ci2Var, ri2 ri2Var, z80 z80Var, boolean z) {
        super(2, z80Var);
        this.B = z;
        this.C = ri2Var;
        this.D = ci2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new md1(this.D, this.C, z80Var, this.B);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            if (!this.B) {
                this.A = 1;
                if (qd1.b(this.D, this.C, this) == va0Var) {
                    return va0Var;
                }
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
        return ((md1) a(ua0Var, z80Var)).i(sd5.a);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", l = {70}, m = "invokeSuspend")
public final class a51 extends eq3 implements x81<a5, z80<? super sd5>, Object> {
    public int y;
    public /* synthetic */ Object z;

    public a51(z80<? super a51> z80Var) {
        super(2, z80Var);
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        a51 a51Var = new a51(z80Var);
        a51Var.z = obj;
        return a51Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.y;
        if (i == 0) {
            C0239D.H(obj);
            a5 a5Var = (a5) this.z;
            this.y = 1;
            if (b51.a(a5Var, this) == va0Var) {
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
    public final Object invoke(a5 a5Var, z80<? super sd5> z80Var) {
        return ((a51) a(a5Var, z80Var)).i(sd5.a);
    }
}

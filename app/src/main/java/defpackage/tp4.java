package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", f = "ProduceState.kt", l = {153}, m = "invokeSuspend")
public final class tp4 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ x81<qe3<Object>, z80<? super sd5>, Object> C;
    public final /* synthetic */ ri2<Object> D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tp4(x81<? super qe3<Object>, ? super z80<? super sd5>, ? extends Object> x81Var, ri2<Object> ri2Var, z80<? super tp4> z80Var) {
        super(2, z80Var);
        this.C = x81Var;
        this.D = ri2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        tp4 tp4Var = new tp4(this.C, this.D, z80Var);
        tp4Var.B = obj;
        return tp4Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            re3 re3Var = new re3(this.D, ((ua0) this.B).g());
            this.A = 1;
            if (this.C.invoke(re3Var, this) == va0Var) {
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
        return ((tp4) a(ua0Var, z80Var)).i(sd5.a);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.gestures.IgnorePointerDraggableState$drag$2", f = "Draggable.kt", l = {478}, m = "invokeSuspend")
public final class yi1 extends px4 implements x81<qn0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ zi1 C;
    public final /* synthetic */ x81<w83, z80<? super sd5>, Object> D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yi1(zi1 zi1Var, x81<? super w83, ? super z80<? super sd5>, ? extends Object> x81Var, z80<? super yi1> z80Var) {
        super(2, z80Var);
        this.C = zi1Var;
        this.D = x81Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        yi1 yi1Var = new yi1(this.C, this.D, z80Var);
        yi1Var.B = obj;
        return yi1Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            qn0 qn0Var = (qn0) this.B;
            zi1 zi1Var = this.C;
            zi1Var.b = qn0Var;
            this.A = 1;
            if (this.D.invoke(zi1Var, this) == va0Var) {
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
    public final Object invoke(qn0 qn0Var, z80<? super sd5> z80Var) {
        return ((yi1) a(qn0Var, z80Var)).i(sd5.a);
    }
}

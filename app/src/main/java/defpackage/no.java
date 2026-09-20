package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
public final class no extends px4 implements x81<te3<Object>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ oo<Object> C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(oo<Object> ooVar, z80<? super no> z80Var) {
        super(2, z80Var);
        this.C = ooVar;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        no noVar = new no(this.C, z80Var);
        noVar.B = obj;
        return noVar;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            te3<? super Object> te3Var = (te3) this.B;
            this.A = 1;
            if (this.C.h(te3Var, this) == va0Var) {
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
    public final Object invoke(te3<Object> te3Var, z80<? super sd5> z80Var) {
        return ((no) a(te3Var, z80Var)).i(sd5.a);
    }
}

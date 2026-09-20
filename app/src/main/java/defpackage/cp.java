package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
public final class cp extends px4 implements x81<ua0, z80<? super ap<? extends sd5>>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ q94<Object> C;
    public final /* synthetic */ Object D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp(q94<Object> q94Var, Object obj, z80<? super cp> z80Var) {
        super(2, z80Var);
        this.C = q94Var;
        this.D = obj;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        cp cpVar = new cp(this.C, this.D, z80Var);
        cpVar.B = obj;
        return cpVar;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        Object qnHx;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        try {
            if (i == 0) {
                C0239D.H(obj);
                q94<Object> q94Var = this.C;
                Object obj2 = this.D;
                this.A = 1;
                if (q94Var.p(obj2, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            qnHx = sd5.a;
        } catch (Throwable th) {
            qnHx = new fq3.QnHx(th);
        }
        return new ap((qnHx instanceof fq3.QnHx) ^ true ? sd5.a : new ap.QnHx(fq3.a(qnHx)));
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super ap<? extends sd5>> z80Var) {
        return ((cp) a(ua0Var, z80Var)).i(sd5.a);
    }
}

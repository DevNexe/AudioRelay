package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", l = {49}, m = "invokeSuspend")
public final class m25 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ OVbg<Float, JW> B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m25(OVbg<Float, JW> oVbg, z80<? super m25> z80Var) {
        super(2, z80Var);
        this.B = oVbg;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new m25(this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            OVbg<Float, JW> oVbg = this.B;
            Float f = new Float(0.0f);
            float f2 = q25.a;
            rw1.CQf<Float> cQf = new rw1.CQf<>();
            p25.w.invoke(cQf);
            ak1 ak1VarQ = hH.q(new rw1(cQf), 0, 6);
            this.A = 1;
            if (OVbg.c(oVbg, f, ak1VarQ, null, this, 12) == va0Var) {
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
        return ((m25) a(ua0Var, z80Var)).i(sd5.a);
    }
}

package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.settings.ui.buffersize.custom.CustomBufferSizeEditorInputHandler$save$4", f = "CustomBufferSizeEditorInputHandler.kt", l = {50}, m = "invokeSuspend")
public final class zd0 extends px4 implements x81<gk4<cd0, bd0, dd0>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ be0 C;
    public final /* synthetic */ xq0<ce0.QnHx, ce0.F1> D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zd0(be0 be0Var, xq0<? extends ce0.QnHx, ce0.F1> xq0Var, z80<? super zd0> z80Var) {
        super(2, z80Var);
        this.C = be0Var;
        this.D = xq0Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        zd0 zd0Var = new zd0(this.C, this.D, z80Var);
        zd0Var.B = obj;
        return zd0Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            gk4 gk4Var = (gk4) this.B;
            ce0 ce0Var = this.C.a;
            ce0.F1 f1 = (ce0.F1) ((xq0.CQf) this.D).a;
            lKy3 lky3 = ce0Var.a;
            String strD = lky3.d(R.string.pref_custom_buffer_mode_key);
            nt1 nt1Var = new nt1(f1.a, f1.b);
            ws1 ws1Var = (ws1) lky3.d.x;
            lky3.i(strD, ws1Var.b(ib4.serializer(ws1Var.b, nl3.c(nt1.class)), nt1Var));
            ce0Var.b.a();
            bd0.QnHx qnHx = bd0.QnHx.a;
            this.A = 1;
            if (gk4Var.o(qnHx, this) == va0Var) {
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
    public final Object invoke(gk4<cd0, bd0, dd0> gk4Var, z80<? super sd5> z80Var) {
        return ((zd0) a(gk4Var, z80Var)).i(sd5.a);
    }
}

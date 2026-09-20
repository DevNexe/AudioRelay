package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1", f = "Focusable.kt", l = {144}, m = "invokeSuspend")
public final class r31 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public f33.QnHx A;
    public int B;
    public final /* synthetic */ Cif C;
    public final /* synthetic */ ri2<f33> D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r31(Cif cif, ri2<f33> ri2Var, z80<? super r31> z80Var) {
        super(2, z80Var);
        this.C = cif;
        this.D = ri2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new r31(this.C, this.D, z80Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:31:0x004c  */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        f33.QnHx qnHx;
        Throwable th;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.B;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qnHx = this.A;
            try {
                C0239D.H(obj);
                if (qnHx != null) {
                    qnHx.a();
                }
                return sd5.a;
            } catch (Throwable th2) {
                th = th2;
                if (qnHx != null) {
                    qnHx.a();
                }
                throw th;
            }
        }
        C0239D.H(obj);
        try {
            f33 value = this.D.getValue();
            f33.QnHx qnHxA = value != null ? value.a() : null;
            try {
                Cif cif = this.C;
                this.A = qnHxA;
                this.B = 1;
                if (cif.a(null, this) == va0Var) {
                    return va0Var;
                }
                qnHx = qnHxA;
                if (qnHx != null) {
                    qnHx.a();
                }
                return sd5.a;
            } catch (Throwable th3) {
                th = th3;
                qnHx = qnHxA;
                if (qnHx != null) {
                    qnHx.a();
                }
                throw th;
            }
        } catch (Throwable th4) {
            qnHx = null;
            th = th4;
        }
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((r31) a(ua0Var, z80Var)).i(sd5.a);
    }
}

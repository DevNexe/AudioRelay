package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.settings.ui.SettingsInputHandler$getAppVersion$1", f = "SettingsInputHandler.kt", l = {168}, m = "invokeSuspend")
public final class ah4 extends px4 implements x81<nz0<? super String>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ oh4 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah4(oh4 oh4Var, z80<? super ah4> z80Var) {
        super(2, z80Var);
        this.C = oh4Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        ah4 ah4Var = new ah4(this.C, z80Var);
        ah4Var.B = obj;
        return ah4Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = (nz0) this.B;
            oh4 oh4Var = this.C;
            String str = oh4Var.a.getPackageManager().getPackageInfo(oh4Var.a.getPackageName(), 0).versionName;
            this.A = 1;
            if (nz0Var.f(str, this) == va0Var) {
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
    public final Object invoke(nz0<? super String> nz0Var, z80<? super sd5> z80Var) {
        return ((ah4) a(nz0Var, z80Var)).i(sd5.a);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class df2 implements jb3 {
    public final gf2 a;

    @if0(c = "com.azefsw.audioconnect.server.audio.capture.noise.MicNoiseRemoverPremiumFeature$clean$1", f = "MicNoiseRemoverPremiumFeature.kt", l = {9}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;

        public QnHx(z80<? super QnHx> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return df2.this.new QnHx(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                gf2 gf2Var = df2.this.a;
                this.A = 1;
                Object objA = new e01(gf2Var.a.g("mic_noise_removal_enabled")).a(new ef2(gf2Var), this);
                if (objA != va0Var) {
                    objA = sd5.a;
                }
                if (objA == va0Var) {
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
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public df2(gf2 gf2Var) {
        this.a = gf2Var;
    }

    @Override // defpackage.jb3
    public final qw a() {
        return kd.x(new QnHx(null));
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ke2 implements MUpZ {
    public final yk5 a;
    public final af2 b;

    @if0(c = "com.azefsw.audioconnect.server.audio.capture.MicAudioProcessor$runUntilCancellation$2", f = "MicAudioProcessor.kt", l = {22}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super List<? extends sd5>>, Object> {
        public int A;
        public /* synthetic */ Object B;

        @if0(c = "com.azefsw.audioconnect.server.audio.capture.MicAudioProcessor$runUntilCancellation$2$2", f = "MicAudioProcessor.kt", l = {24}, m = "invokeSuspend")
        public static final class CQf extends px4 implements x81<ua0, z80<? super sd5>, Object> {
            public int A;
            public final /* synthetic */ ke2 B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CQf(ke2 ke2Var, z80<? super CQf> z80Var) {
                super(2, z80Var);
                this.B = ke2Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                return new CQf(this.B, z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                Object obj2 = va0.COROUTINE_SUSPENDED;
                int i = this.A;
                if (i == 0) {
                    C0239D.H(obj);
                    af2 af2Var = this.B.b;
                    this.A = 1;
                    Object objE = kd.e(kd.i(new we2(af2Var.a.a())), new ze2(af2Var, null), this);
                    if (objE != obj2) {
                        objE = sd5.a;
                    }
                    if (objE == obj2) {
                        return obj2;
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
                return ((CQf) a(ua0Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX INFO: renamed from: ke2$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.server.audio.capture.MicAudioProcessor$runUntilCancellation$2$1", f = "MicAudioProcessor.kt", l = {23}, m = "invokeSuspend")
        public static final class C0155QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
            public int A;
            public final /* synthetic */ ke2 B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0155QnHx(ke2 ke2Var, z80<? super C0155QnHx> z80Var) {
                super(2, z80Var);
                this.B = ke2Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                return new C0155QnHx(this.B, z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i = this.A;
                if (i == 0) {
                    C0239D.H(obj);
                    yk5 yk5Var = this.B.a;
                    this.A = 1;
                    Object objA = yk5Var.a.a().a(new xk5(yk5Var), this);
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
                return ((C0155QnHx) a(ua0Var, z80Var)).i(sd5.a);
            }
        }

        public QnHx(z80<? super QnHx> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = ke2.this.new QnHx(z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                ua0 ua0Var = (ua0) this.B;
                ke2 ke2Var = ke2.this;
                ni0[] ni0VarArr = {fp1.D(ua0Var, null, new C0155QnHx(ke2Var, null), 3), fp1.D(ua0Var, null, new CQf(ke2Var, null), 3)};
                this.A = 1;
                obj = new kotlinx.coroutines.QnHx(ni0VarArr).a(this);
                if (obj == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return obj;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super List<? extends sd5>> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public ke2(yk5 yk5Var, af2 af2Var) {
        this.a = yk5Var;
        this.b = af2Var;
    }

    @Override // defpackage.MUpZ
    public final Object a(z80<? super sd5> z80Var) {
        Object objR = fp1.R(new QnHx(null), z80Var);
        return objR == va0.COROUTINE_SUSPENDED ? objR : sd5.a;
    }

    @Override // defpackage.MUpZ
    public final void b(qk qkVar, P4 p4) {
        this.b.c.invoke(qkVar, new je2(this, p4));
    }
}

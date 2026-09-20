package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import com.azefsw.audioconnect.server.services.ServerService;

/* JADX INFO: loaded from: classes.dex */
public final class f_5 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ Context w;
        public final /* synthetic */ mz0<rPO> x;
        public final /* synthetic */ h81<sd5> y;
        public final /* synthetic */ j81<VV4, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(Context context, mz0<? extends rPO> mz0Var, h81<sd5> h81Var, j81<? super VV4, sd5> j81Var, int i) {
            super(2);
            this.w = context;
            this.x = mz0Var;
            this.y = h81Var;
            this.z = j81Var;
            this.A = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            f_5.a(this.w, this.x, this.y, this.z, g30Var, this.A | 1);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<MediaProjection, sd5> {
        public final /* synthetic */ j81<VV4, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(j81<? super VV4, sd5> j81Var) {
            super(1);
            this.w = j81Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(MediaProjection mediaProjection) {
            this.w.invoke(new VV4.EQ(mediaProjection));
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<com9Fixed, sd5> {
        public final /* synthetic */ Context w;
        public final /* synthetic */ j81<VV4, sd5> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(Context context, j81<? super VV4, sd5> j81Var) {
            super(1);
            this.w = context;
            this.x = j81Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(com9Fixed com9Var) {
            a62 a62Var = a62.a;
            a62Var.e("playback_capture_permission_refused");
            a62Var.l("MediaProjection refused, result code: " + com9Var.w);
            int i = ServerService.z;
            Context context = this.w;
            context.stopService(new Intent(context, (Class<?>) ServerService.class));
            this.x.invoke(VV4.byN.a);
            return sd5.a;
        }
    }

    @if0(c = "com.azefsw.audioconnect.server.ui.permissions.AskPermissionsEffectKt$AskPermissionEffect$1", f = "AskPermissionsEffect.kt", l = {37}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ mz0<rPO> B;
        public final /* synthetic */ h81<sd5> C;
        public final /* synthetic */ g82<Intent, com9Fixed> D;
        public final /* synthetic */ Context E;

        /* JADX INFO: renamed from: f_5$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0126QnHx implements nz0<rPO> {
            public final /* synthetic */ h81<sd5> w;
            public final /* synthetic */ g82<Intent, com9Fixed> x;
            public final /* synthetic */ Context y;

            public C0126QnHx(h81<sd5> h81Var, g82<Intent, com9Fixed> g82Var, Context context) {
                this.w = h81Var;
                this.x = g82Var;
                this.y = context;
            }

            @Override // defpackage.nz0
            public final Object f(rPO rpo, z80 z80Var) {
                rPO rpo2 = rpo;
                if (ur1.a(rpo2, rPO.QnHx.a)) {
                    this.w.invoke();
                } else if (ur1.a(rpo2, rPO.CQf.a)) {
                    Object objC = r80.c(this.y, MediaProjectionManager.class);
                    if (objC == null) {
                        throw new IllegalStateException("MediaProjectionManager not found".toString());
                    }
                    this.x.H0(((MediaProjectionManager) objC).createScreenCaptureIntent());
                }
                return sd5.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(mz0<? extends rPO> mz0Var, h81<sd5> h81Var, g82<Intent, com9Fixed> g82Var, Context context, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = mz0Var;
            this.C = h81Var;
            this.D = g82Var;
            this.E = context;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, this.C, this.D, this.E, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                C0126QnHx c0126QnHx = new C0126QnHx(this.C, this.D, this.E);
                this.A = 1;
                if (this.B.a(c0126QnHx, this) == va0Var) {
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

    public static final void a(Context context, mz0<? extends rPO> mz0Var, h81<sd5> h81Var, j81<? super VV4, sd5> j81Var, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(826849695);
        e40.CQf cQf = e40.a;
        j30VarQ.e(1157296644);
        boolean zI = j30VarQ.I(j81Var);
        Object objB0 = j30VarQ.b0();
        if (zI || objB0 == g30.QnHx.a) {
            objB0 = new F1(j81Var);
            j30VarQ.F0(objB0);
        }
        j30VarQ.R(false);
        LPt8Fixed lPt8 = new LPt8Fixed(context, j81Var);
        j30VarQ.e(1051087930);
        g82 g82VarJ = AY.J(new g4j(), new qh(context, (j81) objB0, lPt8), j30VarQ);
        j30VarQ.R(false);
        wq0.e(context, mz0Var, new QnHx(mz0Var, h81Var, g82VarJ, context, null), j30VarQ);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(context, mz0Var, h81Var, j81Var, i);
    }
}

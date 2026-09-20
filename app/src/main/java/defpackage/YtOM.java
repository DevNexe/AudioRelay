package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.azefsw.audioconnect.server.services.ServerService;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.AndroidServerEventHandler$startServerService$3", f = "AndroidServerEventHandler.kt", l = {82}, m = "invokeSuspend")
public final class YtOM extends px4 implements x81<ua0, z80<? super Boolean>, Object> {
    public int A;
    public final /* synthetic */ fcT B;

    public static final class QnHx extends cx1 implements j81<Boolean, sd5> {
        public final /* synthetic */ z80<Boolean> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(c24 c24Var) {
            super(1);
            this.w = c24Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Boolean bool) {
            this.w.x(Boolean.valueOf(bool.booleanValue()));
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YtOM(fcT fct, z80<? super YtOM> z80Var) {
        super(2, z80Var);
        this.B = fct;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new YtOM(this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        boolean z = true;
        if (i == 0) {
            C0239D.H(obj);
            fcT fct = this.B;
            this.A = 1;
            c24 c24Var = new c24(ps0.L(this));
            int i2 = ServerService.z;
            Context context = fct.a;
            QnHx qnHx = new QnHx(c24Var);
            synchronized (ie4.a) {
                if (ie4.b == null) {
                    z = false;
                }
                if (z) {
                    a62.a.e("start_already_pending");
                    qnHx.invoke(Boolean.FALSE);
                }
                a62.a.c("Starting ServerService...");
                ie4.b = qnHx;
                if (Build.VERSION.SDK_INT >= 26) {
                    context.startForegroundService(new Intent(context, (Class<?>) ServerService.class));
                } else {
                    context.startService(new Intent(context, (Class<?>) ServerService.class));
                }
            }
            obj = c24Var.a();
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
    public final Object invoke(ua0 ua0Var, z80<? super Boolean> z80Var) {
        return ((YtOM) a(ua0Var, z80Var)).i(sd5.a);
    }
}

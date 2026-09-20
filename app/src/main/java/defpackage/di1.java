package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.activity.ComponentActivity;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.idle.IdlePlayerEventHandler$handleEvent$2", f = "IdlePlayerEventHandler.kt", l = {47}, m = "invokeSuspend")
public final class di1 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ ei1 B;
    public final /* synthetic */ cu0<bi1, ai1, ci1> C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di1(ei1 ei1Var, cu0<bi1, ai1, ci1> cu0Var, z80<? super di1> z80Var) {
        super(2, z80Var);
        this.B = ei1Var;
        this.C = cu0Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new di1(this.B, this.C, z80Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        xq0 qnHx;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            try {
                ComponentActivity componentActivityX = FWT.x(this.B.a);
                if (componentActivityX != null) {
                    Intent intent = new Intent();
                    intent.setClassName("com.android.settings", "com.android.settings.TetherSettings");
                    componentActivityX.startActivity(intent);
                }
                qnHx = new xq0.CQf(sd5.a);
            } catch (ActivityNotFoundException e) {
                qnHx = new xq0.QnHx(e);
            }
            if (qnHx instanceof xq0.QnHx) {
                bi1.F1 f1 = new bi1.F1((Throwable) ((xq0.QnHx) qnHx).a);
                this.A = 1;
                if (this.C.n(f1, this) == va0Var) {
                    return va0Var;
                }
            } else {
                boolean z = qnHx instanceof xq0.CQf;
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
        return ((di1) a(ua0Var, z80Var)).i(sd5.a);
    }
}

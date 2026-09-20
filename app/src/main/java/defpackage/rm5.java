package defpackage;

import android.view.View;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {233}, m = "invokeSuspend")
public final class rm5 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ uk3 B;
    public final /* synthetic */ View C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm5(uk3 uk3Var, View view, z80<? super rm5> z80Var) {
        super(2, z80Var);
        this.B = uk3Var;
        this.C = view;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new rm5(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        uk3 uk3Var = this.B;
        View view = this.C;
        try {
            if (i == 0) {
                C0239D.H(obj);
                this.A = 1;
                Object objM = kd.m(uk3Var.o, new wk3(null), this);
                if (objM != obj2) {
                    objM = sd5.a;
                }
                if (objM == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            if (wm5.b(view) == uk3Var) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return sd5.a;
        } catch (Throwable th) {
            if (wm5.b(view) == uk3Var) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            throw th;
        }
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((rm5) a(ua0Var, z80Var)).i(sd5.a);
    }
}

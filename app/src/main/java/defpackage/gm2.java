package defpackage;

import androidx.activity.OnBackPressedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class gm2 extends cx1 implements h81<sd5> {
    public final /* synthetic */ im2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm2(im2 im2Var) {
        super(0);
        this.w = im2Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        OnBackPressedDispatcher onBackPressedDispatcherE;
        iu2 iu2Var = this.w.a;
        if (iu2Var != null && (onBackPressedDispatcherE = iu2Var.e()) != null) {
            onBackPressedDispatcherE.b();
        }
        return sd5.a;
    }
}

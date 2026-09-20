package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class iu3 extends cx1 implements j81<z11, Boolean> {
    public final /* synthetic */ j81<ju3, Boolean> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu3(AndroidComposeView.byN byn) {
        super(1);
        this.w = byn;
    }

    @Override // defpackage.j81
    public final Boolean invoke(z11 z11Var) {
        z11 z11Var2 = z11Var;
        if (z11Var2 instanceof ju3) {
            return this.w.invoke((ju3) z11Var2);
        }
        throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
    }
}

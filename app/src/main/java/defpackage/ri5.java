package defpackage;

import androidx.compose.ui.platform.QnHx;

/* JADX INFO: loaded from: classes.dex */
public final class ri5 extends cx1 implements h81<sd5> {
    public final /* synthetic */ byN w;
    public final /* synthetic */ QnHx x;
    public final /* synthetic */ v93 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri5(byN byn, QnHx qnHx, XTd3 xTd3) {
        super(0);
        this.w = byn;
        this.x = qnHx;
        this.y = xTd3;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        byN byn = this.w;
        byn.removeOnAttachStateChangeListener(this.x);
        o70.e(byn).a.remove(this.y);
        return sd5.a;
    }
}

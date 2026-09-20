package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class Ky implements yl0 {
    public final /* synthetic */ ba3 a;

    public Ky(ba3 ba3Var) {
        this.a = ba3Var;
    }

    @Override // defpackage.yl0
    public final void a() {
        ba3 ba3Var = this.a;
        k40 k40Var = ba3Var.y;
        if (k40Var != null) {
            k40Var.a();
        }
        ba3Var.y = null;
        ba3Var.requestLayout();
        ba3Var.setTag(R.id.view_tree_lifecycle_owner, null);
        ba3Var.I.removeViewImmediate(ba3Var);
    }
}

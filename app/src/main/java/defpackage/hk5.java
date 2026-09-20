package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class hk5 extends ga5 {
    public final /* synthetic */ ViewGroup w;
    public final /* synthetic */ View x;
    public final /* synthetic */ View y;
    public final /* synthetic */ ik5 z;

    public hk5(ik5 ik5Var, ViewGroup viewGroup, View view, View view2) {
        this.z = ik5Var;
        this.w = viewGroup;
        this.x = view;
        this.y = view2;
    }

    @Override // u95.LPt8Fixed
    public final void a(u95 u95Var) {
        this.y.setTag(R.id.save_overlay_view, null);
        this.w.getOverlay().remove(this.x);
        u95Var.E(this);
    }

    @Override // defpackage.ga5, u95.LPt8Fixed
    public final void b() {
        this.w.getOverlay().remove(this.x);
    }

    @Override // defpackage.ga5, u95.LPt8Fixed
    public final void e() {
        View view = this.x;
        if (view.getParent() == null) {
            this.w.getOverlay().add(view);
        } else {
            this.z.cancel();
        }
    }
}

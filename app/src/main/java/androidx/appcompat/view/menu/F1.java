package androidx.appcompat.view.menu;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class F1 implements Runnable {
    public final /* synthetic */ CQf.LPt8Fixed w;
    public final /* synthetic */ MenuItem x;
    public final /* synthetic */ NUlFixed y;
    public final /* synthetic */ CQf.F1 z;

    public F1(CQf.F1 f1, CQf.LPt8Fixed lPt8, YKK ykk, NUlFixed nUl) {
        this.z = f1;
        this.w = lPt8;
        this.x = ykk;
        this.y = nUl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CQf.LPt8Fixed lPt8 = this.w;
        if (lPt8 != null) {
            CQf.F1 f1 = this.z;
            CQf.this.W = true;
            lPt8.b.c(false);
            CQf.this.W = false;
        }
        MenuItem menuItem = this.x;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.y.p(menuItem, null, 4);
        }
    }
}

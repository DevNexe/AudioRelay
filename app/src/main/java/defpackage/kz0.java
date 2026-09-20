package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.ActionMode$Callback2;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class kz0 extends ActionMode$Callback2 {
    public final p15 a;

    public kz0(p15 p15Var) {
        this.a = p15Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.a.c(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.a.d(actionMode, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        h81 h81Var = (h81) this.a.w;
        if (h81Var != null) {
            h81Var.invoke();
        }
    }

    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        dl3 dl3Var = (dl3) this.a.B;
        if (rect != null) {
            rect.set((int) dl3Var.a, (int) dl3Var.b, (int) dl3Var.c, (int) dl3Var.d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.a.e(actionMode, menu);
    }
}

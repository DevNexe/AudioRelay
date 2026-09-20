package defpackage;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class y55 {
    public static final y55 a = new y55();

    public final void a(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(View view, ActionMode.Callback callback, int i) {
        return view.startActionMode(callback, i);
    }
}

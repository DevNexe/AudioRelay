package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a53 implements vb1 {
    public final View a;

    public a53(View view) {
        this.a = view;
    }

    @Override // defpackage.vb1
    public final void a() {
        this.a.performHapticFeedback(9);
    }
}

package defpackage;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class jk5 extends ImageButton {
    public int w;

    public final void b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.w = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.w;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        b(i, true);
    }
}

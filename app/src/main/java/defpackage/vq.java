package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class vq extends ClickableSpan {
    public final int w;
    public final UT x;
    public final int y;

    public vq(int i, UT ut, int i2) {
        this.w = i;
        this.x = ut;
        this.y = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.w);
        this.x.a.performAction(this.y, bundle);
    }
}

package defpackage;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.QnHx;

/* JADX INFO: loaded from: classes3.dex */
public final class mq extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public mq(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, Outline outline) {
        QnHx qnHx = this.a.A;
        if (qnHx != null) {
            qnHx.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}

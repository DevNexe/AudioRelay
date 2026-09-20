package defpackage;

import android.view.View;
import com.google.android.material.datepicker.F1;

/* JADX INFO: loaded from: classes3.dex */
public final class ca2 implements View.OnClickListener {
    public final /* synthetic */ F1 w;

    public ca2(F1 f1) {
        this.w = f1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        F1 f1 = this.w;
        int i = f1.t0;
        if (i == 2) {
            f1.P(1);
        } else if (i == 1) {
            f1.P(2);
        }
    }
}

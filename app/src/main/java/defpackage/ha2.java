package defpackage;

import android.view.View;
import com.google.android.material.datepicker.LPt8Fixed;

/* JADX INFO: loaded from: classes3.dex */
public final class ha2 implements View.OnClickListener {
    public final /* synthetic */ LPt8Fixed w;

    public ha2(LPt8Fixed lPt8) {
        this.w = lPt8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LPt8Fixed lPt8 = this.w;
        lPt8.U0.setEnabled(lPt8.J0.r());
        lPt8.S0.toggle();
        lPt8.W(lPt8.S0);
        lPt8.T();
    }
}

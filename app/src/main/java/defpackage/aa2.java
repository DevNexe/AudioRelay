package defpackage;

import android.view.View;
import com.azefsw.audioconnect.R;
import com.google.android.material.datepicker.F1;

/* JADX INFO: loaded from: classes3.dex */
public final class aa2 extends d_OZ {
    public final /* synthetic */ F1 d;

    public aa2(F1 f1) {
        this.d = f1;
    }

    @Override // defpackage.d_OZ
    public final void d(View view, UT ut) {
        this.a.onInitializeAccessibilityNodeInfo(view, ut.a);
        F1 f1 = this.d;
        ut.l(f1.y0.getVisibility() == 0 ? f1.I().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : f1.I().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
    }
}

package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.F1;
import com.google.android.material.datepicker.auxFixed;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class da2 implements View.OnClickListener {
    public final /* synthetic */ auxFixed w;
    public final /* synthetic */ F1 x;

    public da2(F1 f1, auxFixed auxVar) {
        this.x = f1;
        this.w = auxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        F1 f1 = this.x;
        int iF0 = ((LinearLayoutManager) f1.w0.getLayoutManager()).F0() + 1;
        if (iF0 < f1.w0.getAdapter().a()) {
            Calendar calendarB = lf5.b(this.w.d.w.w);
            calendarB.add(2, iF0);
            f1.O(new zg2(calendarB));
        }
    }
}
